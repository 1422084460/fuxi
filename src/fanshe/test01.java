package fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test01 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class a=Class.forName("java.util.Date");
        System.out.println(a);
        System.out.println("---------------");
        String s="abc";
        Class b = s.getClass();
        System.out.println(b.getName());
        System.out.println("---------------");
        Class c = Boolean.TYPE;
        System.out.println(c);
        System.out.println("---------------");
        Class[] p = {String.class};
        Class t = Test.class;
        Method method = t.getDeclaredMethod("welcome",p);
        method.setAccessible(true);
        //Test test = new Test();
        Constructor constructor = t.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object test = constructor.newInstance();
        Object o[] = {"aaaaaaa"};
        method.invoke(test,o);
        System.out.println("---------------");
        Field field = t.getDeclaredField("name");
        field.setAccessible(true);
        field.set(test,"张三");
        System.out.println(field.get(test));
    }
}
