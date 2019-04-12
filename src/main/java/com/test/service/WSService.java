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
     * @param vehicleLoginDTO：车辆检测登录信息资料
     * @return ResponseBuilder
     */
    ResponseBuilder vehicleLogin(VehicleLoginDTO vehicleLoginDTO);

    /**
     * 上传检测结果
     *
     * @return ResponseBuilder 统一包装类型
     */

   // ResponseBuilder uploadInspectionResult();


}
