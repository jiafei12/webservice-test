package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * 稳态工况法过程数据
 */
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class SteadyConditionInfoDTO {

    /**
     * 全程时序（格式为YYYYMMDD24hmmss）
     */
    @XmlElement(name = "time")
    public Date fullTiming;

    /**
     * 工况类型：
     * 0-检验准备、 1-5025 工况、
     * 2-2540 工况、 3-加速过程
     */
    @XmlElement(name = "idle_type")
    public String idleType;

    /**
     * 采样时序（1 开始的序号，1秒一个数据）
     */
    @XmlElement(name = "time_no")
    public Integer sampleTiming;

    /**
     * 车速
     */
    @XmlElement(name = "vehicle_speed")
    public Integer vehicleSpeed;


    /**
     * 加载扭矩
     */
    @XmlElement(name = "torque")
    public Integer torque;

    /**
     * 实测加载功率
     */
    @XmlElement(name = "power")
    public Integer loadPower;

    /**
     * 湿度修正系数
     */
    @XmlElement(name = "sdxzxs")
    public Integer humidityCorrectionFactor;

    /**
     * 稀释修正系数
     */
    @XmlElement(name = "xsxzxs")
    public Double dilutionCorrectionFactor;

    /**
     * co 测量值,未经稀释修正(%)
     */
    @XmlElement(name = "co")
    public Double co;

    /**
     * co2 测量值(%)
     */
    @XmlElement(name = "co2")
    public Double carbonDioxide;

    /**
     * hc 测量值,未经稀释修正(10-6)
     */
    @XmlElement(name = "hc")
    public Integer hc;

    /**
     * no 测量值，未经稀释修正 (10-6)
     */
    @XmlElement(name = "no")
    public Integer no;


    /**
     * o2 测量值(%)
     */
    @XmlElement(name = "o2")
    public Integer oxygen;

    /**
     * co 修正后值,经稀释修正(%)
     */
    @XmlElement(name = "coa")
    public Integer coFixed;

    /**
     * hc 修正后值,经稀释修正(10-6)
     */
    @XmlElement(name = "hca")
    public Integer hcFixed;

    /**
     * no 修正后值，经稀释修正(10-6)
     */
    @XmlElement(name = "noa")
    public Integer noFixed;

    /**
     * 过量空气系数
     */
    @XmlElement(name = "lambda")
    public Integer lambda;

    /**
     * 转速
     */
    @XmlElement(name = "rpm")
    public Integer rpm;
}
