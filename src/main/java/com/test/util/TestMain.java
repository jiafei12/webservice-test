package com.test.util;

import com.test.dto.VehicleLoginDTO;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.CompactWriter;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.StringWriter;

/**
 * @author DELL
 * @title: TestMain
 * @projectName webservice-test
 * @description: TODO
 * @date 2019/4/1218:28
 */
public class TestMain {
    public static void main(String[] args) {
        VehicleLoginDTO vehicleLoginDTO=new VehicleLoginDTO();
        vehicleLoginDTO.setAutomobileOdometer(12);
        vehicleLoginDTO.setBatteryCapacity(0.0);
        XStream xStream=new XStream(new DomDriver("utf-8"));
        xStream.processAnnotations(VehicleLoginDTO.class);
        String xml=xStream.toXML(vehicleLoginDTO);
        System.out.println(xml);

    }
}
