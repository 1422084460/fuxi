package huawei;

public class test3 {

    public static void main(String[] args) {
        int n=81;
        System.out.println(count(n));


    }

    public static int count(int a){
        if (a<=1){
            return 0;
        }else if (a==3){
            return 1;
        }else if (a==2){
            return 1;
        }else {
            int h=0;
            h=a/3;
            return h+count(a-h*3+h);
        }
    }
}
