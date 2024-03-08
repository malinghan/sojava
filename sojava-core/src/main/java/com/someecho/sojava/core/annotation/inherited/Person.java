package com.someecho.sojava.core.annotation.inherited;

import java.lang.annotation.Annotation;

import org.junit.jupiter.api.Test;

@TestInheritedAnnotation(values = {"value"}, number = 10)
public class Person {
}

