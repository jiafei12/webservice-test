package com.test.util;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import javax.xml.namespace.QName;

/**
 * @author liuyh
 * @date 2019/4/1110:19
 */
public class WebServiceUtils {
    /**
     * @param wsdlUrl         wsdl的地址：http://localhost:8001/demo/HelloServiceDemoUrl?wsdl
     * @param methodName      调用方法名称 selectOrderInfo
     * @param targetNamespace 命名空间 http://service.limp.com/
     * @throws Exception
     */
    public static Object dynamicCallWebServiceByCXF(String wsdlUrl, String methodName, String targetNamespace, Object[] params) throws Exception {
        // 创建动态客户端
        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
        // 创建客户端连接
        Client client = factory.createClient(wsdlUrl);
        //创建QName来指定NameSpace和要调用的方法绑定方法
        QName opName = new QName(targetNamespace, methodName);
        Object[] result = new Object[]{};
        try {
            result = client.invoke(opName, params);
        } catch (Exception e) {
            //TODD:记录日志??????????/如何做到上游捕捉到这个错误,抛出至service层面
            System.out.println("webService远程方法：" + methodName + "执行失败, 【原因】" + e.getMessage());
        }
        return result.length == 0 ? null : result[0];
    }


    public static String splicingXMLParas(String fd)
    {

        return null;
    }

    public static void main(String[] args) throws Exception {

        //获取字典表
        WebServiceUtils.dynamicCallWebServiceByCXF("http://122.112.209.3:9086/synchrodata/webservice/SynTocity?wsdl", "GetBaseTypeInfo",
                "http://impl.synToCity.synchrodata.daniu.com/", new Object[]{});

        // 车辆检测登陆测试
 /*       Object[] params = new Object[]{"<?xml version=\"1.0\" encoding=\"utf-8\" ?><request>" +
                "<uid> MJ </uid>\n" +
                "<pwd> 123456 </pwd>\n" +
                "<unitid>32020022</unitid>\n" +
                "<plate>1|2|3|4|99</plate>\n" +
                "<platecolor>1</platecolor>\n" +
                "<clsbdh></clsbdh>\n" +
                "<checktype></checktype>\n" +
                "<checkmethod></checkmethod>\n" +
                "<hpzl></hpzl>\n" +
                "<zt></zt>\n" +
                "<ccrq></ccrq>\n" +
                "<ccdjrq></ccdjrq>\n" +
                "<fzrq></fzrq>\n" +
                "<check_period></check_period>\n" +
                "<zzcmc></zzcmc>\n" +
                "<clsb></clsb>\n" +
                "<clxh></clxh>\n" +
                "<fdjxh></fdjxh>\n" +
                "<fdjh></fdjh>\n" +
                "<fdjscc></fdjscc>\n" +
                "<filename></filename>\n" +
                "<standard_id></standard_id>\n" +
                "<cllx></cllx>\n" +
                "<syxz></syxz>\n" +
                "<rlzl></rlzl>\n" +
                "<hdzk></hdzk>\n" +
                "<has_egr></has_egr>\n" +
                "<has_oil_ctrl></has_oil_ctrl>\n" +
                "<has_odb></has_odb>\n" +
                "<has_purge></has_purge>\n" +
                "<purge_type></purge_type>\n" +
                "<is_esp_down></is_esp_down>\n" +
                "<sign_type></sign_type>\n" +
                "<drive_form></drive_form>\n" +
                "<drive_mode></drive_mode>\n" +
                "<gyfs></gyfs>\n" +
                "<is_electronic_ctrl></is_electronic_ctrl>\n" +
                "<jqfs></jqfs>\n" +
                "<pl></pl>\n" +
                "<fdjgs></fdjgs>\n" +
                "<ccs></ccs>\n" +
                "<gl></gl>\n" +
                "<edzs></edzs>\n" +
                "<zzl></zzl>\n" +
                "<zbzl></zbzl>\n" +
                "<odo_meter></odo_meter>\n" +
                "<syr></syr>\n" +
                "<zsxxdz></zsxxdz>\n" +
                "<sjhm></sjhm>" +
                "</request>"};
        WebServiceUtils.dynamicCallWebServiceByCXF("http://122.112.209.3:9086/synchrodata/webservice/SynTocity?wsdl", "vehiclelogin",
                "http://synToCity.synchrodata.daniu.com/", params);*/

        //获取待检测列表
        /*Object[] params1= new Object[]{"","32020022"};
        WebServiceUtils.dynamicCallWebServiceByCXF("http://122.112.209.3:9086/synchrodata/webservice/SynTocity?wsdl", "GetCheckList",
                "http://synToCity.synchrodata.daniu.com/", params1);*/

        //获取对应的车辆信息
        /*Object[] params2= new Object[]{"","32020022","41414141"};
        WebServiceUtils.dynamicCallWebServiceByCXF("http://122.112.209.3:9086/synchrodata/webservice/SynTocity?wsdl", "GetVehicle",
                "http://synToCity.synchrodata.daniu.com/", params2);*/

        //上传检测结果
//        Object[] params3 = new Object[]{"",
//                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
//                        "<result>\n" +
//                        "<result_data>\n" +
//                        "<check_id></check_id>\n" +
//                        "<check_type></check_type>\n" +
//                        "<city_code></city_code>\n" +
//                        "<unit_id></unit_id>\n" +
//                        "<line_id> </line_id>\n" +
//                        "<user_id> </user_id>\n" +
//                        "<vehicle_id></vehicle_id>\n" +
//                        "<vin></vin>\n" +
//                        "<plate></plate>\n" +
//                        "<check_date> </check_date>\n" +
//                        "<period_start_date></period_start_date>\n" +
//                        "<period_end_date></period_end_date>\n" +
//                        "<start_time></start_time>\n" +
//                        "<end_time></end_time>\n" +
//                        "<temperature> </temperature>\n" +
//                        "<pressure> </pressure>\n" +
//                        "<humidity> </humidity>\n" +
//                        "<lambda_limit_l></lambda_limit_l>\n" +
//                        "<lambda_limit_h></lambda_limit_h>\n" +
//                        "<lambda> </lambda>\n" +
//                        "<lambda_passed></lambda_passed>\n" +
//                        "<low_co_limit></low_co_limit>\n" +
//                        "<low_co></low_co>\n" +
//                        "<low_co_passed></low_co_passed>\n" +
//                        "<low_hc_limit></low_hc_limit>\n" +
//                        "<low_hc></low_hc>\n" +
//                        "<low_hc_passed></low_hc_passed>\n" +
//                        "<high_co_limit> </high_co_limit>\n" +
//                        "<high_co></high_co>\n" +
//                        "<high_co_passed> </high_co_passed>\n" +
//                        "<high_hc_limit></high_hc_limit>\n" +
//                        "<high_hc></high_hc>\n" +
//                        "<high_hc_passed></high_hc_passed>\n" +
//                        "<passed></passed>\n" +
//                        "</result_data>\n" +
//                        "/*过程数据，可以有多个条 process_data*/\n" +
//                        "<process_data>\n" +
//                        "<time></time>\n" +
//                        "<idle_type></idle_type>\n" +
//                        "<time_no> </time_no>\n" +
//                        "<hc></hc>\n" +
//                        "<co></co>\n" +
//                        " <ywssz></ywssz>\n" +
//                        "<hjwd></hjwd>\n" +
//                        "<xdsd></xdsd>\n" +
//                        "<dqy></dqy>\n" +
//                        "<o2></o2>\n" +
//                        "<co2> </co2>\n" +
//                        "<p_lambda></p_lambda>\n" +
//                        "<rpm></rpm>\n" +
//                        "</process_data>\n" +
//                        "<process_data>\n" +
//                        "<time></time>\n" +
//                        "<idle_type></idle_type>\n" +
//                        "<time_no> </time_no>\n" +
//                        "<hc></hc>\n" +
//                        "<co></co>\n" +
//                        "<o2></o2>\n" +
//                        "<co2> </co2>\n" +
//                        "<p_lambda></p_lambda>\n" +
//                        "<rpm></rpm>\n" +
//                        "</process_data>\n" +
//                        "</result>"
//                , "41414141", 1};
//        WebServiceUtils.dynamicCallWebServiceByCXF("http://122.112.209.3:9086/synchrodata/webservice/SynTocity?wsdl", "UploadInspectionResult",
//                "http://synToCity.synchrodata.daniu.com/", params3);
    }
}
