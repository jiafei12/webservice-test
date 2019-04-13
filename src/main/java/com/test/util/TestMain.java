package com.test.util;

import com.test.dto.*;
import com.test.dto.Result.VehicleLoginReponse;
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
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author DELL
 * @title: TestMain
 * @projectName webservice-test
 * @description: TODO
 * @date 2019/4/1218:28
 */
public class TestMain {
    public static void main(String[] args) throws Exception {
      /*  VehicleLoginDTO1 vehicleLoginDTO1 = new VehicleLoginDTO1();
        vehicleLoginDTO1.setAutomobileOdometer(12);
        vehicleLoginDTO1.setBatteryCapacity(0.0);
        XStream xStream = new XStream(new DomDriver("utf-8"));
        xStream.processAnnotations(VehicleLoginDTO.class);
        String xml = xStream.toXML(vehicleLoginDTO1);
        //System.out.println(xml);
        VehicleLoginDTO vehicleLoginDTO = new VehicleLoginDTO();
        vehicleLoginDTO.setBenchmarkQuality("dada");
        System.out.println(XmlUtils.beanToXml(vehicleLoginDTO, ""));

*/
/*
    TwoSpeedIdleResultDTO twoSpeedIdleResultDTO = new TwoSpeedIdleResultDTO();
        twoSpeedIdleResultDTO.setVin("11111");
        twoSpeedIdleResultDTO.setOrganizationNumber("4242");
        ArrayList<TwoSpeedIdleInfoDTO> aa = new ArrayList<>();
        TwoSpeedIdleInfoDTO twoSpeedIdleInfoDTO = new TwoSpeedIdleInfoDTO();
        twoSpeedIdleInfoDTO.setEntireTime(new Date());
        aa.add(twoSpeedIdleInfoDTO);
        TwoSpeedIdleInfoDTO twoSpeedIdleInfoDTO1 = new TwoSpeedIdleInfoDTO();
        twoSpeedIdleInfoDTO1.setEntireTime(new Date());
        aa.add(twoSpeedIdleInfoDTO1);
        TwoSpeedIdleDTO twoSpeedIdleDTO = new TwoSpeedIdleDTO();
        twoSpeedIdleDTO.setTwoSpeedIdleResultDTO(twoSpeedIdleResultDTO);
        twoSpeedIdleDTO.setTwoSpeedIdleInfoDTOList(aa);
        System.out.println(JAXBUtils.beanToXml(twoSpeedIdleDTO, null));

*/
        JAXBContext context = JAXBContext.newInstance(VehicleLoginReponse.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><response><status>0</status><message>检测软件上传数据错误: 节点 '#AnonType_checktyperequest'仅支持数据或数据格式如'1|2|3|4', 值 '' 不正确。</message></response>\n";
       // VehicleLoginReponse person = (VehicleLoginReponse) unmarshaller.unmarshal(new StringReader(xml));
        System.out.println(JAXBUtils.xmlToBean(xml,VehicleLoginReponse.class).getMessage());
    }
}
