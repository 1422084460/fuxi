package MyCompare;

public class User {

    private int jixiao;
    private int year;
    private boolean hunyin;
    private String name;

    public User(int jixiao, int year, boolean hunyin, String name) {
        this.jixiao = jixiao;
        this.year = year;
        this.hunyin = hunyin;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "jixiao=" + jixiao +
                ", year=" + year +
                ", hunyin=" + hunyin +
                ", name='" + name + '\'' +
                '}';
    }

    public int getJixiao() {
        return jixiao;
    }

    public void setJixiao(int jixiao) {
        this.jixiao = jixiao;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isHunyin() {
        return hunyin;
    }

    public void setHunyin(boolean hunyin) {
        this.hunyin = hunyin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
