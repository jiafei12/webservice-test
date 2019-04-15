package com.test.dto;

import lombok.Data;
import org.apache.tools.ant.types.resources.selectors.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 简易瞬态工况结果数据
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class SimpleTransientResultDTO {
    /**
     * 检测编号(由接口下发)
     */
    @XmlElement(name = "check_id")
    public String checkNumber;

    /**
     * 检测类型：1 年检；2 新注册 车辆；3 外地车转入；
     * 4 实验比对    5 政府部门监督抽查的复检
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
    public String detectionLineNumber;

    /**
     * 检测用户登录名（由平台提供)
     */
    public String userLoginName;

    /**
     * 车辆编码
     */
    @XmlElement(name = "vehicle_id")
    public String vehicleCode;

    /**
     * 车架号
     */
    @XmlElement(name = "vin")
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
     * HC 排放限值（g/km）
     */
    @XmlElement(name = "hclimit")
    public Integer hcLimit;

    /**
     * CO 排放限值（g/km）
     */
    @XmlElement(name = "colimit")
    public Integer coLimit;

    /**
     * NOx 排放限值（g/km）
     */
    @XmlElement(name = "noxlimit")
    public Integer noxLimit;

    /**
     * HCNOx 排放限值（g/km）
     */
    @XmlElement(name = "hcnoxlimit")
    public Integer hcnoxLimit;

    /**
     * HC 排放结果（g/km）
     */
    @XmlElement(name = "hc")
    public Integer hc;

    /**
     * CO 排放结果（g/km）
     */
    @XmlElement(name = "co")
    public Integer co;

    /**
     * NOx 排放结果（g/km）
     */
    @XmlElement(name = "nox")
    public Integer nox;

    /**
     * HC+NOx 排放结果（g/km）
     */
    @XmlElement(name = "hcnox")
    public Integer hcnox;

    /**
     * HC 排放判定(0-不合格，1-合格)
     */
    @XmlElement(name = "hcjudge")
    public String hcJudge;

    /**
     * CO 排放判定(0-不合格，1-合格)
     */
    @XmlElement(name = "cojudge")
    public String coJudge;

    /**
     * NOx 排放判定(0-不合格，1-合格)
     */
    @XmlElement(name = "noxjudge")
    public String noxJudge;

    /**
     * HCNOx 排放判定(0-不合格， 1-合格)
     */
    @XmlElement(name = "hcnoxjudge")
    public String hcnoxJudge;

    /**
     * 检测结果：
     * 0：不合格 1：合格 2：中止 3：无效
     */
    @XmlElement(name = "passed")
    public String checkResult;
}
