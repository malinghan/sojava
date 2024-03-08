package com.someecho.sojava.core.generics.demo06;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 */
public class Me extends Staff implements Passenger   {
    @Override
    public boolean isStanding() {
        return false;
    }
}
