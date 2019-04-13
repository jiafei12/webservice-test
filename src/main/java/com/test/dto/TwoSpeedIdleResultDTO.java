package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

//TODO:补充备注
/**
 *  双怠速检测结果数据
 */
@XmlRootElement(name="result_data")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class TwoSpeedIdleResultDTO {
    public TwoSpeedIdleResultDTO twoSpeedIdleResultDTO;
    public List<TwoSpeedIdleInfoDTO> twoSpeedIdleInfoDTOList;
}
