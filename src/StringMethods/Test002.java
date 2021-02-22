package StringMethods;

public class Test002 {

    public static void main(String[] args) {
        String s1 = new String("1")+new String("1");
        String s2 = "11";
        String s3 = s1.intern();
        System.out.println(s3==s2);
    }
}
