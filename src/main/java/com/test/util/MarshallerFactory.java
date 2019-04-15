package com.test.util;

import com.test.dto.*;
import com.test.dto.result.UploadInspectionResult;
import com.test.dto.result.VehicleLoginReponse;
import com.test.dto.result.VehicleLoginResult;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.util.HashMap;

/**
 * JABX
 * @author liuyh
 */
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
            JAXB_CONTEXT_MAP.put(TroubleCodeDTO.class, JAXBContext.newInstance(TroubleCodeDTO.class));
            JAXB_CONTEXT_MAP.put(SteadyConditionResultDTO.class, JAXBContext.newInstance(SteadyConditionResultDTO.class));
            JAXB_CONTEXT_MAP.put(SteadyConditionInfoDTO.class, JAXBContext.newInstance(SteadyConditionInfoDTO.class));
            JAXB_CONTEXT_MAP.put(SteadyConditionDTO.class, JAXBContext.newInstance(SteadyConditionDTO.class));
            JAXB_CONTEXT_MAP.put(SimpleTransientResultDTO.class, JAXBContext.newInstance(SimpleTransientResultDTO.class));
            JAXB_CONTEXT_MAP.put(SimpleTransientInfoDTO.class, JAXBContext.newInstance(SimpleTransientInfoDTO.class));
            JAXB_CONTEXT_MAP.put(SimpleTransientDTO.class, JAXBContext.newInstance(SimpleTransientDTO.class));
            JAXB_CONTEXT_MAP.put(OpaqueSmokeResultDTO.class, JAXBContext.newInstance(OpaqueSmokeResultDTO.class));
            JAXB_CONTEXT_MAP.put(OpaqueSmokeInfoDTO.class, JAXBContext.newInstance(OpaqueSmokeInfoDTO.class));
            JAXB_CONTEXT_MAP.put(OpaqueSmokeDTO.class, JAXBContext.newInstance(OpaqueSmokeDTO.class));
            JAXB_CONTEXT_MAP.put(LugDownResultDTO.class, JAXBContext.newInstance(LugDownResultDTO.class));
            JAXB_CONTEXT_MAP.put(LugDownInfoDTO.class, JAXBContext.newInstance(LugDownInfoDTO.class));
            JAXB_CONTEXT_MAP.put(LugDownDTO.class, JAXBContext.newInstance(LugDownDTO.class));
            JAXB_CONTEXT_MAP.put(IUPRDTO.class, JAXBContext.newInstance(IUPRDTO.class));
            JAXB_CONTEXT_MAP.put(GasolineCarOBDResultDTO.class, JAXBContext.newInstance(GasolineCarOBDResultDTO.class));
            JAXB_CONTEXT_MAP.put(GasolineCarOBDInfoDTO.class, JAXBContext.newInstance(GasolineCarOBDInfoDTO.class));
            JAXB_CONTEXT_MAP.put(GasolineCarOBDDTO.class, JAXBContext.newInstance(GasolineCarOBDDTO.class));
            JAXB_CONTEXT_MAP.put(DieselCarOBDResultDTO.class, JAXBContext.newInstance(DieselCarOBDResultDTO.class));
            JAXB_CONTEXT_MAP.put(DieselCarOBDInfoDTO.class, JAXBContext.newInstance(DieselCarOBDInfoDTO.class));
            JAXB_CONTEXT_MAP.put(DieselCarOBDDTO.class, JAXBContext.newInstance(DieselCarOBDDTO.class));
            JAXB_CONTEXT_MAP.put(ControlUnitDTO.class, JAXBContext.newInstance(ControlUnitDTO.class));
            JAXB_CONTEXT_MAP.put(AppearanceInspectionDTO.class, JAXBContext.newInstance(AppearanceInspectionDTO.class));
            JAXB_CONTEXT_MAP.put(VehicleLoginResult.class, JAXBContext.newInstance(VehicleLoginResult.class));
            JAXB_CONTEXT_MAP.put(VehicleLoginReponse.class, JAXBContext.newInstance(VehicleLoginReponse.class));
            JAXB_CONTEXT_MAP.put(UploadInspectionResult.class, JAXBContext.newInstance(UploadInspectionResult.class));

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
