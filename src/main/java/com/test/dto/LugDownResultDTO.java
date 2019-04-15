package com.test.dto;

import lombok.Data;
import org.apache.tools.ant.types.resources.selectors.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 加载减速结果数据
 * @author  liuyh
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class LugDownResultDTO {
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
     * 100%点排放限值（k/m-1）
     */
    @XmlElement(name = "smokeklimit")
    public Integer emission100PercentLimit;

    /**
     * 80%点排放结果限值
     */
    @XmlElement(name = "k80limit")
    public Integer k80Limit;

    /**
     * 80%氮氧化物限值
     */
    @XmlElement(name = "k80nolimit")
    public Integer k80NOLimit;

    /**
     * 100%点排放结果（k/m-1）
     */
    @XmlElement(name = "k100")
    public Integer k100;

    /**
     * 80%点排放结果（k/m-1）
     */
    @XmlElement(name = "k80")
    public Integer k80;

    /**
     * 最大轮边功率限值（kW）
     */
    @XmlElement(name = "maxpowerlimit")
    public Integer maxPowerLimit;

    /**
     * 实测最大轮边功率（kW）
     */
    @XmlElement(name = "maxpower")
    public Integer maxPower;

    /**
     * 修正系数
     */
    @XmlElement(name = "xzxs")
    public Integer revisionIndex;

    /**
     * 发动机额定转速上限（r/min）
     */
    @XmlElement(name = "raterevup")
    public Integer ratedSpeedUpperLimit;

    /**
     * 发动机额定转速下限（r/min）
     */
    @XmlElement(name = "raterevdown")
    public Integer ratedSpeedLimit;

    /**
     * 实 测 发 动 机 额 定 转 速（r/min）
     */
    @XmlElement(name = "rev100")
    public Integer rev100;

    /**
     * k80 排放判定(0-不合格，1-合格)
     */
    @XmlElement(name = "k80judge")
    public String k80Judge;

    /**
     * k100 排放判定(0-不合格，1-合格)
     */
    @XmlElement(name = "k100judge")
    public String k100Judge;

    /**
     * 检测结果：
     * 0：不合格 1：合格 2：中止 3：无效
     */
    @XmlElement(name = "passed")
    public String checkResult;
}
