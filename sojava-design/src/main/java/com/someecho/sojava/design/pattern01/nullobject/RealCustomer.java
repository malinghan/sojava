package com.someecho.sojava.design.pattern01.nullobject;

/**
 * Created by mlh on 2017/12/31.
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
