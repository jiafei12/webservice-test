package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 汽油车OBD检测数据
 * @author liuyh
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class GasolineCarOBDDTO {


}
