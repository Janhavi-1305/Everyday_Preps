import java.util.Scanner;
public class Number_of_times{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=in.nextInt();
        System.out.print("Enter a digit to find its frequency:");
        int digit=in.nextInt();
        int count=0;
        while(num>0){
            int temp=num%10;
            if(temp==digit){
                count++;
            }
            num=num/10;
        }
        System.out.println("The digit "+digit+" occurs "+count+" times in the number.");

    }
}