package com.javacto;

public class UserDao {

    static class User{
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static User addUser(){
        User user = new User(1,"a");
        return user;
    }

    public static void main(String[] args) {
        User user=addUser();
        System.out.println(user);
    }
}
