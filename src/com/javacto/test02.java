package com.javacto;

public class test02 {

    public static void main(String[] args) {
        final StringBuffer a=new StringBuffer("aaa");
        a.append("bbb");
        System.out.println(a);

        String c=new String("foo");
        String b=new String("foo");

        System.out.println(c==b);
        System.out.println(c.equals(b));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


    }

}
