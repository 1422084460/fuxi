package MyCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test1 {

    public static void main(String[] args) {
        User user1 = new User(10,5,true,"张三");
        User user2 = new User(8,4,true,"李四");
        User user3 = new User(8,6,false,"王五");
        User user4 = new User(8,6,true,"王五2");
        User user5 = new User(8,6,true,"王五2");

        List list = new ArrayList();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        Collections.sort(list,new Comparator<User>() {

            @Override
            public int compare(User o1, User o2) {
                if (o1.getJixiao()==o2.getJixiao()){
                    if (o2.getYear()==o1.getYear()){
                        if (Boolean.compare(o2.isHunyin(),o1.isHunyin())==0){
                            return o1.hashCode()-o2.hashCode();
                        }
                        return Boolean.compare(o2.isHunyin(),o1.isHunyin());
                    }
                    return o2.getYear()-o1.getYear();
                }
                return o2.getJixiao()-o1.getJixiao();
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });

        for(Object u:list){
            System.out.println(u);
        }
    }
}
