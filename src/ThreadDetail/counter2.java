package ThreadDetail;

public class counter2 {

    private int j=1;

    private class Inc implements Runnable{
        @Override
        public void run() {
            for (int i=0;i<10;i++){
                inc();
            }
        }
    }

    private class Dec implements Runnable{
        @Override
        public void run() {
            for (int i=0;i<10;i++){
                dec();
            }
        }
    }

    private synchronized void inc(){
        j++;
        System.out.println(Thread.currentThread().getName()+"inc"+j);
    }

    private synchronized void dec(){
        j--;
        System.out.println(Thread.currentThread().getName()+"dec"+j);
    }

    public static void main(String[] args) {
        counter2 c = new counter2();
        Inc inc = c.new Inc();
        Dec dec = c.new Dec();
        Thread thread=null;
        for (int i=0;i<2;i++){
            thread=new Thread(inc);
            thread.start();
            thread=new Thread(dec);
            thread.start();
        }
    }
}
