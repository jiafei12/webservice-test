package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 实际诊断率数据
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class IUPRDTO {

    /**
     * 监测项目名称
     */
    @XmlElement(name = "name")
    public String name;


    /**
     * 监测完成次数
     */
    @XmlElement(name = "times")
    public Integer times;

    /**
     * 符合条件的监测次数
     */
    @XmlElement(name = "oktimes")
    public Integer oktimes;

    /**
     * iupr 率
     */
    @XmlElement(name = "iupr")
    public Integer iupr;
}
