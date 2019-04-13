package com.test.util;

import com.test.dto.VehicleLoginDTO;
import com.test.dto.VehicleLoginDTO1;
import com.test.helper.MarshallerListener;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.CompactWriter;
import com.thoughtworks.xstream.io.xml.DomDriver;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;

/**
 * @author DELL
 * @title: TestMain
 * @projectName webservice-test
 * @description: TODO
 * @date 2019/4/1218:28
 */
public class TestMain {
    public static void main(String[] args) throws JAXBException, IOException {
        VehicleLoginDTO1 vehicleLoginDTO1 = new VehicleLoginDTO1();
        vehicleLoginDTO1.setAutomobileOdometer(12);
        vehicleLoginDTO1.setBatteryCapacity(0.0);
        XStream xStream = new XStream(new DomDriver("utf-8"));
        xStream.processAnnotations(VehicleLoginDTO.class);
        String xml = xStream.toXML(vehicleLoginDTO1);
        //System.out.println(xml);
        VehicleLoginDTO vehicleLoginDTO = new VehicleLoginDTO();
        vehicleLoginDTO.setBenchmarkQuality("dada");
        System.out.println(XmlUtils.beanToXml(vehicleLoginDTO,""));

    }
}
