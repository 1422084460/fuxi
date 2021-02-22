package com.javacto;

public class test01 {

    //在JAVA中，如何跳出当前的多重嵌套循环？
    public static void main(String[] args) {
        ok:
        for (int i=0;i<5;i++){
            System.out.println(i);
            for (int j=5;j<10;j++){
                if (j==7){
                    System.out.println(j);
                    break ok;
                }
            }
        }

    }
}
