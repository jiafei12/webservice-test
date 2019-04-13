package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 稳态工况结果数据
 */
@XmlRootElement(name="result_data")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class SteadyConditionResultDTO {
}
