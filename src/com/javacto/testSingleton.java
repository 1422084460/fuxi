package com.javacto;

public class testSingleton {

    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        System.out.println(singleton);
    }
}
