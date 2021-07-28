package SynchronizedTest;

import java.util.concurrent.TimeUnit;

public class Test {

    private static int j=0;
    private static Test t;

    public static void main(String[] args) {

        t = new Test();

        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                t.doSomething();
                //System.out.println(Thread.currentThread().getName());
            },""+i).start();
        }

        try {
            TimeUnit.SECONDS.sleep(10);
            System.out.println("====="+j);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public synchronized void doSomething(){
        j++;
    }
}
