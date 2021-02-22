package com.javacto;

public class test03 {

    public static void main(String[] args) {
        String str="a,b,c,d,e";
        String[] arr = str.split(",");
        System.out.println(str.length());
        System.out.println(arr.length);
        for (String s:arr){
            System.out.println(s);
        }
    }
}
