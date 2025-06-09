package com.dominikcebula.edu.design.patterns.creational.singleton;

public class BillPughSingleton {

    private static class SingletonCreator{
         private static final BillPughSingleton  instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonCreator.instance;
    }
}
