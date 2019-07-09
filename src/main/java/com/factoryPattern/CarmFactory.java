package com.factoryPattern;

public class CarmFactory implements Factorym {
    @Override
    public Verhiclem produce(){
        return new Carm();
    }
}
