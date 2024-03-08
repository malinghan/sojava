package com.someecho.sojava.core.generics.demo06;

import java.util.Iterator;
import java.util.List;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-03-08
 */
public class GenericsDemo {
    /**
     * E extends Comparable  要进行比较，所以 E 需要是可比较的类，因此需要 extends Comparable<…>（注意这里不要和继承的 extends 搞混了，不一样）
     * Comparable< ? super E> 要对 E 进行比较，即 E 的消费者，所以需要用 super
     * 而参数 List< ? extends E> 表示要操作的数据是 E 的子类的列表，指定上限，这样容器才够大
     * @param e1
     * @param <E>
     * @return
     */
    private  <E extends Comparable<? super E>> E max(List<? extends E> e1) {
        if (e1 == null){
            return null;
        }
        //迭代器返回的元素属于 E 的某个子类型
        Iterator<? extends E> iterator = e1.iterator();
        E result = iterator.next();
        while (iterator.hasNext()){
            E next = iterator.next();
            if (next.compareTo(result) > 0){
                result = next;
            }
        }
        return result;
    }
}
