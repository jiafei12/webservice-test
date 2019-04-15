package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 * 外观检测结果
 *
 * @author liuyh
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class AppearanceInspectionDTO {

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
     * 检测用户登录名
     */
    @XmlElement(name = "uid")
    public String loginUserName;
    /**
     * 用户密码（由监管平台管理员提供）
     */
    @XmlElement(name = "pwd")
    public String loginPwd;

    /**
     * 车架号/车辆识别号码
     */
    @XmlElement(name = "clsbdh")
    public String vin;

    /**
     * 车辆型号
     */
    @XmlElement(name = "clxh")
    public String vehicleModel;

    /**
     * 车牌
     */
    @XmlElement(name = "plate")
    public String licensePlate;

    /**
     * 检查日期
     */
    @XmlElement(name = "check_date")
    public Date checkDate;

    /**
     * 车辆里程数
     */
    @XmlElement(name = "odometer")
    public Double odoMeter;

    /**
     * 机械状况是否良好 0：否 1：是
     */
    @XmlElement(name = "jxzk")
    public String mechanicalConditionIsGood;

    /**
     * 污染控制装置是否齐全、正常 0：否 1：是
     */
    @XmlElement(name = "wrkzzz")
    public String pollutionDeviceIsNormal;

    /**
     * 是否存在烧机油或严重冒黑烟状况 0：否 1：是
     */
    @XmlElement(name = "sjymhy")
    public String burningMachineIsSmoke;

    /**
     * 曲轴箱通风系统是否正常 0：否 1：是
     */
    @XmlElement(name = "qzxtfxt")
    public String crankcaseVentilationIsNormal;

    /**
     * 燃油蒸发控制系统是否正常 0：否 1：是
     */
    @XmlElement(name = "ryzfkzxt")
    public String fuelEvaporationIsNormal;

    /**
     * 仪表工作是否正常 0：否 1：是
     */
    @XmlElement(name = "ybgz")
    public String meterWorkIsNormal;

    /**
     * 有无影响安全或引起测试偏差的机械故障
     * 0：否   1：是
     */
    @XmlElement(name = "yxaqjxgz")
    public String mechanicalFailureIsCause;

    /**
     * 进排气系统是否存在泄露 0：否 1：是
     */
    @XmlElement(name = "pqxtxl")
    public String intakeAndExhaustIsDisclosure;


    /**
     * 发动机、变速箱等有无液体渗漏情况 0：否 1：是
     */
    @XmlElement(name = "ytsl")
    public String liquidIsDisclosure;

    /**
     * 是否带 OBD 0：否 1：是
     */
    @XmlElement(name = "hasobd")
    public String hasOBD;

    /**
     * 轮胎气压是否正常 0：否 1：是
     */
    @XmlElement(name = "ltpre")
    public String tirePressureIsNormal;

    /**
     * 轮胎是否干燥、清洁 0：否 1：是
     */
    @XmlElement(name = "ltgz")
    public String tireIsDryAndCleaning;


    /**
     * 是否关闭空调、暖风等附属设备 0：否 1：是
     */
    @XmlElement(name = "closefssb")
    public String ancillaryEquipmentIsClosed;

    /**
     * 是否关闭 ESP、ARS 等可能影响测试的功能 0：否 1：是
     */
    @XmlElement(name = "closeyxgzkz")
    public String impactTestIsClosed;

    /**
     * 油箱和油品是否正常 0：否 1：是
     */
    @XmlElement(name = "fuelgz")
    public String fuelIsNormal;

    /**
     * 是否适合工况法检测 0：否 1：是
     */
    @XmlElement(name = "isasm")
    public String workingConditionMethodIsSuit;

    /**
     * 外观图片名称，多张图片名称中间用逗号间隔，如：a.jpg,b.jpg
     */
    @XmlElement(name = "wgpics")
    public String pictureName;

    /**
     * 检测结果：
     * 0：不合格 1：合格 2：中止 3：无效
     */
    @XmlElement(name = "passed")
    public String checkResult;
}
