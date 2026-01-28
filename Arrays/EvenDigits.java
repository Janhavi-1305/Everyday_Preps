public class EvenDigits{
    public static void main(String[] args){
        int[] nums={12,345,2,6,7896};
        System.out.println(countEvenDigits(nums));
    }
    public static int countEvenDigits(int[] nums){
        int count=0;
        for(int num:nums){
            if(digits2(num)%2==0){
                count++;
            }
        }
        return count;
    }
    public static int digits2(int num){
        return (int)(Math.log10(num))+1;
    }
}