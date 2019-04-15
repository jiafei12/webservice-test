package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 * 汽油车OBD检测过程数据
 * @author liuyh
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class GasolineCarOBDInfoDTO {

    /**
     * 全程时序（格式为YYYYMMDD24hmmss）
     */
    @XmlElement(name = "time")
    public Date fullTiming;

    /**
     * 节气门绝对开度(%)
     */
    @XmlElement(name = "jqmjdkd")
    public Integer throttleAbsoluteOpening;

    /**
     * 计算负荷值(%)
     */
    @XmlElement(name = "jsfhz")
    public Integer loadValue;

    /**
     * 前氧传感器信号（mv/ma）
     */
    @XmlElement(name = "qycgqxh")
    public Integer frontOxygenSensorsignal;

    /**
     * 过量空气系数（mv/ma）
     */
    @XmlElement(name = "glkqxs")
    public Integer ExcessAirRatio;

    /**
     * 车速(km/h)
     */
    @XmlElement(name = "vehicle_speed")
    public Integer vehicleSpeed;

    /**
     * 发动机转速（r/min）
     */
    @XmlElement(name = "rpm")
    public Integer rpm;

    /**
     * 进气量(g/s)
     */
    @XmlElement(name = "airinput")
    public Integer airInput;

    /**
     * 进气压力(kpa)
     */
    @XmlElement(name = "airinput_pressure")
    public Integer airInputpressure;
}
