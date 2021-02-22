package com.javacto;

public class StringBufferAppend {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        String str = "xxxxWorldxxx";
        buffer.append(str,4,9);
        System.out.println(buffer);
        
    }
}
