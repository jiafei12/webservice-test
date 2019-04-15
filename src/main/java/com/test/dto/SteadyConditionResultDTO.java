package com.test.dto;

import com.sun.org.apache.xml.internal.utils.StringVector;
import lombok.Data;
import org.apache.tools.ant.types.resources.selectors.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 稳态工况结果数据
 */
@XmlRootElement(name = "result_data")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class SteadyConditionResultDTO {
    /**
     * 检测编号(由接口下发)
     */
    @XmlElement(name = "check_id")
    public String checkNumber;

    /**
     * 检测类型：1 年检；2 新注册车辆；
     * 3 外地车转入；  4 实验比对；
     * 5 政府部门监督抽查的复检
     */
    @XmlElement(name = "check_type")
    public String checkType;

    /**
     * 检测所在地编码
     */
    @XmlElement(name = "city_code")
    public String areaCode;

    /**
     * 检测机构编号（由平台提供）
     */
    @XmlElement(name = "unit_id")
    public String organizationNumber;

    /**
     * 检测线编号（由平台提供）
     */
    @XmlElement(name = "line_id")
    public String detectionLineNumber;

    /**
     * 检测用户登录名（由平台提供)
     */
    @XmlElement(name = "user_id")
    public String userLoginName;

    /**
     * 车辆编码
     */
    @XmlElement(name="vehicle_id")
    public String vehicleCode;

    /**
     * 车架号
     */
    @XmlElement(name="vin")
    public String vin;

    /**
     * 车牌
     */
    @XmlElement(name = "plate")
    public String licensePlate;

    /**
     * 检测日期（yyyy-mm-dd)
     */
    @XmlElement(name = "check_date")
    public Date checkDate;

    /**
     * 检测周期开始日期(yyyy-mm)
     */
    @XmlElement(name = "period_start_date")
    public Date checkPeriodStartData;

    /**
     * 检测周期结束日期(yyyy-mm)
     */
    @XmlElement(name = "period_end_date")
    public Date checkPeriodEndData;

    /**
     * 检测开始时间，精确到秒
     * （yyyy-mm-dd hh24:mi:ss）
     */
    @XmlElement(name = "start_time")
    public Date checkStartTime;

    /**
     * 检测结束时间, 精确到秒
     * （yyyy-mm-dd hh24:mi:ss）
     */
    @XmlElement(name = "end_time")
    public Date checkEndTime;

    /**
     * 环境温度（°C）
     */
    @XmlElement(name = "temperature")
    public Double ambientTemperature;

    /**
     * 大气压（kPa）
     */
    @XmlElement(name = "pressure")
    public Double atomsphere;

    /**
     * 相对湿度（%）
     */
    @XmlElement(name = "humidity")
    public Double humidity;

    /**
     * 5025 co 测量结果（%）
     */
    @XmlElement(name = "co_5025")
    public Double co5025;

    /**
     * 5025 工况 co 检测限值（%）
     */
    @XmlElement(name = "co_5025_limit")
    public Integer co5025Limit;

    /**
     * 5025 工况 co 检测结果：
     * 0：不合格 1：合格
     */
    @XmlElement(name = "co_5025_passed")
    public String co5025Passed;

    /**
     * 5025 hc 测量结果(10-6)
     */
    @XmlElement(name = "hc_5025")
    public Integer hc5025;


    /**
     * 5025 hc 测量结果(10-6)
     */
    @XmlElement(name = "hc_5025_limit")
    public Integer hc5025Limit;

    /**
     * 5025 工况 hc 检测结果：
     * 0：不合格 1：合格
     */
    @XmlElement(name = "hc_5025_limit")
    public String hc5025Passed;

    /**
     * 5025 no 测量结果(10-6)
     */
    @XmlElement(name = "no_5025")
    public Integer no5025;

    /**
     * 5025 工 况 no 检测限值(10-6)
     */
    @XmlElement(name = "no_5025_limit")
    public Integer no5025limit;

}
