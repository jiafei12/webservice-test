package com.test.dto;

import lombok.Data;
import org.apache.tools.ant.types.resources.selectors.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 不透光烟度法检测结果数据
 *
 * @author liuyh
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class OpaqueSmokeResultDTO {

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
     * 怠速转速（r/min）
     */
    @XmlElement(name = "idle_rev")
    public Integer idleRev;

    /**
     * 最后四次（第一次)检测烟度值（m-1）
     */
    @XmlElement(name = "smoke1")
    public Integer smoke1;

    /**
     * 最后四次（第二次)检测烟度值（m-1）
     */
    @XmlElement(name = "smoke2")
    public Integer smoke2;

    /**
     * 最后四次（第三次)检测烟度值（m-1）
     */
    @XmlElement(name = "smoke3")
    public Integer smoke3;


    /**
     * 最后四次（第四次)检测烟度值（m-1）
     */
    @XmlElement(name = "smoke4")
    public Integer smoke4;

    /**
     * 最后四次（第一次)检测最大转速
     */
    @XmlElement(name = "smoke1rpm")
    public Integer smoke1rpm;

    /**
     * 最后四次（第二次)检测最大转速
     */
    @XmlElement(name = "smoke2rpm")
    public Integer smoke2rpm;

    /**
     * 最后四次（第三次)检测最大转速
     */
    @XmlElement(name = "smoke3rpm")
    public Integer smoke3rpm;

    /**
     * 最后四次（第四次)检测最大转速
     */
    @XmlElement(name = "smoke4rpm")
    public Integer smoke4rpm;

    /**
     * 最后四次检测平均值（m-1）
     */
    @XmlElement(name = "smoke_avg")
    public Integer smokeAvg;

    /**
     * 烟度限值
     */
    @XmlElement(name = "smoke_limit")
    public Integer smokeLimit;

    /**
     * 检测结果：
     * 0：不合格 1：合格 2：中止 3：无效
     */
    @XmlElement(name = "passed")
    public Integer checkResult;
}
