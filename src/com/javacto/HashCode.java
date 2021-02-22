package com.javacto;

public class HashCode {

    public static void main(String[] args) {
        String str1 = "aaa";
        String str2 = new String("bb");
        Integer a=1;
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1==str2);
        System.out.println(a.hashCode());
    }
}
