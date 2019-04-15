package com.test.dto.result;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *  webService上传检测结果
 * @author liuyh
 * @date 2019/4/15 16:03
 */
@Data
@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class UploadInspectionResult {
    /**
     * 方法调用结果： 0---失败  1---成功
     */
    @XmlElement(name = "status")
    public String status;
    /**
     * 方法调用信息
     */
    @XmlElement(name = "errMsg")
    public String message;
}
