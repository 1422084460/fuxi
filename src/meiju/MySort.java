package meiju;

public enum MySort {

    ONE(1,"第一个"),
    TWO(2,"第二个");

    private int id;
    private String detail;

    MySort(int id, String detail) {
        this.id = id;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public String getDetail() {
        return detail;
    }

    public static MySort retNums(int id){
        MySort[] values = MySort.values();
        for (MySort value:values) {
            if (value.getId()==id){
                return value;
            }
        }
        return null;
    }
}
