package com.someecho.sojava.design.pattern01.composite_entitty;

/**
 * Created by mlh on 2018/1/1.
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
