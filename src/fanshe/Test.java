package fanshe;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    private String name;

    public Test(){
        System.out.println("这是Test的无参构造方法");
    }

    private void welcome(String tips){
        System.out.println(tips);
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        /*Class[] p = {String.class};
        Class t = Test.class;
        Method method = t.getDeclaredMethod("welcome",p);
        method.setAccessible(true);
        Test test = new Test();
        Object o[] = {"aaaaaaa"};
        method.invoke(test,o);
        Test test1 = new Test();
        Test test2 = new Test();
        System.out.println(test1==test2);
        Class t1 = test1.getClass();
        Class t2 = test2.getClass();
        System.out.println(t1==t2);*/

        Class c = Class.forName("fanshe.mainMethod");
        Method method = c.getMethod("main",String[].class);
        method.invoke(null,new String[1]);
    }
}
