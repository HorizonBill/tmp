package com.mf.test;

import java.lang.reflect.Field;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ListSortUtil {

    /**
     * 给list排序
     * @param list 需要排序的集合
     * @param isAsc true 升序；false 降序
     * @param sortName list集合中需要排序的元素属性名称，动态数组
     * @param <T>
     */
    public static <T> void sort(List<T> list, final boolean isAsc, final String... sortName){
        Collections.sort(list, new Comparator<T>() {
            public int compare(T a, T b){
                int ret = 0;
                try {
                    for (int i = 0; i < sortName.length; i ++){
                        ret = ListSortUtil.compareObject(sortName[i], isAsc, a, b);
                        if (0 != ret)
                            break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return ret;
            }
        });
    }

    /**
     * 比较方法
     * @param sortName 排序的元素
     * @param isAsc  true 升序； false 降序
     * @param t1    实例
     * @param t2    实例
     * @param <T>
     * @return
     * @throws Exception
     */
    private static <T> int compareObject(final String sortName, final boolean isAsc, T t1, T t2) throws Exception {
        int ret;
        Object value1 = forceGetFieldValue(t1, sortName);
        Object value2 = forceGetFieldValue(t2, sortName);
        String str1 = value1.toString();
        String str2 = value2.toString();
        //为数字类型时转换成指定长度的字符串
        if (value1 instanceof Number && value1 instanceof Number) {
            //获取需要比较的属性值最大长度，保持数据精度
            int maxlen = Math.max(str1.length(), str2.length());
            str1 = addZero2Str((Number) value1, maxlen);
            str2 = addZero2Str((Number) value2, maxlen);
        }else if (value1 instanceof Date && value2 instanceof Date) {
            long time1 = ((Date) value1).getTime();
            long time2 = ((Date) value2).getTime();
            //获取需要比较的属性值最大长度，保持数据精度， 把时间转换为数字再转换为字符串
            int maxlen = Long.toString(Math.max(time1, time2)).length();
            str1 = addZero2Str(time1, maxlen);
            str2 = addZero2Str(time2, maxlen);
        }
        //排序方式
        if (isAsc){
            ret = str1.compareTo(str2);
        }else {
            ret = str2.compareTo(str1);
        }
        return ret;
    }

    /**
     * 给数字对象按照指定长度在左侧补0， 并转换成字符串
     * 例如： addZero2Str(11, 4) ---> 0011
     * @param numObj  数字对象
     * @param length  指定的长度
     * @return
     */
    public static String addZero2Str(Number numObj, int length){
        NumberFormat nf = NumberFormat.getInstance();
        //设置是否使用分组
        nf.setGroupingUsed(false);
        //设置最大整数位数
        nf.setMaximumIntegerDigits(length);
        //设置最小整数位数
        nf.setMinimumIntegerDigits(length);
        return nf.format(numObj);
    }

    /**
     * 通过反射方式获取指定对象的指定属性值(去除private，protected的限制)
     * @param obj  属性名称所属的对象
     * @param fieldName  属性名称
     * @return
     * @throws Exception
     */
    public static Object forceGetFieldValue(Object obj, String fieldName) throws Exception {
        Field field = obj.getClass().getDeclaredField(fieldName);
        Object object = null;
        boolean accessible = field.isAccessible();
        if (!accessible) {
            //如果private，protected修饰的属性，需要修改为可以访问的
            field.setAccessible(true);
            object = field.get(obj);
            //还原private，protected属性的访问性质
            field.setAccessible(accessible);
            return object;
        }
        object = field.get(obj);
        return object;
    }
}
