package com.someecho.sojava.core.annotation.example.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 */
public class HelloWorldTest1 {
    private HelloWorld hw;

    @Before
    public void setUp() {
        hw = new HelloWorld();
    }

//    @Test( excepted = NumberFormatException.class)
    // 1.测试没有返回值,有别于junit3的使用，更加方便
    public void testHello() {
        hw.sayHello();
    }
    @Test
    public void testWorld() {
        hw.sayWorld();
    }

    @Test
    // 2.测试有返回值的方法
    // 返回字符串
    public void testSay() {
        assertEquals("测试失败", hw.say(), "hello world!");
    }

    @Test
    // 返回对象
    public void testObj() {
        assertNull("测试对象不为空", null);
        assertNotNull("测试对象为空", new String());
    }

    @After
    public void tearDown() throws Exception {
        hw = null;
    }

}