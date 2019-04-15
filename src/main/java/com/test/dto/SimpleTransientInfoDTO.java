package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 * 简易瞬态工况过程数据
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class SimpleTransientInfoDTO {

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
     * 转速
     */
    @XmlElement(name = "rpm")
    public Integer rpm;

    /**
     * hc 实时值（ppm）
     */
    @XmlElement(name = "hc")
    public Integer hc;

    /**
     * co 实时值（%）
     */
    @XmlElement(name = "co")
    public Integer co;

    /**
     * co2 实时值（%）
     */
    @XmlElement(name = "co2")
    public Integer o2;

    /**
     * no 实时值（ppm）
     */
    @XmlElement(name = "no")
    public Integer no;

    /**
     * 环境 o2 浓度（%）
     */
    @XmlElement(name = "o2_ppb")
    public Integer o2Concentration;

    /**
     * 分析仪 o2 实时值（%）
     */
    @XmlElement(name = "o2_analyzer")
    public Integer o2Analyzer;

    /**
     * 流量计 o2 实时值（%）
     */
    @XmlElement(name = "o2_fg")
    public Integer o2FlowMeter;

    /**
     * hc 排放质量（mg/s)
     */
    @XmlElement(name = "hc_emission")
    public Integer hcEmission;

    /**
     * co 排放质量（mg/s)
     */
    @XmlElement(name = "co_emission")
    public Integer coEmission;

    /**
     * NOx 排放质量（mg/s）
     */
    @XmlElement(name = "nox_emission")
    public Integer noxEmission;

    /**
     * 标准时速（Km/h）
     */
    @XmlElement(name = "standard_speed")
    public Integer standardSpeed;

    /**
     * 标准时速（Km/h）
     */
    @XmlElement(name = "rtSpeed")
    public Integer rtSpeed;


    /**
     * 加载功率（kW）
     */
    @XmlElement(name = "loading_power")
    public Integer loadingPower;

    /**
     * 流量计温度
     */
    @XmlElement(name = "fg_temp")
    public Integer fgTemp;

    /**
     * 实际体积流量（L/s）
     */
    @XmlElement(name = "actual_volume_flow")
    public Integer actualVolumeFlow;

    /**
     * 标准体积流量（L/s）
     */
    @XmlElement(name = "standard_volume_flow")
    public Integer standardVolumeFlow;

    /**
     * 湿度修正系数
     */
    @XmlElement(name = "humidity_cc")
    public Integer humidityFixed;

    /**
     * 稀释修正系数
     */
    @XmlElement(name = "dilute_cc")
    public Integer diluteFixed;

    /**
     * 稀释比
     */
    @XmlElement(name = "dilution_ratio")
    public Integer dilutionRatio;

    /**
     * 分析仪管路压力（kPa）
     */
    @XmlElement(name = "analyzer_pipe_pressure")
    public Integer analyzerPipePressure;

    /**
     * 尾气实际排放流量（L/s）
     */
    @XmlElement(name = "exhaust_emissions")
    public Integer exhaustemission;


}
