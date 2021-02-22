package com.javacto;

import java.io.*;

public class IoProblem {

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\java\\upload\\aaa.jpg");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(new File("D:\\bbb.jpg"));
        byte[] b = new byte[1024];
        while (fis.read(b)!=-1){
            fos.write(b);
        }
        fos.close();
        fis.close();
    }
}
