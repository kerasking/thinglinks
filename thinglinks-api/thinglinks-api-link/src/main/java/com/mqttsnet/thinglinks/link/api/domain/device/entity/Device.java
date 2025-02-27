package com.mqttsnet.thinglinks.link.api.domain.device.entity;

import com.mqttsnet.thinglinks.common.core.web.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**

* @Description:    设备管理
* @Author:         ShiHuan Sun
* @E-mail:         13733918655@163.com
* @Website:        http://thinglinks.mqttsnet.com
* @CreateDate:     2021/12/26$ 1:42$
* @UpdateUser:     ShiHuan Sun
* @UpdateDate:     2021/12/26$ 1:42$
* @UpdateRemark:   修改内容
* @Version:        1.0

*/

/**
 * 设备管理
 */
@ApiModel(value = "设备管理")
@Data
public class Device  extends BaseEntity implements Serializable{
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * 客户端标识
     */
    @ApiModelProperty(value = "客户端标识")
    private String clientId;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String userName;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 应用ID
     */
    @ApiModelProperty(value = "应用ID")
    private String appId;

    /**
     * 认证方式
     */
    @ApiModelProperty(value = "认证方式")
    private String authMode;

    /**
     * 设备标识
     */
    @ApiModelProperty(value = "设备标识")
    private String deviceIdentification;

    /**
     * 设备名称
     */
    @ApiModelProperty(value = "设备名称")
    private String deviceName;

    /**
     * 连接实例
     */
    @ApiModelProperty(value = "连接实例")
    private String connector;

    /**
     * 设备描述
     */
    @ApiModelProperty(value = "设备描述")
    private String deviceDescription;

    /**
     * 设备状态： 启用 || 禁用
     */
    @ApiModelProperty(value = "设备状态： 启用 || 禁用")
    private String deviceStatus;

    /**
     * 连接状态 : 在线：online || 离线：offline || 未连接：ununited
     */
    @ApiModelProperty(value = "连接状态 : 在线：online || 离线：offline || 未连接：ununited,")
    private String connectStatus;

    /**
     * 是否遗言
     */
    @ApiModelProperty(value = "是否遗言")
    private String isWill;

    /**
     * 设备标签
     */
    @ApiModelProperty(value = "设备标签")
    private String deviceTags;

    /**
     * 产品型号
     */
    @ApiModelProperty(value = "产品型号")
    private String productId;

    /**
     * 厂商ID
     */
    @ApiModelProperty(value = "厂商ID")
    private String manufacturerId;

    /**
     * 产品协议类型 ：mqtt || coap || modbus || http
     */
    @ApiModelProperty(value = "产品协议类型 ：mqtt || coap || modbus || http")
    private String protocolType;

    /**
     * 设备类型
     */
    @ApiModelProperty(value = "设备类型")
    private String deviceType;


    private static final long serialVersionUID = 1L;
}
