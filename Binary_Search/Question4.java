public class Question4{
    public static void main(String[] args){
        int[] ans={-1,-1};
        int[] arr={1,2,2,2,3,4,5};
        int target=2;
        int firstIndex=bs(arr,target,true);
        int lastIndex=bs(arr,target,false);
        ans[0]=firstIndex;
        ans[1]=lastIndex;
        System.out.println("First and Last Index of "+target+" are: "+ans[0]+" , "+ans[1]);
    }
    public static int bs(int[] arr,int target,boolean firstIndex){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            if(arr[mid]==target){
                ans=mid;
                if(firstIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}