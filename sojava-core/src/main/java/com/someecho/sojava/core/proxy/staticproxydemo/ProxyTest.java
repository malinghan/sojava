package com.someecho.sojava.core.proxy.staticproxydemo;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-09
 */
public class ProxyTest {
    public static void main(String[] args) {
                SmsService smsService = new SmsServiceImpl();
                SmsProxy smsProxy = new SmsProxy(smsService);
                smsProxy.send("java");
    }
}
