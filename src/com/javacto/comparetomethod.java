package com.javacto;

import java.util.Arrays;

public class comparetomethod {

    public static void main(String[] args) {
        String a[]={"1","3","66","7"};
        int c[]={1,3,66,7};
        String b="5";
        System.out.println(a[0].compareTo(b));
        System.out.println(a[2].compareTo(b));
        Arrays.sort(c);
        for (int i=0;i<c.length;i++){
            System.out.println(a[i]);
        }
    }
}
