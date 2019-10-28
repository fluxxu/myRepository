package com.rondaful.cloud.seller.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.rondaful.cloud.seller.vo.EmpowerSearchVO;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

import com.rondaful.cloud.common.entity.Page;
import com.rondaful.cloud.seller.entity.Empower;
import com.rondaful.cloud.seller.vo.EmpowerVo;


public interface EmpowerMapper {

	/**
	 * 全部的账号id和名称
	 * @return
	 */
	List<Empower> getEmpowerAll(@Param("platform")Integer platform,@Param("status")Integer status,@Param("pinlianId")Integer pinlianId);


	/**
	 * 查询所有数据
	 * @param empower
	 * @return
	 */
	List<Empower> getEmpowerVO(EmpowerSearchVO vo);

	/**
	 * 是否到期
	 * @return
	 */
	Integer checkEndTime();

	/**
	 * 修改到期时间
	 * @return
	 */
	Integer updateEndTime();

	/**
	 * 店铺名称是否重复
	 * @param accounts
	 * @param platform
	 * @return
	 */
	List<Empower> checkEmpowerAccounts(@Param("accounts")List<String> accounts, @Param("platform")Integer platform,@Param("pinlianId")Integer pinlianId,@Param("types")Integer types);


	/**
	 * 店铺名称是否重复
	 * @param accounts
	 * @param platform
	 * @return
	 */
	List<Empower> checkEmpowerAccount(@Param("account")String account, @Param("platform")Integer platform,@Param("empowerId")Integer empowerId);


	Integer checkAccountWebName(@Param("webName")String webName, @Param("thirdPartyName")String thirdPartyName,@Param("empowerId")Integer empowerId);
	/**
	 * amazon亚马逊验证站点店铺是否重复
	 * @param webNames
	 * @param thirdPartyName
	 * @return
	 */
	List<Empower> getEmpowerByWebName(@Param("webNames")List<String> webNames,@Param("thirdPartyName")String thirdPartyName,@Param("pinlianId")Integer pinlianId,@Param("types")Integer types);



	/**
	 * 店铺名称是否重复
	 * @param account
	 * @param platform
	 * @return
	 */
	List<Empower> checkEmpowerAccountUserId(@Param("account")String account, @Param("platform")Integer platform,@Param("refreshToken")String refreshToken,@Param("empowerId")Integer empowerId);


	/**
	 * 验证PayPal账号是否重复
	 * @return
	 */
	Integer checkEmpowerPaypal(@Param("empowerId")Integer empowerId,@Param("paypalAccount01") String paypalAccount01,
			@Param("paypalAccount02") String paypalAccount02);


	Empower getEmpowerById(Integer empowerId);


	List<Empower> sendMsgEmpower(@Param("status")int status);


	/**
	 * 授权数据插入
	 * @param empower
	 * @return
	 */
	Integer insertObjectSelective(Empower empower);
	
	
	
	/**
	 * 通过账号（自定义名称）查询授权信息
	 * @param account
	 * @param status 
	 * @return
	 */
	List<Empower> selectObjectByAccount(
            @Param("empowerId")Integer empowerId,
            @Param("pinlianAccount")String pinlianAccount, 
            @Param("status")Integer status,
            @Param("account")String account,
            @Param("platform")Integer platform,
			@Param("pinlianId")Integer pinlianId);


	
	List<Empower>  selectObjectByAccountDataLimit(Empower empower);
	

	/**
	 * 通过平台， 平台账号 ， 可能再加上站点来查询授权id
	 * @param empower 授权对象，封装参数
	 * @return 授权对象
	 */
	Empower selectOneByAcount(Empower empower);
	
	
	/**
	 * 通过品连账号查询店铺信息
	 * @param pinlianAccounts
	 * @return
	 */
	List<EmpowerVo> selectInfoByAccounts(List<String> pinlianAccounts);
	
	
	/**
	 * 通过品连id查询店铺信息
	 * @param pinlianId
	 * @return
	 */
	List<EmpowerVo> selectInfoByUserIds(List<Integer> pinlianIds);
	
	
	
	
	/**
	 * 通过品连ID查询店铺信息
	 * @param pinlianAccounts
	 * @return
	 */
	List<Empower> selectInfoByIds(List<Integer>  id);


	
	/**
	 * 查询所有数据
	 * @param empower
	 * @return
	 */
	List<Empower> findAll(Empower empower);


	
	
	/**
	 * 查询所有数据2
	 * @param platform
	 * @Param status
	 * @return
	 */
	List<Empower> findAllRemote(@Param("platform") Integer platform,@Param("status")Integer status);
	
	
	
	/**
	 * 根据账号将token写入数据库
	 * @param empower
	 * @param account
	 * @return
	 */
	int insertTokenEbay(@Param("createTime")Date createTime,
			            @Param("endTime")Date endTime, 
			            @Param("token")String token,
			            @Param("account")String account);
	
	
	
	/**
	 * 修改授权状态
	 * @param empowerId
	 * @return
	 */
	int updateStatusByAccount(@Param("account")String account,@Param("status")Integer status);
	
	
	/**
	 * 通过用户id查询token
	 * @param sellerId
	 * @return
	 */
	String getToken(Integer sellerId);
	
	
	
	/**
	 * 查询当前账户下的账号
	 * @return
	 */
	List<String> selectAccounts(String pinlianAccount);
	
	
	
	/**
	 * 查询所有账户
	 * @return
	 */
	List<String> selectAllAccounts();
	
	
	/**
	 * 查询当前账户外的店铺账号
	 * @return
	 */
	List<String> selectOtherAccounts(Integer empowerId);
	
	
	
	/**
	 * 校验有无重复授权信息
	 * @param webName
	 * @param thirdPartyName
	 * @return
	 */
	Integer checkAccount(@Param("webName")String webName,@Param("thirdPartyName")String thirdPartyName);
	
	
	
	/**
	 * 店铺重新授权
	 * @param empower
	 * @return
	 */
	Integer updateSelective(Empower empower);
	
	
    List<Empower> page(Empower t);
	
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empower
     *
     * @mbg.generated Tue Nov 27 09:33:02 CST 2018
     */
    int deleteByPrimaryKey(Integer empowerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empower
     *
     * @mbg.generated Tue Nov 27 09:33:02 CST 2018
     */
    int insert(Empower empower);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empower
     *
     * @mbg.generated Tue Nov 27 09:33:02 CST 2018
     */
    int insertSelective(Empower empower);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empower
     *
     * @mbg.generated Tue Nov 27 09:33:02 CST 2018
     */
    Empower selectByPrimaryKey(String empowerid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empower
     *
     * @mbg.generated Tue Nov 27 09:33:02 CST 2018
     */
    int updateByPrimaryKeySelective(Empower record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empower
     *
     * @mbg.generated Tue Nov 27 09:33:02 CST 2018
     */
    int updateByPrimaryKey(Empower record);
    
    /**
     * 
     * @param t
     * @return
     */
    Empower selectAmazonAccount(Empower t);


	/**
	 * 查询亚马逊在线授权，并按照站点作为一级排序（用以将不同的站点的相同亚马逊卖家ID分隔开来）
	 * @return 排序的授权ID
	 */
    List<Empower> getAmazonEmpowerOrderByWebName();



	List<Empower> getEmpowerByIds(@Param("empowerIds") List<Integer> empowerIds);

}