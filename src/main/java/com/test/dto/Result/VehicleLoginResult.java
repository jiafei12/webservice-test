package com.test.dto.Result;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
public class VehicleLoginResult {
    /**
     * 方法调用结果： 0---失败  1---成功
     */
    @XmlElement(name = "status")
    public String status;
    /**
     * 方法调用信息
     */
    @XmlElement(name = "message")
    public String message;
    /**
     * 检测报告编号，检测数据上传需使用该编号上传
     */
    @XmlElement(name = "checkid")
    public String checkNumber;

    /**
     * 车架号
     */
    @XmlElement(name = "vin")
    public String vin;

    /**
     * 车辆编码
     */
    @XmlElement(name = "vehicleid")
    public String vehicleCode;

    /**
     * 车牌号
     */
    @XmlElement(name = "plate")
    public String licensePlate;
}
