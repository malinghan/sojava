package com.someecho.sojava.core.annotation.inherited;

import java.lang.annotation.Annotation;

import org.junit.jupiter.api.Test;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 */
class Student extends Person {
    @Test
    public void test() {
        Class<Student> clazz = Student.class;
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.toString());
        }
    }
}
