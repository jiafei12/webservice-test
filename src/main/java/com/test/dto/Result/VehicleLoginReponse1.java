package com.test.dto.Result;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class VehicleLoginReponse1 {
    /**
     * 检测报告编号，检测数据上传需使用该编号上传
     */
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
