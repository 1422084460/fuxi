package StringMethods;

import java.util.AbstractSet;

public class Test02 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        System.out.println(new Test02().test());
        float f=0.6f;
        
    }

    static int test(){
        int i=1;
        try {
            i++;
            return i;
        }finally {
            ++i;
        }
    }
}
