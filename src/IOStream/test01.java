package IOliu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class test01 {

    public static void main(String[] args) {

        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("D:\\java\\abc.txt"));
            String name = "aaa";
            out.print(name);
            double d = 3.14;
            System.out.println(d);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
