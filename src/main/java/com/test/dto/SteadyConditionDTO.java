package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * 稳态工况数据
 */
@XmlRootElement(name="result")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class SteadyConditionDTO {
    public SteadyConditionResultDTO steadyConditionResultDTO;
    public List<SteadyConditionInfoDTO> steadyConditionInfoDTOList;
}
