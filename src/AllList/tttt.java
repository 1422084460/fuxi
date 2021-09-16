package AllList;

public class tttt
{
    public static tttt t1 = new tttt();
    {
        System.out.println("blockA");
    }
    static
    {
        System.out.println("blockB");
    }
    public static void main(String[] args)
    {
        tttt t2 = new tttt();
    }
}
