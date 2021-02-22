package fanshe;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class myList {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        //通过反射绕过泛型
        Class c = list.getClass();
        Method method = c.getMethod("add",Object.class);
        method.invoke(list,100);
        for (Object l:list){
            System.out.println(l);
        }
    }
}
