package singleton;

public class SafeSingleton2 {

    private SafeSingleton2(){
        System.out.println(111);
    };

    private static class Singleton{
        private static SafeSingleton2 singleton;
        static {
            singleton = new SafeSingleton2();
        }
    }

    public static SafeSingleton2 getInstance(){
        return Singleton.singleton;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            new Thread(()->{
                System.out.println(SafeSingleton2.getInstance());
            },String.valueOf(i)).start();
        }
    }
}
