package com.someecho.sojava.core.reflection.field;

import java.lang.reflect.Field;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 */
public class FieldTest02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, NoSuchFieldException {
        //获取Class对象引用
        Class<?> clazz = Class.forName("com.someecho.sojava.core.reflection.field.Student");
        System.out.println("------------获取到实例的字段，然后赋值--------------");
        Student st= (Student) clazz.newInstance();
        //获取父类public字段并赋值
        Field ageField = clazz.getField("age");
        ageField.set(st,18);
        Field nameField = clazz.getField("name");
        nameField.set(st,"Lily");

        //只获取当前类的字段,不获取父类的字段
        System.out.println("------------只获取当前类的字段,不获取父类的字段，获取到实例的字段，然后赋值--------------");
        Field descField = clazz.getDeclaredField("desc");
        descField.set(st,"I am student");
        Field scoreField = clazz.getDeclaredField("score");
        //设置可访问，score是private的
        System.out.println("------------设置可访问，score是private的--------------");
        scoreField.setAccessible(true);
        scoreField.set(st,88);
        System.out.println(st.toString());
        //输出结果：Student{age=18, name='Lily ,desc='I am student', score=88}
        //获取字段值
        System.out.println(scoreField.get(st));
        // 88
    }
}

