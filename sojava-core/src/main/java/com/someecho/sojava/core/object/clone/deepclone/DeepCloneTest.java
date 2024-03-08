package com.someecho.sojava.core.object.clone.deepclone;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 * 输出结构就可以看出， person1 的克隆对象和 person1 使用的仍然是同一个 Address 对象。
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        Person person1 = new Person(new Address("武汉"));
        Person person1Copy = person1.clone();
        // true
        System.out.println(person1.getAddress() == person1Copy.getAddress());
    }
}
