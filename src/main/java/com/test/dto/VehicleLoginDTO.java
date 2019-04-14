package com.test.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 * 车辆检测登录
 *
 * @author liuyh
 * @date 2019/4/11 14:30
 */
@XmlRootElement(name="request")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class VehicleLoginDTO implements Serializable {
    /**
     * 登录用户名
     */
    @XmlElement(name = "uid")
    public String loginUserName;
    /**
     * 登录密码
     */
    @XmlElement(name = "pwd")
    public String loginPwd;
    /**
     * 登录机构
     */
    @XmlElement(name = "unitid")
    public String loginInstitution;
    /**
     * 车牌
     */
    @XmlElement(name = "plate")
    public String licensePlate;
    /**
     * 车牌颜色: 蓝牌/黄牌/白牌/黑牌/其他
     */
    @XmlElement(name = "platecolor")
    public String licensePlateColor;

    //TODO:数据格式限制
    /**
     * 车架号/车辆识别号码
     */
    @XmlElement(name = "clsbdh")
    public String vin;
    /**
     *
     *
     * 类型:  1:年检, 2:新注册车辆 ,3:外地车转入, 4:实验比对
     */
    @XmlElement(name = "checktype")
    public String checkType;
    /**
     * 检测方法: 1:双怠速, 2:稳态工况, 3:简易瞬态工况, 4:加载减速
     * 5:不透光烟度, 6:滤纸烟度, 7:瞬态
     */
    @XmlElement(name = "checkmethod")
    public String checkMethod;
    /**
     * 车牌类型
     * 01:大型汽车  02:小型汽车  03:使馆汽车  04:领馆汽车
     * 05:境外汽车  06:外籍汽车  07:普通摩托车 08：轻便摩托车
     * 09:使馆摩托车  10:领馆摩托车  11:境外摩托车  12:外籍摩托车
     * 13：低速车 14：拖拉机 15：挂车 16：教练汽车
     * 17：教练摩托车 18：试验汽车 19：试验摩托车 20：临时入境汽车
     * 21：临时入境摩托车 22：临时行驶车 23：警用汽车 24：警用摩托
     * 25：原农机号牌 26：香港入出境车 27:澳门入出境车
     * 31:武警号牌  32: 军队号牌
     * 41: 无号牌 42: 假号牌 43: 挪用号牌
     * 51: 小型新能源汽车 52:大型新能源汽车
     * 99: 其他号牌
     */
    @XmlElement(name = "hpzl")
    public String licensePlateType;
    /**
     * 车辆状态
     */
    @XmlElement(name = "zt")
    public String vehicleStatus;
    /**
     * 车辆制造日期:（yyyy-mm-dd)
     */
    @XmlElement(name = "ccrq")
    public Date vehicleManufacturingDate;
    /**
     * 车辆初次登记日期:（yyyy-mm-dd)
     */
    @XmlElement(name = "ccdjrq")
    public Date vehicleInitalRegDate;
    /**
     * 车辆发证日期:（yyyy-mm-dd)
     */
    @XmlElement(name = "fzrq")
    public Date vehicleIssuingDate;
    /**
     * 环检周期
     * 0:6  1:12   2:24   3:72
     */
    @XmlElement(name = "check_period")
    public String envCheckPeriod;
    /**
     * 车辆生产厂名称
     */
    @XmlElement(name = "zzcmc")
    public String vehicleManufacturerName;
    /**
     * 厂牌型号
     */
    @XmlElement(name = "clsb")
    public String brandModel;
    /**
     * 车辆型号
     */
    @XmlElement(name = "clxh")
    public String vehicleModel;
    /**
     * 发动机型号
     */
    @XmlElement(name = "fdjxh")
    public String engineModel;
    /**
     * 发动机号
     */
    @XmlElement(name = "fdjh")
    public String engineNumber;
    /**
     * 发动机生产厂家
     */
    @XmlElement(name = "fdjscc")
    public String engineManufacturer;
    /**
     * 目录日期
     */
    @XmlElement(name = "filename")
    public String directoryDate;
    /**
     * 排放标准
     * 0:国0  1:国Ⅰ 2:国Ⅱ 3:国Ⅲ
     * 4:国Ⅳ  5:国Ⅴ  6:国Ⅵ 99:零排放
     */
    @XmlElement(name = "standard_id")
    public String standardId;
    /**
     * 车辆类型
     */
    @XmlElement(name = "cllx")
    public String vehicleType;
    /**
     * 使用性质
     * A: 非营运 B: 公路客运 C: 公交客运 D: 出租客运
     * E: 旅游客运   F: 货运  G: 租赁 H: 警用
     * I: 消防 J: 救护 K: 工程救险 L: 营转非
     * M: 出租转非 N: 教练 O: 幼儿校车 P: 小学生校车
     * Q: 初中生校车  R: 危化品运输 S: 中小学生校车 T: 中小学生校车
     * U: 预约出租转非
     */
    @XmlElement(name = "syxz")
    public String usageNature;
    /**
     * 燃油种类
     * A: 汽油 AC: 汽电混合 AE: 汽油/天然气混合 B: 柴油
     * C: 电 D: 混合油 E: 天然气 F: 液化石油气
     * L: 甲醇 M: 乙醇 N: 太阳能 O: 混合动力
     * P: 氢 Q: 生物燃料
     */
    @XmlElement(name = "rlzl")
    public String fuelType;
    /**
     * 座位数
     */
    @XmlElement(name = "hdzk")
    public Integer seatsNumber;
    /**
     * 是否有EGR:Y/N Y-是,N-否
     */
    @XmlElement(name = "has_egr")
    public String hasEGR;
    /**
     * 是否有燃油蒸发控制装置  Y/N Y-是 N-否
     */
    @XmlElement(name = "has_oil_ctrl")
    public String hasEVAP;

    /**
     * 是否有 obd Y/N Y-是 N-否
     */
    @XmlElement(name = "has_odb")
    public String hasOBD;

    /**
     * 是否有后处理/进化装置 Y/N Y-是 N-否
     */
    @XmlElement(name = "has_purge")
    public String hasPurge;

    /**
     * 后处理种类
     * 000000: 苦瓜干 1: 三元催化 121: 12 1223: 玩儿
     * 123: 123请问123请问123请问  2: DPF 22222: 涡轮增压22  3: SCR
     * 4: DOC 5: POC  6: 其它 897989: 123123 测试: 测试
     * 阿萨德阿萨德阿萨德阿: 期望
     */
    @XmlElement(name = "purgetype")
    public String purgeType;

    /**
     * 是否能关闭车身稳定 Y/N Y-是 N-否
     */
    @XmlElement(name = "is_esp_down")
    public String isESPDown;

    /**
     * 标志类型
     * 0: 黄标  1: 绿标
     */
    @XmlElement(name = "sign_type")
    public String signType;

    /**
     * 变速箱形式
     * 1: 手动  2: 自动  3: 手自一体
     */
    @XmlElement(name = "drive_form")
    public String gearboxForm;

    /**
     * 驱动方式
     * 1: 前驱   2: 后驱  3:四驱  4: 全时四驱
     */
    @XmlElement(name = "drive_mode")
    public String driveMode;

    /**
     * 供油方式
     * 1: 化油器  10: 其他 2: 化油器改造 3: 开环电喷
     * 4: 闭环电喷  5: 高压共轨 6: 泵喷嘴 7: 单体泵
     * 8: 直列泵  9: 机械泵
     */
    @XmlElement(name = "gyfs")
    public String oilSupplyMethod;

    /**
     * 是否电控 Y/N Y-是 N-否
     */
    @XmlElement(name = "is_electronic_ctrl")
    public String isElectronicControl;

    /**
     * 进气方式
     * 1: 自然吸气  2: 涡轮增压
     */
    @XmlElement(name = "jqfss")
    public String intakeMode;

    /**
     * 发动机排量
     */
    @XmlElement(name = "pl")
    public Double engineDisplacement;

    /**
     * 气缸数量
     */
    @XmlElement(name = "fdjgs")
    public String cylindersNumber;

    /**
     * 发动机冲程数
     */
    @XmlElement(name = "ccs")
    public Integer engineStrokesNumber;

    /**
     * 发动机额定功率(KW)
     */
    @XmlElement(name = "gl")
    public Double engineRatedPower;

    /**
     * 发动机额定转速
     */
    @XmlElement(name = "edzs")
    public String engineRatedSpeed;

    /**
     * 最大总质量
     */
    @XmlElement(name = "zzl")
    public String maximumTotalMass;

    /**
     * 基准质量
     */
    @XmlElement(name = "zbzl")
    public String benchmarkQuality;

    /**
     * 里程表读数
     */
    @XmlElement(name = "odo_meter")
    public Integer automobileOdometer;

    /**
     * 车主
     */
    @XmlElement(name = "syr")
    public String carOwner;

    /**
     * 车主地址
     */
    @XmlElement(name = "zsxxdz")
    public String carOwnerAddress;

    /**
     * 车主电话
     */
    @XmlElement(name = "sjhm")
    public String carOwnerPhone;

    /**
     * 电池容量
     */
    @XmlElement(name = "dcrl")
    public Double batteryCapacity;

    /**
     * 驱动电机型号
     */
    @XmlElement(name = "qddjxh")
    public String driveMotorModel;

    /**
     * 储能装置型号
     */
    @XmlElement(name = "cnzzxh")
    public String energyStorageModel;

    /**
     * 催化转化器型号
     */
    @XmlElement(name = "chzhqxh")
    public String catalyticConverterModel;

    /**
     * 燃油规格
     */
    @XmlElement(name = "rygg")
    public String fuelSpecification;

}

