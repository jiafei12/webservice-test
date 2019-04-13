package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 双怠速数据
 * @author liuyh
 */
@XmlRootElement(name="result")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class TwoSpeedIdleDTO {

}
