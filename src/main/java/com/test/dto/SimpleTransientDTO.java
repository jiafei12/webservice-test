package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * 简易瞬态工况数据
 *
 * @author liuyh
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class SimpleTransientDTO {
    @XmlElement(name = "result_data")
    public SimpleTransientResultDTO simpleTransientResultDTO;
    @XmlElement(name = "process_data")
    public List<SimpleTransientInfoDTO> simpleTransientInfoDTOList;

}
