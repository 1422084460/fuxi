package AllList;

import com.sun.xml.internal.ws.util.CompletedFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


public class Locks {

    volatile static boolean flag = true;

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        new Thread(() -> {
            while (flag) {
                //System.out.println(1);
            }
        }).start();
        TimeUnit.SECONDS.sleep(1);
        flag=false;
        System.out.println("停止");
    }
}
