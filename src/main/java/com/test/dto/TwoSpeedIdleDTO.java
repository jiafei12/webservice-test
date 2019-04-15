package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * 双怠速数据
 *
 * @author liuyh
 */
@XmlRootElement(name = "result")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class TwoSpeedIdleDTO {
    @XmlElement(name = "result_data")
    public TwoSpeedIdleResultDTO twoSpeedIdleResultDTO;
    @XmlElement(name = "process_data")
    public List<TwoSpeedIdleInfoDTO> twoSpeedIdleInfoDTOList;
}
