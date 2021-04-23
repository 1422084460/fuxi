package SortMethod;

public class SelectSort {

    //选择排序
    public static void main(String[] args) {
        //找出数组最小的数放最前
        int arr[] = {1,5,6,3,8};
        int min;
        int k=0;
        for (int j=0;j<arr.length-1;j++){
            k=j;
            for (int i=j;i<arr.length;i++){
                min=arr[j];
                if (min>arr[i]){
                    min=arr[i];
                    k=i;
                }
            }
            if (k!=j){
                int temp = arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
