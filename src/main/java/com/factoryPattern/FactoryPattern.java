package com.factoryPattern;

public class FactoryPattern {
    public static void main(String[] args){
        Verhiclem verhiclem = new CarmFactory().produce();
        verhiclem.run();
    }
}
