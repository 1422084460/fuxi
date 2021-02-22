package com.javacto;

public class digui01 {

    public static void getaaa(int n){
        if (n>5000){
            return;
        }
        System.out.println(n);
        getaaa(n*2);
        System.out.println(n);
    }

    public static void main(String[] args) {
        digui01.getaaa(1237);
    }
}
