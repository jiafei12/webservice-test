package com.test.dto;

import lombok.Data;
import org.apache.tools.ant.types.resources.selectors.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
//TODO:补充备注

/**
 * 双怠速检测结果数据
 */
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class TwoSpeedIdleResultDTO {

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
     * 过量空气系数限值下限
     */
    @XmlElement(name = "lambda_limit_l")
    public Double lambdaLowerLimit;

    /**
     * 过量空气系数限值上限
     */
    @XmlElement(name = "lambda_limit_h")
    public Double lambdaUpperLimit;

    /**
     * 过量空气系数 Lambda 值
     */
    @XmlElement(name = "lambda")
    public Double lambda;

    /**
     * 过量空气系数 Lambda 是否合格
     * 0：不合格 1：合格
     */
    @XmlElement(name = "lambda_passed")
    public String lambdaPassed;

    /**
     * 低怠速 CO 测量限值（%）
     */
    @XmlElement(name = "low_co_limit")
    public Double lowCOLimit;

    /**
     * 低怠速 CO 测量结果（%）
     */
    @XmlElement(name = "low_co")
    public Double lowCO;

    /**
     * 低怠速 CO是否合格：
     * 0：不合格 1：合格
     */
    @XmlElement(name = "low_co_passed")
    public String lowCOPassed;

    /**
     * 低怠速 HC 测量限值（10-6）
     */
    @XmlElement(name = "low_hc_limit")
    public Integer lowHCLimit;

    /**
     * 低怠速 HC 测量结果（10-6）
     */
    @XmlElement(name = "low_hc")
    public Integer lowHC;

    /**
     * 低怠速 HC 是否合格：
     * 0：不合格 1：合格
     */
    @XmlElement(name = "low_hc_passed")
    public String lowHCPassed;

    /**
     * 高怠速 CO 测量限值（%）
     */
    @XmlElement(name = "high_co_limit")
    public Double highCOLimit;

    /**
     * 高怠速 CO 测量结果（%）
     */
    @XmlElement(name = "high_co")
    public Double highCO;

    /**
     * 高怠速 CO是否合格：
     * 0：不合格 1：合格
     */
    @XmlElement(name = "high_co_passed")
    public String highCOPassed;

    /**
     * 高怠速 hc 测量限值（10-6）
     */
    @XmlElement(name = "high_hc_limit")
    public Integer highHCLimit;

    /**
     * 高怠速 hc 测量结果（10-6）
     */
    @XmlElement(name = "high_hc")
    public Integer highHC;

    /**
     * 高怠速 HC 是否合格：
     * 0：不合格 1：合格
     */
    @XmlElement(name = "high_hc_passed")
    public String highHCPassed;

    /**
     * 检测结果：
     * 0：不合格 1：合格 2：中止 3：无效
     */
    @XmlElement(name = "passed")
    public String checkResult;
}
