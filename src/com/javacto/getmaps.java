package com.javacto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class getmaps {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("张三",1);
        map.put("李四",1);
        map.put("张三",2);
        map.put("李四",2);
        map.put("张三",3);
        Integer value = (Integer)map.get("张三");
        System.out.println(value);
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String key = (String) iterator.next();
            Integer v = (Integer)map.get(key);
            if (v>1){
                System.out.println(key+":"+v);
            }
        }
    }
}
