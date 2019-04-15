package com.test.service.impl;

import com.test.ResponseBuilder;
import com.test.dto.Result.VehicleLoginReponse;
import com.test.dto.Result.VehicleLoginResult;
import com.test.dto.VehicleLoginDTO;
import com.test.service.WSService;
import com.test.util.JAXBUtils;
import com.test.util.WebServiceUtils;
import org.springframework.beans.BeanUtils;


/**
 * @author liuyh
 * @description: TODO
 * @date 2019/4/1114:22
 */
public class WSServiceImpl implements WSService {
    //TODO: 读取配置文件
    private static String wsdlUrl = "http://122.112.209.3:9086/synchrodata/webservice/SynTocity?wsdl";
    private static String vehicleLoginMethodName = "vehiclelogin";
    private static String targetNamespace = "http://synToCity.synchrodata.daniu.com/";
    private static String xmlFragment = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

    @Override
    //TODO:处理下层抛出的异常，记录日志
    public ResponseBuilder vehicleLogin(VehicleLoginDTO vehicleLoginDTO) throws Exception {
        String xmlParams = JAXBUtils.beanToXml(vehicleLoginDTO, xmlFragment);
        Object result = WebServiceUtils.dynamicCallWebServiceByCXF(wsdlUrl, vehicleLoginMethodName, targetNamespace, new Object[]{xmlParams});
        //TODO：处理结果, 将每个返回值对应成javabean
        ResponseBuilder builder = handleVehicleLoginResult(result);
        return builder;
    }

    private ResponseBuilder handleVehicleLoginResult(Object result) throws Exception {
        ResponseBuilder builder = new ResponseBuilder();
        VehicleLoginResult vehicleLoginResult = JAXBUtils.xmlToBean(String.valueOf(result), VehicleLoginResult.class);
        //  builder=WSServiceImpl.handleMethodResult(vehicleLoginReponse);
        boolean falseFlag = "0".equals(vehicleLoginResult.getStatus()) ? true : false;
        if (falseFlag) {
            builder.setCode(0);
            builder.setMessage(vehicleLoginResult.getMessage());
        } else {
            builder.setCode(1);
            VehicleLoginReponse vehicleLoginReponse=new VehicleLoginReponse();
            BeanUtils.copyProperties(vehicleLoginResult,vehicleLoginReponse);
         //   builder.setData(vehicleLoginReponse);
        }
        return builder;
    }

    /**
     * 封装统一返回值结果
     *
     * @param args
     * @throws Exception
     */
    /*private static ResponseBuilder handleMethodResult(Object clazz) throws IllegalAccessException {
        ResponseBuilder builder = new ResponseBuilder();
        Field[] fields = clazz.getClass().getDeclaredFields();
        Map returnMap = new HashMap();
        for (Field field : fields) {
            String fieldName = field.getName();
            boolean falseFlag = false;
            if ("status".equals(fieldName)) {
                System.out.println(fieldName);
                System.out.println(field.get(fieldName));
                falseFlag = "0".equals(field.get(fieldName)) || "false".equals(field.get(fieldName)) ? true : false;
                if (falseFlag) {
                    builder.setCode(0);
                    if ("message".equals(fieldName)) {
                        builder.setMessage("联网协议调用失败：" + field.get(fieldName));
                    } else if ("errMsg".equals(fieldName)) {
                        builder.setMessage("联网协议调用失败:" + field.get(fieldName));
                    }
                    break;
                } else {
                    builder.setCode(1);
                    returnMap.put(field.getName(), field.get(fieldName));
                }
            }
        }
        builder.setData(returnMap);
        return builder;
    }
*/
    /*//
    private void wrapperParams(Class clazz) {
        Map paramsMap = new HashMap();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String fieldName = clazz.getName();
            String name = fieldName.replaceFirst(fieldName.substring(0, 1), fieldName.substring(0, 1).toUpperCase());
            //paramsMap.put(field.getAnnotation(XStreamAlias.class).value(),clazz.);
        }
    }



    */
    /*private static String getFiledValue(String filedName,Class clazz,Object classObject) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        byte[] items = filedName.getBytes();
        items[0] = (byte) ((char) items[0] - 'a' + 'A');
        Method m = clazz.getMethod("get" + new String(items));
        return (String) m.invoke(clazz);
    }*/
//
//    //获取注释在类或者属性上的别名
//    private String getXmlAlias(Class clazz)
//    {
//        Field[] fields = VehicleLoginDTO.class.getDeclaredFields();
//        for (Field field : fields)
//        {
//            field.setAccessible(true);
//            XStreamAlias excel = field.getAnnotation(XStreamAlias.class);
//            System.out.println(excel.value());
//        }
//        return excel.value();
//    }
    public static void main(String[] args) throws Exception {
        WSServiceImpl wsService = new WSServiceImpl();
        VehicleLoginDTO vehicleLoginDTO = new VehicleLoginDTO();
        vehicleLoginDTO.setBenchmarkQuality("31");
        ResponseBuilder builder = wsService.vehicleLogin(vehicleLoginDTO);
        System.out.println(builder.getCode());
        System.out.println(builder.getData());
    }
}
