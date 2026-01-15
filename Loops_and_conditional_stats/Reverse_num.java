import java.util.Scanner;
public class Reverse_num{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to reverse:");
        int num=sc.nextInt();
        int reversed=0;
        while(num>0){
            int temp=num%10;
            reversed=reversed*10+temp;
            num=num/10;    
        }
        System.out.println("Reversed number is: "+reversed);
    }
}