package mormal;

import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        String str = "qtwertytty";
        char arr[] = str.toCharArray();
        List list = new ArrayList();
        for (int i=0;i<arr.length;i++){
            if (!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        System.out.println(list.toString());
    }
}
