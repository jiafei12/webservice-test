package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * 柴油车OBD检测
 * @author liuyh
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class DieselCarOBDDTO {
    @XmlElement(name = "result_data")
    public DieselCarOBDResultDTO dieselCarOBDResultDTO;
    @XmlElement(name = "process_data")
    public List<DieselCarOBDInfoDTO> dieselCarOBDInfoDTOS;
    @XmlElement(name = "trou_data")
    public TroubleCodeDTO troubleCodeDTO;
    @XmlElement(name = "cal_data")
    public ControlUnitDTO controlUnitDTO;
    @XmlElement(name = "iupr_data")
    public IUPRDTO iuprDTO;
}
