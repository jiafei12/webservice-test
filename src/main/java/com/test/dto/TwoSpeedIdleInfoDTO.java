package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
    public Date entireTime;


}
