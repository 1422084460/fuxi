package StreamCompute;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class List2MapTest {

    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();
        User user1 = new User(1,"张三","男",21);
        User user2 = new User(2,"李四","男",22);
        User user3 = new User(3,"王五","男",23);
        User user4 = new User(4,"六六六","男",24);
        User user5 = new User(5,"七七七","男",25);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        Map<Object,User> map = list.stream().collect(Collectors.toMap(x->x.getName()+x.getSex(), y->y));
        System.out.println(map.keySet().toString());
        System.out.println(map.get("张三男"));
        int i=10,y=20;
        if (i<1){
            System.out.println(111);
        }else if (y>1){
            System.out.println(222);
        }else {
            System.out.println(333);
        }
    }
}
