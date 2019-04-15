package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 * 柴油车OBD检测过程数据
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class DieselCarOBDInfoDTO {

    /**
     * 全程时序（格式为YYYYMMDD24hmmss）
     */
    @XmlElement(name = "time")
    public Date fullTiming;

    /**
     * 油门开度(%)
     */
    @XmlElement(name = "throttlePosition")
    public Integer throttlePosition;

    /**
     * 车速(km/h)
     */
    @XmlElement(name = "vehicle_speed")
    public Integer vehicleSpeed;

    /**
     * 发动机输出功率(kw)
     */
    @XmlElement(name = "power")
    public Integer power;

    /**
     * 发动机转速（r/min）
     */
    @XmlElement(name = "rpm")
    public Integer rpm;

    /**
     * 进气量(g/s)
     */
    @XmlElement(name = "airinput")
    public Integer airInput;

    /**
     * 增压压力(kpa)
     */
    @XmlElement(name = "boost_pressure")
    public Integer boostPressure;

    /**
     * 耗油量(L/100km)
     */
    @XmlElement(name = "oilconsumption")
    public Integer oilConsumption;

    /**
     * 氮氧传感器浓度（ppm）
     */
    @XmlElement(name = "nosensornd")
    public Integer noSensorConcentration;

    /**
     * 尿素喷射量（L/H）
     */
    @XmlElement(name = "urea_in_volume")
    public Integer ureaInVolume;
}
