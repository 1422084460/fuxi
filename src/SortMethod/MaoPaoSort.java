package SortMethod;

public class MaoPaoSort {

    //冒泡排序
    public static void main(String[] args) {
        //相邻元素两两比较
        int arr[] = {1,5,6,3,8};
        //要求从小到大排序
        for (int j=arr.length-1;j>0;j--){
            for (int i = 0; i < j; i++) {
                if (arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
