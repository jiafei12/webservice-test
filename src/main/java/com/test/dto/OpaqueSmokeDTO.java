package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * 不透光烟度法检测
 * @author liuyh
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class OpaqueSmokeDTO {
    @XmlElement(name = "result_data")
    public OpaqueSmokeResultDTO opaqueSmokeResultDTO;
    @XmlElement(name = "process_data")
    public List<OpaqueSmokeInfoDTO> opaqueSmokeInfoDTOList;
}
