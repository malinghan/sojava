package com.someecho.sojava.core.reflection.classt;

import java.lang.reflect.Field;
/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 * getName、getCanonicalName与getSimpleName的区别：
 * getSimpleName：只获取类名
 * getName：类的全限定名，jvm中Class的表示，可以用于动态加载Class对象，例如Class.forName。
 * getCanonicalName：返回更容易理解的表示，主要用于输出（toString）或log打印，大多数情况下和getName一样，但是在内部类、数组等类型的表示形式就不同了。
 */
public class ClassTest2 {
    interface I1 {
    }
    interface I2 {
    }
    class Cell{
        public int mCellPublic;
    }
    class Animal extends  Cell{
        private int mAnimalPrivate;
        protected int mAnimalProtected;
        int mAnimalDefault;
        public int mAnimalPublic;
        private static int sAnimalPrivate;
        protected static int sAnimalProtected;
        static int sAnimalDefault;
        public static int sAnimalPublic;
    }
    class Dog extends Animal implements I1, I2 {
        private int mDogPrivate;
        public int mDogPublic;
        protected int mDogProtected;
        private int mDogDefault;
        private static int sDogPrivate;
        protected static int sDogProtected;
        static int sDogDefault;
        public static int sDogPublic;
    }


        public static void main(String[] args) throws IllegalAccessException, InstantiationException {
            Class<Dog> dog = Dog.class;
            //类名打印
            System.out.println("类的全限定名: " + dog.getName()); //com.cry.Dog
            System.out.println("只获取类名:  " + dog.getSimpleName()); //Dog
            System.out.println("返回更容易理解的表示: " + dog.getCanonicalName());//com.cry.Dog
            //接口
            System.out.println("是否是接口:" + dog.isInterface()); //false

            System.out.println("----输出接口列表----"); //false
            for (Class iI : dog.getInterfaces()) {
                System.out.println(iI);
            }
            System.out.println("-------------------");
         /*
          interface com.cry.I1
          interface com.cry.I2
         */

            //父类
            System.out.println("父类：" + dog.getSuperclass());//class com.cry.Animal
            //创建对象
//            Dog d = dog.newInstance();
            //字段
            System.out.println("--------输出字段信息，包括父类-----------");
            for (Field f : dog.getFields()) {
                System.out.println(f.getName());
            }
            System.out.println("-------------------");
        /*
            mDogPublic
            sDogPublic
            mAnimalPublic
            sAnimalPublic
            mCellPublic  //父类的父类的公共字段也打印出来了
         */
            System.out.println("----输出只有自己类声明的字段-----");
            for (Field f : dog.getDeclaredFields()) {
                System.out.println(f.getName());
            }
            /** 只有自己类声明的字段
             mDogPrivate
             mDogPublic
             mDogProtected
             mDogDefault
             sDogPrivate
             sDogProtected
             sDogDefault
             sDogPublic
             */
        }
}
