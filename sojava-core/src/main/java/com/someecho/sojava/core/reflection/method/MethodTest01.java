package com.someecho.sojava.core.reflection.method;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 * Method
 * - getMethods()
 * - getDeclaredMethod()
 */
import java.lang.reflect.Method;

public class MethodTest01  {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

        Class<?> clazz = Class.forName("com.someecho.sojava.core.reflection.method.Circle");

        //根据参数获取public的Method,包含继承自父类的方法
        Method method = clazz.getMethod("draw",int.class,String.class);

        System.out.println("输出获取到的method: "+ method);
        System.out.println("========输出所有method信息，包含系统生成的默认方法 getMethods()=================================");
        //获取所有public的方法:
        Method[] methods =clazz.getMethods();
        for (Method m:methods){
            System.out.println("m::"+m);
        }

        System.out.println("================只输出子类的method信息(包含private,不包含系统生成的默认方法), getDeclaredMethod()================================");

        //获取当前类的方法包含private,该方法无法获取继承自父类的method
        Method method1 = clazz.getDeclaredMethod("drawCircle");
        System.out.println("method1::"+method1);
        //获取当前类的所有方法包含private,该方法无法获取继承自父类的method
        Method[] methods1=clazz.getDeclaredMethods();
        for (Method m:methods1){
            System.out.println("m1::"+m);
        }
    }
}

