package com.someecho.sojava.core.reflection.classt;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 */
public class ClassTest {
    private static final Logger logger = LoggerFactory.getLogger(ClassTest.class);
    @Test
    public void classTest() throws Exception {
        // 获取Class对象的三种方式
        logger.info("根据类名:  \t" + User.class);
        logger.info("根据对象:  \t" + new User().getClass());
        logger.info("根据全限定类名:\t" + Class.forName("com.someecho.sojava.core.reflection.classt.User"));
        // 常用的方法
        User user = new User();
        Class<?> userClass = user.getClass();
        logger.info("获取全限定类名:\t" + userClass.getName());
        logger.info("获取类名:\t" + userClass.getSimpleName());
        logger.info("实例化:\t" + userClass.newInstance());
    }
}