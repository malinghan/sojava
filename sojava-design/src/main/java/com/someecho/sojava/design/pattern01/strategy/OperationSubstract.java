package com.someecho.sojava.design.pattern01.strategy;

/**
 * Created by mlh on 2017/12/31.
 */
public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
