package huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] array = str.toCharArray();
        StringBuilder s = new StringBuilder();
        Set set = new HashSet();
        for (int i=0;i<array.length;i++){
            if (set.add(array[i])) {
                s.append(array[i]);
            }
        }
        System.out.println(s.toString());
    }
}
