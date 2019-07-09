package com.singletonPattern;

/**
 * 懒汉 存在多线程并发问题，不是正确写法
 */
public class Singleton2 {
    private static Singleton2 singleton2 = null;
    private Singleton2(){}
    public static Singleton2 getInstance(){
        if(null == singleton2){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
