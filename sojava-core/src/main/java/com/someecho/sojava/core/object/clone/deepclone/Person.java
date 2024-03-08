package com.someecho.sojava.core.object.clone.deepclone;

import com.someecho.sojava.core.object.clone.deepclone.Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Cloneable {
    private Address address;
    // 省略构造函数、Getter&Setter方法
//    @Override
//    public Person clone() {
//        try {
//            Person person = (Person) super.clone();
//            return person;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }

    @Override
    public Person clone() {
        try {
            Person person = (Person) super.clone();
            person.setAddress(person.getAddress().clone());
            return person;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}