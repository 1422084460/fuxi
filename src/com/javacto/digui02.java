package com.javacto;

public class digui02 {

    static int i=0;

    public static int getbbb(int age){
        i++;
        if (i>8){
            return age;
        }
        getbbb(age+2);
        return age;
    }

    public static void main(String[] args) {
        int a=digui02.getbbb(10);
    }
}
