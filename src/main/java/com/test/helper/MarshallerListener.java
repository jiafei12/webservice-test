package com.test.helper;
import javax.xml.bind.Marshaller;
import java.lang.reflect.Field;

//TODO：监听器是否需要主要取决于厂商传参数的处理，当某个节点为NULL时是否可以不出现此节点
public class MarshallerListener extends Marshaller.Listener {
    public static final String BLANK_STRING = "";
    public static final Double NULL_DOUBLE=0.0;

    @Override
    public void beforeMarshal(Object source) throws IllegalArgumentException {
        super.beforeMarshal(source);
        Field[] fields = source.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                boolean flag=field.get(source)==null;
                System.out.println(field.get(source));
                System.out.println(flag);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            try {
                if ("java.lang.String".equals(field.getType().getName()) && (field.get(source)==null||"".equals(field.get(source))) ){
                    field.set(source, BLANK_STRING);
                    System.out.println("我是String====424242424242424242");

                }
                if ("java.lang.Double".equals(field.getType().getName()) && field.get(source) == null) {
                    field.set(source, NULL_DOUBLE);
                }
                } catch (IllegalAccessException e) {
                //TODO：记录bug
                e.printStackTrace();
            }
        }
    }
}