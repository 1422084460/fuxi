package meiju;

import java.util.*;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Test1 {

    public static void main(String[] args) {
        MySort sort = MySort.retNums(1);
        System.out.println(sort.getDetail());
        //获取cpu核数
        System.out.println(Runtime.getRuntime().availableProcessors());

        StringBuilder s = new StringBuilder();
        s.append("abcde");
        System.out.println(s.reverse());
        ExecutorService pool = Executors.newFixedThreadPool(3);
        AtomicInteger atomicInteger = new AtomicInteger();
    }
}
