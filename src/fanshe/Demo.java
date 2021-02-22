package fanshe;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class c = Class.forName(getValue("className"));
        Method method = c.getMethod(getValue("methodName"));
        Object obj = c.getConstructor().newInstance();
        method.invoke(obj);
    }

    public static String getValue(String key) throws FileNotFoundException {
        Properties properties = new Properties();
        String path="src/fanshe/xinxi.txt";
        InputStream is = new FileInputStream(new File(path));
        try {
            properties.load(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }
}
