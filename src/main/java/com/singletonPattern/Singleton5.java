package com.singletonPattern;

/**
 * 推荐使用 静态内部类单例模式
 */
public class Singleton5 {
    private static class SingletonHolder{
        private static Singleton5 singleton5 = new Singleton5();
    }
    private Singleton5(){}
    public static Singleton5 getInstance(){
        return SingletonHolder.singleton5;
    }
}
