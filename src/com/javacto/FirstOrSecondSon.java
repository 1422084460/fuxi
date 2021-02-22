package com.javacto;

public class FirstOrSecondSon extends FirstOrSecondFather{
    static {
        System.out.println("子类静态代码块");
    }

    String str;

    public FirstOrSecondSon(String str) {
        this.str = str;
        System.out.println("111");
    }

    public FirstOrSecondSon() {
        System.out.println("子类构造方法");
    }

    public static void main(String[] args) {
        FirstOrSecondSon s = new FirstOrSecondSon("a");
        //System.out.println("------------------");
        //FirstOrSecondSon s2 = new FirstOrSecondSon();

    }
}
