package com.brandslink.cloud.common.filter;

import com.brandslink.cloud.common.utils.RequestWrapper;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 拦截防止xss注入
 * 通过Jsoup过滤请求参数内的特定字符
 * @author zzx
 */
public class XssFilter implements Filter {

    private static boolean IS_INCLUDE_RICH_TEXT = false;//是否过滤富文本内容

    public List<String> excludes = new ArrayList<String>();

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException,ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
         HttpServletResponse resp = (HttpServletResponse) response;
        if(handleExcludeURL(req, resp)){
            filterChain.doFilter(request, response);
            return;
        }
        RequestWrapper xssRequest = new RequestWrapper((HttpServletRequest) request, IS_INCLUDE_RICH_TEXT);
        filterChain.doFilter(xssRequest, response);
    }

    private boolean handleExcludeURL(HttpServletRequest request, HttpServletResponse response) {
        if (excludes == null || excludes.isEmpty()) {
            return false;
        }
        String url = request.getServletPath();
        for (String pattern : excludes) {
            Pattern p = Pattern.compile("^" + pattern);
            Matcher m = p.matcher(url);
            if (m.find()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String isIncludeRichText = filterConfig.getInitParameter("isIncludeRichText");
        if(StringUtils.isNotBlank(isIncludeRichText)){
            IS_INCLUDE_RICH_TEXT = BooleanUtils.toBoolean(isIncludeRichText);
        }
        String temp = filterConfig.getInitParameter("excludes");
        if (temp != null) {
            String[] url = temp.split(",");
            for (int i = 0; url != null && i < url.length; i++) {
                excludes.add(url[i]);
            }
        }
    }

    @Override
    public void destroy() {}

}
