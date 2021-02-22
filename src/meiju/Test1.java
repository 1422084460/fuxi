package meiju;

public class Test1 {

    public static void main(String[] args) {
        MySort sort = MySort.retNums(1);
        System.out.println(sort.getDetail());
        //获取cpu核数
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
