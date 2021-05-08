package Impl;

public class UserDaoImplB implements UserDao {
    @Override
    public void addUser() {
        System.out.println("实现类B添加方法");
    }

    public void queryUser(){
        System.out.println("独有方法");
    }
}
