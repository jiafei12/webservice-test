package com.test;

import lombok.Data;
import org.apache.poi.ss.formula.functions.T;

import java.io.Serializable;

/**
 * @author liuyh
 * @Description: 返回值包装类
 * @date 2019/4/12  9:22
 */
@Data
public class ResponseBuilder implements Serializable {
    /**
     * 返回码   1:成功   0：失败
     **/
    public int code;
    /**
     * 返回码描述
     **/
    public String message;
    /**
     * 响应数据
     **/
    public Object data;
}
