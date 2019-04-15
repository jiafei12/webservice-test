package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 * 不透光烟度法检测过程数据
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class OpaqueSmokeInfoDTO {

    /**
     * 全程时序（格式为YYYYMMDD24hmmss）
     */
    @XmlElement(name = "time")
    public Date fullTiming;

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
     * 油温
     */
    @XmlElement(name = "yw")
    public Integer oilTemperature;

    /**
     * K 值
     */
    @XmlElement(name = "kz")
    public Integer kValue;

    /**
     * N 值
     */
    @XmlElement(name = "nz")
    public Integer nValue;

    /**
     * 环境温度
     */
    @XmlElement(name = "hjwd")
    public Integer ambientTemperature;

    /**
     * 相对湿度
     */
    @XmlElement(name = "xdsd")
    public Integer humidity;

    /**
     * 大气压
     */
    @XmlElement(name = "dqy")
    public Integer atomsphere;

    /**
     * 状 态:
     * 0: 第一次吹拂   1:第二次吹拂   2:第三次吹拂 3:第一次自由加速
     * 4:第二次自由加速     5:第三次自由加速   6:第四次自由加速
     */
    @XmlElement(name = "state")
    public Integer state;
}
