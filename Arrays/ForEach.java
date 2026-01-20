import java.util.Scanner;
public class ForEach{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int[] arr=new int[sc.nextInt()];
        System.out.println("Enter elements of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements of array are:");
        for(int element:arr){
            System.out.println(element);
        }
    }
}