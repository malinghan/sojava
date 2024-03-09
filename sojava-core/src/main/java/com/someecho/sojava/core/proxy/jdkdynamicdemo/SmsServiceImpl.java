package com.someecho.sojava.core.proxy.jdkdynamicdemo;

public class SmsServiceImpl implements SmsService {
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}