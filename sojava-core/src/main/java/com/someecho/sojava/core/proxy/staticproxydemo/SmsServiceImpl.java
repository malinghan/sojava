package com.someecho.sojava.core.proxy.staticproxydemo;

public class SmsServiceImpl implements SmsService {
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}