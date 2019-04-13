package com.test.util;

import com.test.dto.Result.VehicleLoginReponse;
import com.test.dto.TwoSpeedIdleDTO;
import com.test.dto.TwoSpeedIdleInfoDTO;
import com.test.dto.TwoSpeedIdleResultDTO;
import com.test.dto.VehicleLoginDTO;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.util.HashMap;

public class MarshallerFactory {
    private final static HashMap<Class, JAXBContext> JAXB_CONTEXT_MAP = new HashMap();

    private MarshallerFactory() {
    }

    static {
        try {
            // 想要进行的bean转换的类，可以写在这里，初始化到Map中
            JAXB_CONTEXT_MAP.put(VehicleLoginDTO.class, JAXBContext.newInstance(VehicleLoginDTO.class));
            JAXB_CONTEXT_MAP.put(TwoSpeedIdleResultDTO.class, JAXBContext.newInstance(TwoSpeedIdleResultDTO.class));
            JAXB_CONTEXT_MAP.put(TwoSpeedIdleInfoDTO.class, JAXBContext.newInstance(TwoSpeedIdleInfoDTO.class));
            JAXB_CONTEXT_MAP.put(TwoSpeedIdleDTO.class, JAXBContext.newInstance(TwoSpeedIdleDTO.class));
            JAXB_CONTEXT_MAP.put(VehicleLoginReponse.class, JAXBContext.newInstance(VehicleLoginReponse.class));

        } catch (Exception e) {
            // 打印日志
        }
    }

    public static Marshaller getMarshaller(Class t) throws JAXBException {
        JAXBContext jaxbContext = JAXB_CONTEXT_MAP.get(t);
        if (jaxbContext == null) {
            return null;
        }

        return jaxbContext.createMarshaller();
    }

    public static Unmarshaller getUnmarshaller(Class t) throws JAXBException {
        JAXBContext jaxbContext = JAXB_CONTEXT_MAP.get(t);
        if (jaxbContext == null) {
            return null;
        }
        return jaxbContext.createUnmarshaller();
    }
}
