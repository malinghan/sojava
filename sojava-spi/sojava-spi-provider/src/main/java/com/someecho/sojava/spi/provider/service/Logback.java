package com.someecho.sojava.spi.provider.service;

import com.someecho.sojava.spi.face.MyLogger;

public class Logback implements MyLogger {
    @Override
    public void info(String s) {
        System.out.println("Logback info 打印日志：" + s);
    }

    @Override
    public void debug(String s) {
        System.out.println("Logback debug 打印日志：" + s);
    }
}
