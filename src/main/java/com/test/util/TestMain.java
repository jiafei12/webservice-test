package com.test.util;

import com.test.dto.VehicleLoginDTO;
import com.test.service.impl.WSServiceImpl;

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
    /*    JAXBContext context = JAXBContext.newInstance(VehicleLoginReponse.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><response><status>0</status><message>检测软件上传数据错误: 节点 '#AnonType_checktyperequest'仅支持数据或数据格式如'1|2|3|4', 值 '' 不正确。</message></response>\n";
       // VehicleLoginReponse person = (VehicleLoginReponse) unmarshaller.unmarshal(new StringReader(xml));
        System.out.println(JAXBUtils.xmlToBean(xml,VehicleLoginReponse.class).getMessage());
    */
    }
}
