package com.javacto;

public class Something {
public static void main(String[] s1) {
Something s = new Something();
System.out.println("s.doSomething() returns " + s.doSomething());
}
public String doSomething() {

    System.out.println(Math.random());
return "Do something ...";
}
}