package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 * 汽油车OBD检测结果数据（与柴油车保持一致）
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class GasolineCarOBDResultDTO {
    /**
     * 检测所在地编码
     */
    @XmlElement(name = "city_code")
    public String areaCode;

    /**
     * 检测机构编号（由平台提供）
     */
    @XmlElement(name = "unit_id")
    public String organizationNumber;

    /**
     * 检测用户登录名
     */
    @XmlElement(name = "uid")
    public String loginUserName;
    /**
     * 用户密码（由监管平台管理员提供）
     */
    @XmlElement(name = "pwd")
    public String loginPwd;

    /**
     * 车架号/车辆识别号码
     */
    @XmlElement(name = "clsbdh")
    public String vin;

    /**
     * 车辆型号
     */
    @XmlElement(name = "clxh")
    public String vehicleModel;

    /**
     * 车牌
     */
    @XmlElement(name = "plate")
    public String licensePlate;

    /**
     * 检查日期
     */
    @XmlElement(name = "check_date")
    public Date checkDate;

    /**
     * 车辆里程数
     */
    @XmlElement(name = "odometer")
    public Double odoMeter;

    /**
     * 要求标准（如 EOBD,OBDII等）
     */
    @XmlElement(name = "obdstand")
    public String obdStandard;

    /**
     * 通讯结果:
     * 0：成功 1：通讯不成功
     */
    @XmlElement(name = "communication")
    public String communicationResults;

    /**
     * 通讯不成功描述:
     * 0：接口损坏   1：找不到接口
     * 2：连接后不能通讯
     */
    @XmlElement(name = "communicationDescription")
    public String communicationDescription;

    /**
     * 就绪状态 ：
     * 0：未就绪 1：就绪
     */
    @XmlElement(name = "isready")
    public String readyState;

    /**
     * 就绪失败项目 ：
     * 0：SCR 1：POC 2:DOC
     * 3:DPF 4:EGR(可组合，多个之间用英文逗号分隔)
     */
    @XmlElement(name = "isreadyfailitem")
    public String readyFailItem;

    /**
     * 检测结果：
     * 0：不合格 1：合格 2：中止 3：无效
     */
    @XmlElement(name = "passed")
    public String checkResult;
}
