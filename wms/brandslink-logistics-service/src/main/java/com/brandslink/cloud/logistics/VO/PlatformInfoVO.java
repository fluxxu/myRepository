package com.brandslink.cloud.logistics.VO;

import com.brandslink.cloud.logistics.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * 平台信息表
 * 实体类对应的数据表为：  t_platform_info
 * @author zhangjinglei
 * @date 2019-07-17 17:18:49
 */
@Data
@ApiModel(value ="PlatformInfoVO")
public class PlatformInfoVO extends BaseEntity implements Serializable {

    @ApiModelProperty(value = "顺序号")
    private Long id;

    @NotBlank(message = "平台编码不可为空")
    @Size(max = 50, message = "平台编码字符个数必须小于50")
    @ApiModelProperty(value = "平台编码")
    private String platformCode;

    @NotBlank(message = "平台名称不能为空")
    @Size(max = 100, message = "平台名称字符个数必须小于100")
    @ApiModelProperty(value = "平台名称")
    private String platformCn;

    @NotBlank(message = "平台英文名称不能为空")
    @Size(max = 100, message = "平台英文名称字符个数必须小于100")
    @ApiModelProperty(value = "平台英文名称")
    private String platformEn;

    @NotNull(message = "是否有效不能为空")
    @ApiModelProperty(value = "是否有效（1：是，2否）")
    private Byte isValid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_platform_info
     *
     * @mbg.generated 2019-07-17 17:18:49
     */
    private static final long serialVersionUID = 1L;
}