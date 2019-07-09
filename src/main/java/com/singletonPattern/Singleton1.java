package com.singletonPattern;

/**
 * 饿汉，不管存在不在都new； 消耗大量资源，懒汉可以延时加载
 */
public class Singleton1 {
    private static final Singleton1 single = new Singleton1();
    private Singleton1(){}
    public static Singleton1 getInstance(){
        return single;
    }
}
