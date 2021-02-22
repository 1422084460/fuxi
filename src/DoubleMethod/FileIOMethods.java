package DoubleMethod;

import java.io.*;

public class FileIOMethods {

    public static void main(String[] args) throws IOException {
        int score[] = {90,90,96};
        String s = "aaaaabbbbbaaaa";
        File file = new File("D:\\aaa.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        //bufferedWriter.write(s,0,s.length());
        bufferedWriter.write(11);
        bufferedWriter.close();
    }
}
