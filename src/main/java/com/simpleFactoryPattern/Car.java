package com.simpleFactoryPattern;

public class Car implements Vehicle {
    @Override
    public void run(){
        System.out.println("car running ...");
    }
}
