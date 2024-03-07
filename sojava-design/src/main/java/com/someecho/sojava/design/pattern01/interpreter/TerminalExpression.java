package com.someecho.sojava.design.pattern01.interpreter;

/**
 * Created by mlh on 2017/12/31.
 * 创建实现了上述接口的实体类。
 */
public class TerminalExpression implements Expression {
    private String data;
    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
