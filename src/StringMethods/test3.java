package StringMethods;

public class test3 {

    public static void main(String[] args) {
        String str = " abc.abc.abc ";
        String str2 = str.replace(".","/");
        System.out.println(str2);
        String str3 = "123456789";
        System.out.println(str3.indexOf(9));
        System.out.println(str);
        System.out.println(str.trim());
        System.out.println(Integer.parseInt("123"));
        char[] a = {'a','b','c'};
        System.out.println(a.toString());
    }
}
