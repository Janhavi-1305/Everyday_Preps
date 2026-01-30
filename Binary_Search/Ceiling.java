public class Ceiling{
    public static void main(String[] args){
        int[] arr = {2,3,5,9,14,16,18};
        int target = 7;
        int result = ceiling(arr, target);
        System.out.println("Ceiling of " + target + " is: " + result);
    }
    public static int ceiling(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return arr[start];
    }
}