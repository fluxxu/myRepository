package com.brandslink.cloud.logistics.VO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 物流方式分区国家表
 * 实体类对应的数据表为：  t_method_zone_country
 *
 * @author zhangjinglei
 * @date 2019-07-23 11:08:16
 */
@Data
@ApiModel(value = "MethodZoneCountryVO")
public class MethodZoneCountryVO implements Serializable {

    @ApiModelProperty(value = "顺序号")
    private Long id;

    @ApiModelProperty(value = "关联邮寄方式表主键")
    private Long methodId;

    @ApiModelProperty(value = "关联分区时效运费表主键")
    private Long zoneId;

    @NotBlank(message = "国家编码不能为空")
    @ApiModelProperty(value = "国家编码")
    private String country;

    @NotBlank(message = "国家名称不能为空")
    @ApiModelProperty(value = "国家名称")
    private String countryName;

    @NotNull(message = "是否收取偏远费不能为空")
    @ApiModelProperty(value = "是否收取偏远费")
    private Byte isRemoteFee;

    @ApiModelProperty(value = "国家偏远地区数据集合")
    private List<CountryRemoteFeeVO> remoteList = new ArrayList<>();

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_method_zone_country
     *
     * @mbg.generated 2019-07-23 11:08:16
     */
    private static final long serialVersionUID = 1L;
}