package StringMethods;

import java.util.*;
import java.util.stream.Collectors;

public class testBasic {
    public static void main(String[] args) {
        /*Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> entry = iterator.next();
            System.out.println(entry.getKey());
        }*/
        int a[]={5,4,3,2,1};
        //ArrayList list = new ArrayList(Arrays.asList(a));
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(list);
        Object[] array = list.toArray();
        System.out.println(array.toString());
        System.out.println(a);
    }
}
