package com.someecho.sojava.design.pattern01.command;

/**
 * Created by mlh on 2017/12/31.
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
