package com.someecho.sojava.core.proxy.jdkdynamicdemo;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-09
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        SmsService smsService = (SmsService)
                JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");
    }
}
