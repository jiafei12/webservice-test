package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 错误代码
 * @author liuyh
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class TroubleCodeDTO {
    /**
     * 故障代码
     */
    @XmlElement(name = "troubleid")
    public String troubleId;

    /**
     * mil 灯点亮后的行驶里程
     */
    @XmlElement(name = "milodo")
    public String milodo;

    /**
     * 故障诊断描述
     */
    @XmlElement(name = "trouble_desc")
    public String troubleDescription;

}
