package com.someecho.sojava.core.generics.demo02;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 */
class Notepad<K, V> {       // 此处指定了两个泛型类型
    private K key;     // 此变量的类型由外部决定
    private V value;   // 此变量的类型由外部决定

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
