package com.test.util;

import com.test.helper.MarshallerListener;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/**
 * xml工具类
 *
 * @author liuyh
 * @date 2019/4/12 16:07
 */
public class XmlUtils {
    public static String lt = "<";
    public static String ltEnd = "</";
    public static String rt = ">";
    public static String rhtEnd = "/>";

    /**
     * 将map数据转换为Xml格式数据
     *
     * @param xmlStatement  xml声明
     * @param otherElement  业务元素
     * @param rootElement   根元素
     * @param nestedElement 嵌套元素
     * @return 具有xml格式的String
     */
    public static StringBuffer mapToXml(String xmlStatement, String rootElement, List<Map<Object, Object>> otherElement, String... nestedElement) {
        StringBuffer xmlBuffer = new StringBuffer(xmlStatement);
        if (rootElement != null) {
            xmlBuffer.append(XmlUtils.lt + rootElement + XmlUtils.rt);
            xmlBuffer.append("\r\n");
        }
        for (int i = 0; i < otherElement.size(); i++) {
            xmlBuffer.append(XmlUtils.lt + nestedElement + XmlUtils.rt);
            Map map = otherElement.get(i);
            for (Object key : map.keySet()) {
                xmlBuffer.append(XmlUtils.lt + key + XmlUtils.rt);
                xmlBuffer.append(map.get(key));
                xmlBuffer.append(XmlUtils.ltEnd + key + XmlUtils.rhtEnd);
                xmlBuffer.append("\r\n");
            }
            xmlBuffer.append(XmlUtils.ltEnd + nestedElement + XmlUtils.rhtEnd);
            xmlBuffer.append("\r\n");
        }
        if (rootElement != null) {
            xmlBuffer.append(XmlUtils.ltEnd + rootElement + XmlUtils.rhtEnd);
        }
        return xmlBuffer;
    }

    /**
     * 通过JAXB将bean根据注解转换为xml格式的字符串
     *
     * @param bean              根据bean格式需要转换为Xml格式的javaBean
     * @param customizeFragment 自定义xml的声明文件, 传入null即为使用JAXB默认的头文件
     * @return 转换后的xml
     * @throws JAXBException
     */
    public static String beanToXml(Object bean, String customizeFragment) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(bean.getClass());
        Marshaller marshaller = context.createMarshaller();
        MarshallerListener marshallerListener = new MarshallerListener();
        marshaller.setListener(marshallerListener);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        ByteArrayOutputStream xmlOutStream = new ByteArrayOutputStream();
        if (customizeFragment != null) {
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
            xmlOutStream.write(customizeFragment.getBytes(StandardCharsets.UTF_8));
        }
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
        marshaller.marshal(bean, xmlOutStream);
        return new String(xmlOutStream.toByteArray());


    }

    public static void main(String[] args) {


    }
}


