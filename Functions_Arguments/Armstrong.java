import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter number:");
        // int num = sc.nextInt();// Example number
        // if(isArmstrong(num)){
        //     System.out.println(num + " is an Armstrong number");
        // } else {
        //     System.out.println(num + " is not an Armstrong number");
        // }

        for(int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.print(i + ",");
            }
        }
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while(n > 0){
            int rem = n%10;
            sum+=rem*rem*rem;
            n=n/10;
        }

        return sum == original;
    }
}