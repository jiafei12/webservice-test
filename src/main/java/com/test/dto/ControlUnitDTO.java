package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *  柴油车/汽油车 OBD控制单元
 *  @author liuyh
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class ControlUnitDTO {

    /**
     * obd 控制单元名称
     */
    @XmlElement(name = "obd_con_name")
    public String obdControlUnitName;

    /**
     * obd 控制单元 calid
     */
    @XmlElement(name = "calid")
    public String calId;

    /**
     * obd 控制单元 cvn
     */
    @XmlElement(name = "cvn")
    public String cvn;

}
