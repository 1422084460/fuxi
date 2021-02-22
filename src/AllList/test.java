package AllList;

import java.util.List;
import java.util.TreeMap;
import java.util.Vector;

public class test {

    public static void main(String[] args) throws InterruptedException {
        TreeMap treeMap = new TreeMap();
        while (true){
            treeMap.put("1","a");
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
