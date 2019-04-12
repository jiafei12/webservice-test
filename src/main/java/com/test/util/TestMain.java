package com.test.util;

import com.test.dto.VehicleLoginDTO;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author DELL
 * @title: TestMain
 * @projectName webservice-test
 * @description: TODO
 * @date 2019/4/1218:28
 */
public class TestMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        VehicleLoginDTO vehicleLoginDTO=new VehicleLoginDTO();
        Field[] fields = VehicleLoginDTO.class.getDeclaredFields();
        vehicleLoginDTO.setAutomobileOdometer(111111);
        vehicleLoginDTO.setIsESPDown("Y");
        for (Field field : fields)
        {
            byte[] items =field.getName().getBytes();
            items[0] = (byte) ((char) items[0] - 'a' + 'A');
            Method m = VehicleLoginDTO.class.getMethod("get" + new String(items));

            System.out.println(m.invoke(vehicleLoginDTO));
        }
    }
}
