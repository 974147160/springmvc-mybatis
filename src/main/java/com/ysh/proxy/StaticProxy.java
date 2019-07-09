package com.ysh.proxy;

public class StaticProxy {

    public static void main(String[] args) {
        /**
         * 为每个RealSubject创建一个proxy代理类
         */
        Proxy proxy = new Proxy(new RealSubject());
        proxy.operation();
    }
}

/**
 * 抽象主题库
 */
abstract class Subject {
    abstract void operation();
}

/**
 * 真实主题库
 */
class RealSubject extends Subject {
    @Override
    void operation() {
        System.out.println("operation ...");
    }
}

/**
 * 代理类
 */
class Proxy extends Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    void operation() {
        this.preOperation();
        subject.operation();
        this.postOperation();
    }

    void preOperation() {
        System.out.println("pre operation...");
    }

    void postOperation() {
        System.out.println("post operation...");
    }
}
