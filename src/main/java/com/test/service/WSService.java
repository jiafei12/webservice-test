package com.test.service;

import com.test.ResponseBuilder;
import com.test.dto.VehicleLoginDTO;

/**
 * @author liuyh
 * 江苏省机动车排放检验数据传输接口
 * @date 2019/4/1114:22
 */
public interface WSService {

    /**
     * 车辆检测登录
     *
     * @param vehicleLoginDTO：车辆检测登录信息资料
     * @return ResponseBuilder
     */
    ResponseBuilder vehicleLogin(VehicleLoginDTO vehicleLoginDTO) throws Exception;

    /**
     * 上传检测结果
     *
     * @param token  登陆成功后返回的唯一标识字符串(暂时可为空)
     * @param organizationNumber  机构编号
     * @param object 对应检测方法javabean实体类的对应参数
     *             (双怠速法：TwoSpeedIdleDTO  稳态工况法: SteadyConditionDTO
     *             简易瞬态工况：SimpleTransientDTO  加载减速：LugDownDTO   不透光烟度法：OpaqueSmokeDTO
     *             柴油车OBD：DieselCarOBDDTO  汽油车OBD: GasolineCarOBDDTO  外观检测:AppearanceInspectionDTO)
     * @param checkMethod  检测方法
     *                     （1、双怠速法；2、稳态工况法， 3、简易瞬态工况；
     *                     4、加载减速；5、不透光烟度法； 6、汽油车OBD数据；
     *                     7、柴油车OBD数据；8、外观检测）
     * @return ResponseBuilder 统一包装类型
     */
    ResponseBuilder uploadInspectionResult(String token, String organizationNumber, Object object,int checkMethod) throws Exception;
}
