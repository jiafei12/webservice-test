package com.test.service.impl;

import com.test.ResponseBuilder;
import com.test.dto.TwoSpeedIdleDTO;
import com.test.dto.TwoSpeedIdleInfoDTO;
import com.test.dto.TwoSpeedIdleResultDTO;
import com.test.dto.result.UploadInspectionResult;
import com.test.dto.result.VehicleLoginReponse;
import com.test.dto.result.VehicleLoginResult;
import com.test.dto.VehicleLoginDTO;
import com.test.service.WSService;
import com.test.util.JAXBUtils;
import com.test.util.WebServiceUtils;
import org.springframework.beans.BeanUtils;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyh
 * @date 2019/4/11  14:22
 */
public class WSServiceImpl implements WSService {
    //TODO: 读取配置文件
    /**
     * webService wsdlUrl（由厂商负责提供）
     */
    private String wsdlUrl = "http://122.112.209.3:9086/synchrodata/webservice/SynTocity?wsdl";
    /**
     * 方法名称
     */
    private String vehicleLoginMethodName = "vehiclelogin";
    /**
     * 对应命名空间, wsdl中的 targetNamespace
     */
    private String targetNamespace = "http://synToCity.synchrodata.daniu.com/";
    /**
     * xml声明头文件
     */
    private String xmlFragment = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

    @Override
    //TODO:处理下层抛出的异常，记录日志
    public ResponseBuilder vehicleLogin(VehicleLoginDTO vehicleLoginDTO) {
        String xmlParams = null;
        try {
            xmlParams = JAXBUtils.beanToXml(vehicleLoginDTO, xmlFragment);
        } catch (JAXBException e) {
            //TODO:日志记录
            e.printStackTrace();
        } catch (IOException e) {
            // TODO:打印日志
            e.printStackTrace();
        }
        Object result = null;
        try {
            result = WebServiceUtils.dynamicCallWebServiceByCXF(wsdlUrl, vehicleLoginMethodName, targetNamespace, new Object[]{xmlParams});
        } catch (Exception e) {
            //TODO：日志打印
            e.printStackTrace();
        }
        //TODO：处理结果, 将每个返回值对应成javabean
        return handleVehicleLoginResult(result);
    }

    @Override
    public ResponseBuilder uploadInspectionResult(String token, String organizationNumber, Object bean, int checkMethod){
        String xmlParams = null;
        try {
            xmlParams = JAXBUtils.beanToXml(bean, xmlFragment);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(xmlParams);
        Object result = null;
        try {
            result = WebServiceUtils.dynamicCallWebServiceByCXF(wsdlUrl, vehicleLoginMethodName, targetNamespace, new Object[]{token, organizationNumber, xmlParams, checkMethod});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return handleUploadInspectionResult(result);
    }

    private ResponseBuilder handleVehicleLoginResult(Object result){
        ResponseBuilder builder = new ResponseBuilder();
        VehicleLoginResult vehicleLoginResult = JAXBUtils.xmlToBean(String.valueOf(result), VehicleLoginResult.class);
        System.out.println(vehicleLoginResult);
        boolean falseFlag = "0".equals(vehicleLoginResult.getStatus())||"false".equals(vehicleLoginResult.getStatus());
        if (falseFlag) {
            builder.setCode(0);
            builder.setMessage(vehicleLoginResult.getMessage());
        } else {
            builder.setCode(1);
            VehicleLoginReponse vehicleLoginReponse = new VehicleLoginReponse();
            BeanUtils.copyProperties(vehicleLoginResult, vehicleLoginReponse);
            builder.setData(vehicleLoginReponse);
        }
        return builder;
    }

    public ResponseBuilder handleUploadInspectionResult(Object result) {
        ResponseBuilder builder = new ResponseBuilder();
        UploadInspectionResult uploadInspectionResult = JAXBUtils.xmlToBean(String.valueOf(result),UploadInspectionResult.class);
        boolean falseFlag = "0".equals(uploadInspectionResult.getStatus())||"false".equals(uploadInspectionResult.getStatus());
        if (falseFlag) {
            builder.setCode(0);
            builder.setMessage(uploadInspectionResult.getMessage());
        } else {
            builder.setCode(1);
            builder.setData(null);
        }
        return builder;
    }


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
     /*   VehicleLoginDTO vehicleLoginDTO = new VehicleLoginDTO();
        vehicleLoginDTO.setBenchmarkQuality("31");
        ResponseBuilder builder = wsService.vehicleLogin(vehicleLoginDTO);
        System.out.println(builder.getCode());
        System.out.println(builder.getData());*/
        TwoSpeedIdleDTO twoSpeedIdleDTO=new TwoSpeedIdleDTO();
        TwoSpeedIdleResultDTO twoSpeedIdleResultDTO=new TwoSpeedIdleResultDTO();
       // twoSpeedIdleResultDTO.setAreaCode("213131");
        List<TwoSpeedIdleInfoDTO> twoSpeedIdleInfoDTOList=new ArrayList();
        twoSpeedIdleResultDTO.setAmbientTemperature(23.6);
        TwoSpeedIdleInfoDTO twoSpeedIdleInfoDTO=new TwoSpeedIdleInfoDTO();
       // twoSpeedIdleInfoDTO.setAtomsphere(424.3);
        twoSpeedIdleInfoDTOList.add(twoSpeedIdleInfoDTO);
        TwoSpeedIdleInfoDTO twoSpeedIdleInfoDTO1=new TwoSpeedIdleInfoDTO();
     //  twoSpeedIdleInfoDTO1.setOilTemperature(4242);
        twoSpeedIdleInfoDTOList.add(twoSpeedIdleInfoDTO);
        twoSpeedIdleDTO.setTwoSpeedIdleInfoDTOList(twoSpeedIdleInfoDTOList);
       twoSpeedIdleDTO.setTwoSpeedIdleResultDTO(twoSpeedIdleResultDTO);
    //    System.out.println( JAXBUtils.beanToXml(twoSpeedIdleDTO,"<?xml version=\"1.0\" encoding=\"UTF-8\"?>"));
        wsService.uploadInspectionResult(null,"3232323", twoSpeedIdleDTO,1);

    }
}
