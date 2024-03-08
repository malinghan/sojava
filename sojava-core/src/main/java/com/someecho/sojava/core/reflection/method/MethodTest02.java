package com.someecho.sojava.core.reflection.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 * Method
 * - getMethod
 * - getDeclaredMethod
 * - invoke
 */
public class MethodTest02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
            InvocationTargetException{
        Class<?> clazz = Class.forName("com.someecho.sojava.core.reflection.method.Circle");
        //创建对象
        Circle circle = (Circle) clazz.newInstance();

        //获取指定参数的方法对象Method
        Method method = clazz.getMethod("draw", int.class, String.class);

        //通过Method对象的invoke(Object obj,Object... args)方法调用
        method.invoke(circle,15,"圈圈");

        //对私有无参方法的操作
        Method method1 = clazz.getDeclaredMethod("drawCircle");
        //修改私有方法的访问标识
        method1.setAccessible(true);
        method1.invoke(circle);

        //对有返回值得方法操作
        Method method2 = clazz.getDeclaredMethod("getAllCount");
        Integer count = (Integer) method2.invoke(circle);
        System.out.println("count:"+count);
    }
}