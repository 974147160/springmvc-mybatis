package com.simpleFactoryPattern;

public class Factory {
    public static Vehicle produce(String type){
        Vehicle vehicle = null;
        if(type.equals("car")){
            vehicle = new Car();
            return vehicle;
        }
        if(type.equals("bus")){
            vehicle = new Bus();
            return vehicle;
        }
        if(type.equals("bicycle")){
            vehicle = new Bicycle();
            return vehicle;
        }
        return vehicle;
    }
}
