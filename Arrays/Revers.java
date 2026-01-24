import java.util.Arrays;
public class Revers{
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        int[] rev=new int[arr.length];
        ReverseArray(arr);
        System.out.print("Reversed Array: ");
        System.out.print(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

    public static void ReverseArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}