package org.cc.function;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 日积月累
 * @Author cc
 * @Create 2023/9/21 22:20
 **/
public class Accumulate {
    /**
     * 通过反射获取常量类中的量，并返回一个Object列表
     * @param constantClass
     * @return
     * @param <T>
     */
    public static <T> List<Object> getAllConstants(Class<T> constantClass) {
        List<Object> constantList = new ArrayList<>();
        try {
            Field[] fields = constantClass.getDeclaredFields();

            for (Field field : fields) {
                constantList.add(field.get(null));
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return constantList;
    }


}
