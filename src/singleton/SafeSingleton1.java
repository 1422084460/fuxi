package singleton;

public class SafeSingleton1 {

    //线程安全的单例模式
    private volatile static SafeSingleton1 singleton = null;

    private SafeSingleton1(){};

    public static SafeSingleton1 getInstance(){
        if (singleton==null){
            synchronized (SafeSingleton1.class){
                if (singleton==null){
                    singleton = new SafeSingleton1();
                }
            }
        }
        return singleton;
    }
}
