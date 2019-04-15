package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * 加载减速结果
 * @author   liuyh
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class LugDownDTO {
    @XmlElement(name = "result_data")
    public LugDownResultDTO lugDownResultDTO;
    @XmlElement(name = "process_data")
    public List<LugDownInfoDTO> lugDownInfoDTOList;
}
