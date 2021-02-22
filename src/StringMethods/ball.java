package StringMethods;

interface aa{
    void play();
}

interface bb{
    void play();
}

interface cc extends aa,bb{
    ball b = new ball("ball1");
}

public class ball implements cc{
    private String name;

    public String getName() {
        return name;
    }

    public ball(String name) {
        this.name = name;
    }

    public void play(){
        ball b= new ball("ball2");
        System.out.println(b.getName());
    }
}
