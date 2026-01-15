import java.util.Scanner;
public class Fibonacci_series{
    public static void main(String[] args){
        int a=0;
        int b=1;
        int count=2;
        System.out.print("Enter the position:");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();

        while(count<=n){
            int temp=b;
            b=a+b;
            a=temp;
            count++;
        }

        if(n==0){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }

    }
}