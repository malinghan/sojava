package com.someecho.sojava.core.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 */
class B extends A {

    /**
     * 重载父类的test方法
     */
    @Override
    public void test() {
    }

    /**
     * 被弃用的方法
     */
    @Deprecated
    public void oldMethod() {
    }

    /**
     * 忽略告警
     */
    @SuppressWarnings("rawtypes")
    public List processList() {
        List list = new ArrayList();
        return list;
    }
}
