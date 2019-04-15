package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 * 双怠速检测过程数据
 *
 * @author liuyh
 */
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class TwoSpeedIdleInfoDTO {

    /**
     * 全程时序（格式为YYYYMMDD24hmmss）
     */
    @XmlElement(name = "time")
    public Date fullTiming;

    /**
     * 工况类型：
     * 0-70%额定转速、1-高怠速准备、
     * 2-高怠速检测,、3-怠速准备、
     * 4-怠速检测
     */
    @XmlElement(name = "idle_type")
    public String idleType;

    /**
     * 采样时序（1 开始的序号，1秒一个数据）
     */
    @XmlElement(name = "time_no")
    public Integer sampleTiming;

    /**
     * HC 测量值
     */
    @XmlElement(name = "hc")
    public Integer hc;

    /**
     * CO 测量值
     */
    @XmlElement(name = "co")
    public Integer co;

    /**
     * 油温实时值
     */
    @XmlElement(name = "ywssz")
    public Integer oilTemperature;

    /**
     * 环境温度
     */
    @XmlElement(name = "hjwd")
    public Double ambientTemperature;

    /**
     * 相对湿度
     */
    @XmlElement(name = "xdsd")
    public Double humidity;

    /**
     * 大气压力
     */
    @XmlElement(name = "dqy")
    public Double atomsphere;

    /**
     * O2 测量值
     */
    @XmlElement(name = "o2")
    public Integer oxygen;

    /**
     * CO2 测量值
     */
    @XmlElement(name = "co2")
    public Integer carbonDioxide;

    /**
     * 过量空气系数
     */
    @XmlElement(name = "p_lambda")
    public Integer pLambda;

    /**
     * 转速
     */
    @XmlElement(name = "rpm")
    public Integer rpm;
}
