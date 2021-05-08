package Impl;

public class Test {

    public static void main(String[] args) {
        //采用 接口 对象 = new 实现类
        UserDao A = new UserDaoImplA();
        UserDao B = new UserDaoImplB();

        //采用 实现类 对象 = new 实现类
        UserDaoImplA A2 = new UserDaoImplA();
        UserDaoImplB B2 = new UserDaoImplB();

        A.addUser();
        B.addUser();
        A2.addUser();
        B2.addUser();
        B2.queryUser();

        //结论，如果实现类里都是接口中的方法，没有自定义方法，采用 接口 对象 = new 实现类
        //如果需要用到实现类自己定义的方法，采用 实现类 对象 = new 实现类
    }
}
