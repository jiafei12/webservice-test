package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 * 加载减速过程数据
 * @author liuyh
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class LugDownInfoDTO {

    /**
     * 全程时序（格式为YYYYMMDD24hmmss）
     */
    @XmlElement(name = "time")
    public Date fullTiming;

    /**
     * 工况类型：
     * 0-功率扫描中， 1-恢复到 100%VelMaxHP 过程，
     * 2-100%VelMaxHP 点检验过程， 4-80%VelMaxHP 点检验过程
     */
    @XmlElement(name = "idle_type")
    public String idleType;

    /**
     * 实测车速（km/h）
     */
    @XmlElement(name = "vehicle_speed")
    public Integer vehicleSpeed;

    /**
     * 采样时序（1 开始的序号，1秒一个数据）
     */
    @XmlElement(name = "time_no")
    public Integer sampleTiming;

    /**
     * 转速
     */
    @XmlElement(name = "rpm")
    public Integer rpm;


    /**
     * 测功机载荷 (kw)
     */
    @XmlElement(name = "dynamometer_load")
    public Integer dynamometerLoad;

    /**
     * 测功机扭矩（Nm）
     */
    @XmlElement(name = "cgjnnj")
    public Integer dynamometerTorque;

    /**
     * 光吸收系数（k/m-1）
     */
    @XmlElement(name = "light_absorption")
    public Integer lightAbsorption;

    /**
     * 二氧化碳浓度（%）
     */
    @XmlElement(name = "co2_nd")
    public Integer co2Concentration;

    /**
     * 氮氧化物浓度（x10-6）
     */
    @XmlElement(name = "nox")
    public Integer nox;
}
