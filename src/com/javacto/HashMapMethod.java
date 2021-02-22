package com.javacto;

import java.util.*;

public class HashMapMethod {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"aa");
        map.put(3,"cc");
        map.put(2,"bb");
        map.put(4,"dd");
        map.put(6,"dd");
        map.put(5,"dd");
        System.out.println(map);
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        System.out.println(set);
        List<Map.Entry<Integer,String>> list = new ArrayList<>(set);
        System.out.println(list);
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o2.getKey()-o1.getKey();
            }
        });
        System.out.println(list);
        LinkedHashMap<Integer,String> map1 = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry:list){
            map1.put(entry.getKey(),entry.getValue());
        }
        System.out.println(map1);
    }
}
