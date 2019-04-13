package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
//TODO:补充备注
/**
 *  双怠速检测结果数据
 */
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class TwoSpeedIdleResultDTO {
    /**
     * 检测编号(由接口下发)
     */
    @XmlElement(name="check_id")
    public String checkNumber;
    /**
     * 检测类型：1 年检；2 新注册 车辆；3 外地车转入；
     * 4 实验比对    5 政府部门监督抽查的复检
     */
    @XmlElement(name="check_type")
    public String checkType;

    /**
     * 检测所在地编码
     */
    @XmlElement(name="city_code")
    public String areaCode;

    /**
     * 检测机构编号（由平台提供）
     */
    @XmlElement(name="unit_id")
    public String organizationNumber;

    /**
     * 检测线编号（由平台提供）
     */
    public String detectionLineNumber;

    /**
     * 检测用户登录名（由平台提供)
     */
    public String userLoginName;

    /**
     * 车辆编码
     */
    public String vehicleCode;
    /**
     * 车架号
     */
    public String vin;
}
