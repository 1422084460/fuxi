package ThreadDetail;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test001 {

    public static void main(String[] args) throws InterruptedException {
        Methods m = new Methods();
        new Thread(()->{
            for (int i = 0; i < 3; i++) {
                m.MethodA();
            }
        },"A").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 3; i++) {
            m.MethodB();
        }
    }
}

class Methods{

    int a = 1;
    Lock lock = new ReentrantLock();
    Condition c1 = lock.newCondition();
    Condition c2 = lock.newCondition();

    public void MethodA(){
        lock.lock();
        try {
            while (a!=1){
                c1.await();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+i);
            }
            a=2;
            c2.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void MethodB(){
        lock.lock();
        try {
            while (a!=2){
                c2.await();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+i);
            }
            a=1;
            c1.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}