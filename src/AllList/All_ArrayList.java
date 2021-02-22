package AllList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;

public class All_ArrayList {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(22);
        list.add(1);
        list.add(33);

        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(1);
        ConcurrentHashMap map = new ConcurrentHashMap(32);
        System.out.println(1);
        map.put("a",123);


        System.out.println(map.size());
        /*List list2 = new ArrayList();
        list2.add(22);
        list2.add(1);
        list2.add(333);

        //list.addAll(0,list2);
        System.out.println(list);
        boolean b = list.contains(2);
        System.out.println(b);
        boolean b1 = list.containsAll(list2);
        System.out.println(b1);
        boolean b2 = list.equals(list2);
        System.out.println(b2);
        System.out.println(list.hashCode());
        System.out.println(list.indexOf(1));
        System.out.println(list.iterator().next());
        System.out.println(list.listIterator().nextIndex());
        System.out.println(list.retainAll(list2));
        list.sort((Comparator.comparing(Object::toString)));
        System.out.println(list);
        System.out.println(2>>1);
        System.out.println(2<<1);*/


    }
}
