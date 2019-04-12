package com.test.service.impl;

import com.test.ResponseBuilder;
import com.test.dto.VehicleLoginDTO;
import com.test.service.WSService;
import com.test.util.WebServiceUtils;
import com.test.util.XmlUtils;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liuyh
 * @description: TODO
 * @date 2019/4/1114:22
 */
public class WSServiceImpl implements WSService {
    //TODO: 读取配置文件
    private static String wsdlUrl = "";
    private static String methodName = "";
    private static String targetNamespace = "";
    private static String xmlStatement = "";
    private static String rootElement = "";
    private static String otherElement = "";

    @Override
    public ResponseBuilder vehicleLogin(VehicleLoginDTO vehicleLoginDTO) throws Exception {
        //TODO: 封装参数
        StringBuffer xmlParams = XmlUtils.mapToXml(xmlStatement, rootElement, new ArrayList<>(), null);
        WebServiceUtils.dynamicCallWebServiceByCXF(wsdlUrl, methodName, targetNamespace, new Object[]{xmlParams});
        return null;
    }

    //TODO:类反射实现反射Bean, 组装参数
    private void wrapperParams(Class clazz) {
        Map paramsMap = new HashMap();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            String fieldName = clazz.getName();
            String name = fieldName.replaceFirst(fieldName.substring(0, 1), fieldName.substring(0, 1).toUpperCase());
            //paramsMap.put(field.getAnnotation(XStreamAlias.class).value(),clazz.);
        }
    }



    /**
     * 把一个字符串的第一个字母大写, 并拼接get方法, 获取字符值
     * @param filedName: 类属性名称
     * @return
     */
    //TODO:
    private static String getFiledValue(String filedName,Class clazz,Object classObject) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        byte[] items = filedName.getBytes();
        items[0] = (byte) ((char) items[0] - 'a' + 'A');
        Method m = clazz.getMethod("get" + new String(items));
        return (String) m.invoke(clazz);
    }
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
}
