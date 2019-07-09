package com.singletonPattern;

/**
 * 双重校验锁（指令重排问题）
 * 加上volatile 阻止指令重排
 */
public class Singleton4 {
    private static volatile Singleton4 singleton4 = null;
    private Singleton4(){}
    public static Singleton4 getInstance(){
        if(null == singleton4){
            synchronized (Singleton4.class){
                if(singleton4 == null){
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}
