package com.someecho.sojava.design.pattern01.business_delegate;

/**
 * Created by mlh on 2018/1/1.
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}