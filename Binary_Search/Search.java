public class Search{
    public static void main(String[] args){
        int[] arr={-12,-4,-2,0,3,5,6,7,11,15,34};
        int target=12;
        int result=binarySearch(arr,target);
        System.out.println("Element found at index: "+result);
    }

    public static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}