package com.test.service;

import com.test.ResponseBuilder;
import com.test.dto.VehicleLoginDTO;
import org.apache.poi.ss.formula.functions.T;

import javax.xml.bind.JAXBException;
import java.io.IOException;

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
     * @param clazz 对应检测方法所传实体类对应参数
     *             (双怠速法：TwoSpeedIdleDTO.class  稳态工况法: SteadyConditionDTO.class
     *             简易瞬态工况：SimpleTransientDTO.class  加载减速：LugDownDTO.class   不透光烟度法：OpaqueSmokeDTO.class
     *             柴油车OBD：DieselCarOBDDTO.class  汽油车OBD: GasolineCarOBDDTO.class  外观检测:AppearanceInspectionDTO)
     * @param checkMethod  检测方法
     *                     （1、双怠速法；2、稳态工况法， 3、简易瞬态工况；
     *                     4、加载减速；5、不透光烟度法； 6、汽油车OBD数据；
     *                     7、柴油车OBD数据；8、外观检测）
     * @return ResponseBuilder 统一包装类型
     */
    ResponseBuilder uploadInspectionResult(String token, String organizationNumber, Class<T> clazz,int checkMethod) throws Exception;
}
