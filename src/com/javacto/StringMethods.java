package com.javacto;

public class StringMethods {

    public static void main(String[] args) {
        String str = "HelloWorld!";
        String str2 = " HelloWorld! ";
        String str3 = "    HelloWorld!    ";
        String str4 = "2020/10/31";
        System.out.println("返回字符串长度");
        System.out.println(str.length());
        System.out.println("查找某个字符在该字符串中第一次出现的位置");
        System.out.println(str.indexOf("H"));
        System.out.println(str.indexOf("o"));
        System.out.println("查找某个字符串在该字符串中第一次出现的位置");
        System.out.println(str.indexOf("Hello"));
        System.out.println(str.indexOf("ello"));
        System.out.println("查找某个字符在该字符串中最后一次出现的位置");
        System.out.println(str.lastIndexOf("o"));
        System.out.println("在某个字符串中截取一段字符串");
        System.out.println(str.substring(1,5));
        System.out.println("去除字符串前后的空格");
        System.out.println(str2);
        System.out.println(str2.trim());
        System.out.println(str3);
        System.out.println(str3.trim());
        System.out.println("将字符串转换为小写");
        System.out.println(str.toLowerCase());
        System.out.println("将字符串转换为大写");
        System.out.println(str.toUpperCase());
        System.out.println("取出字符串中指定位置的字符");
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(5));
        System.out.println("按要求分割字符串，最后返回字符串数组");
        String arr[] = str4.split("/");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("将字符串转换为byte数组");
        byte arr2[] = str.getBytes();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println("字符串转换为基本数据类型");
        String a = "123";
        int b=Integer.parseInt(a);
        int c=Integer.valueOf(a);
        System.out.println(b+c);
        System.out.println("基本数据类型转换为字符串");
        int i=123;
        String j=i+"";
        String k=String.valueOf(i);
        System.out.println(j.length());
        System.out.println(k.length());
    }
}
