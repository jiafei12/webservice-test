package com.test.exception;

/**
 * 类反射异常, 没有访问权限(试图修改javaBean中的private属性)
 *
 * @author liuyh
 * @date 2019/4/11 16:31
 */
public class InvokeAccessException extends RuntimeException {

    public InvokeAccessException(String message) {
        super(message);
    }

}
