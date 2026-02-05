public class SplitArray {
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        int m=2;
        System.out.println(new SplitArray().spitArray(nums,m));
    }
public int spitArray(int[] nums,int m){
    int start=0;
    int end=0;
    for(int i=0;i<nums.length;i++){
        start=Math.max(start,nums[i]);
        end+=nums[i];
    }

    while(start<end){
        int mid=start+(end-start)/2;
        //calculate how many pieces we can divide the array into with max sum as mid
        int sum=0;
        int pieces=1;
        for(int num : nums){
            if(sum+num>mid){
                //you cannot add this in this subarry make new one
                sum=num;
                pieces++;
            }else{
                sum+=num;
            }
        }
        if(pieces>m){
            start=mid+1;
    }else{
        end=mid;
    }

    }
    return end; // here start == end
}
}