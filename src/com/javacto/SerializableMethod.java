package com.javacto;

import java.io.*;

public class SerializableMethod {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("D:\\aaa.txt")));
        objectOutputStream.writeObject(new User(1,"aaa"));
        objectOutputStream.flush();
        objectOutputStream.close();*/

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("D:\\aaa.txt")));
        User user = (User)objectInputStream.readObject();
        System.out.println(user);
        objectInputStream.close();
    }

}
