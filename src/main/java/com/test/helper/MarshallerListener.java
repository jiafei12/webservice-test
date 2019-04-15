package com.test.helper;

import com.test.exception.InvokeAccessException;

import javax.xml.bind.Marshaller;
import java.lang.reflect.Field;

/**
 * 初始化JABX(这可能是个小缺陷, 当值为NULL时, 默认不初始化节点)
 * 当实体类某个属性为NULL时, 默认设置初始值
 *
 * @author liuyh
 */
public class MarshallerListener extends Marshaller.Listener {

    private static final String BLANK_STRING = "";
    private static final Double NULL_DOUBLE = 0.0;
    private static final Integer NULL_INTEGER = 0;

    @Override
    public void beforeMarshal(Object source) throws IllegalArgumentException {
        super.beforeMarshal(source);
        Field[] fields = source.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                boolean condition = "java.lang.String".equals(field.getType().getName()) && (field.get(source) == null || "".equals(field.get(source)));
                if (condition) {
                    field.set(source, BLANK_STRING);
                }
                if ("java.lang.Double".equals(field.getType().getName()) && field.get(source) == null) {
                    field.set(source, NULL_DOUBLE);
                }
                if ("java.lang.Integer".equals(field.getType().getName()) && field.get(source) == null) {
                    field.set(source, NULL_INTEGER);
                }
            } catch (IllegalAccessException e) {
                throw new InvokeAccessException(MarshallerListener.class.getName() + " : 类反射没有访问权限");
                //TODO: 日志打印
            }
        }
    }
}