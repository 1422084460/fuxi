package CASMethod;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class SpinLockDemo {

    AtomicReference<Thread> atomicReference = new AtomicReference<>();

    public void myLock(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+"进来了");
        while (!atomicReference.compareAndSet(null,thread)){

        }
        System.out.println(thread.getName()+"开始做事");
    }

    public void myUnLock(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+"出去了");
        while (!atomicReference.compareAndSet(thread,null)){

        }
    }

    public static void main(String[] args) {
        SpinLockDemo spinLockDemo = new SpinLockDemo();

        new Thread(()->{
            spinLockDemo.myLock();
            try {
                TimeUnit.SECONDS.sleep(4);
            }catch (Exception e){
                e.printStackTrace();
            }
            spinLockDemo.myUnLock();
        },"A").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            spinLockDemo.myLock();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLockDemo.myUnLock();
        },"B").start();
    }
}
