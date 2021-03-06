package com.ysh.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//运行时有效
@Retention(RetentionPolicy.RUNTIME)
//作用于方法
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    String methodName () default "";
}
