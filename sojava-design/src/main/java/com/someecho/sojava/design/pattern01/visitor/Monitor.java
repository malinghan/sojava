package com.someecho.sojava.design.pattern01.visitor;

/**
 * Created by mlh on 2017/12/31.
 */
public class Monitor  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}