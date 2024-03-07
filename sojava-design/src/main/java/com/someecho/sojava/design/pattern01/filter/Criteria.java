package com.someecho.sojava.design.pattern01.filter;

/**
 * Created by mlh on 2017/12/29.
 */
import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}