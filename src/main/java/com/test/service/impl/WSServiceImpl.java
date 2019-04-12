package com.test.service.impl;

import com.test.ResponseBuilder;
import com.test.dto.VehicleLoginDTO;
import com.test.service.WSService;
import com.test.util.WebServiceUtils;
import com.test.util.XmlUtils;

import java.util.ArrayList;

/**
 *
 * @author liuyh
 * @description: TODO
 * @date 2019/4/1114:22
 */
public class WSServiceImpl implements WSService {
    //TODO: 读取配置文件
    private static String wsdlUrl="";
    private static String methodName="";
    private static String targetNamespace="";
    private static String xmlStatement="";
    private static String rootElement="";
    private static String otherElement="";
    @Override
    public ResponseBuilder vehicleLogin(VehicleLoginDTO vehicleLoginDTO) throws Exception {
        //TODO: 封装参数
        StringBuffer xmlParams= XmlUtils.mapToXml(xmlStatement,rootElement,new ArrayList<>(),null);
        WebServiceUtils.dynamicCallWebServiceByCXF(wsdlUrl,methodName,targetNamespace,new Object[]{xmlParams});
        return null;
    }
    //TODO:类反射实现反射Bean, 组装参数
    private void  wrapperParams()
    {

    }
}
