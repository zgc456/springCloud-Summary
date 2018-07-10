package com.zheng;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/3 10:17
 */
public class ConvertList {
    /**
     *用于对象的类型转换
     * @param t  参数1 空集合
     * @param r  参数2 有值集合
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T,R> T convert(T t,R r){
        BeanUtils.copyProperties(r,t);
        return t;
    }

    /**
     *
     * @param entity1 有值集合
     * @param entity2 没值集合
     * @param name  entity1的类型全称如：com.zhkj.name
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T,R> List<T> convertToList(List<T> entity1, List<R> entity2, String name){
        entity1 = Lists.transform(entity2, new Function<R, T>() {
            @Override
            public T apply(R input) {
                T t = null;
                try {
                    t = (T) Class.forName(name).newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                BeanUtils.copyProperties(input,t);
                return (T) t;
            }
        });
        return entity1;
    }
}
