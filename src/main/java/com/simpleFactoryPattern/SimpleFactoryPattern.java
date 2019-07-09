package com.simpleFactoryPattern;

public class SimpleFactoryPattern {
   public static void main(String[] args){
       Vehicle vehicle = Factory.produce("bus");
       vehicle.run();
   }
}
