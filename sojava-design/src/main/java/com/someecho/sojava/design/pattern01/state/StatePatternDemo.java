package com.someecho.sojava.design.pattern01.state;

/**
 * Created by mlh on 2017/12/31.
 */
//使用 Context 来查看当状态 State 改变时的行为变化。
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

//        StopState stopState = new StopState();
//        stopState.doAction(context);
//
//        System.out.println(context.getState().toString());
    }
}
