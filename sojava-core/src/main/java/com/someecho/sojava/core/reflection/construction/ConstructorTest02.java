package com.someecho.sojava.core.reflection.construction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 * - getDeclaredConstructor
 * - getDeclaringClass
 * - getGenericParameterTypes
 * - getParameterTypes
 * - toGenericString
 */
public class ConstructorTest02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> clazz = null;
        clazz = Class.forName("com.someecho.sojava.core.reflection.construction.User");
        //获取Class对象的引用
        System.out.println("-----获取类的构造器 getDeclaredConstructor-----");
        Constructor cs3 = clazz.getDeclaredConstructor(int.class,String.class);
        System.out.println("-----Constructor对象表示的构造方法的类，getDeclaringClass-----");
        Class uclazz = cs3.getDeclaringClass();
        //Constructor对象表示的构造方法的类
        System.out.println("构造方法的类:"+uclazz.getName());

        System.out.println("-----此 Constructor 对象所表示的方法的形参类型，getGenericParameterTypes-----");
        //对象表示此 Constructor 对象所表示的方法的形参类型
        Type[] tps=cs3.getGenericParameterTypes();
        for (Type tp:tps) {
            System.out.println("参数名称type: "+tp);
        }
        System.out.println("-----获取构造函数参数类型，getParameterTypes-----");
        //获取构造函数参数类型
        Class<?> clazzs[] = cs3.getParameterTypes();
        for (Class claz:clazzs) {
            System.out.println("参数名称:"+ claz.getName());
        }
        System.out.println("-----以字符串形式返回此构造方法的名称, getName-----");
        //以字符串形式返回此构造方法的名称
        System.out.println("getName:"+cs3.getName());

        System.out.println("----返回描述此 Constructor 的字符串，其中包括类型参数，toGenericString-----");
        //返回描述此 Constructor 的字符串，其中包括类型参数。
        System.out.println("toGenericString(): "+cs3.toGenericString());
    }
}
