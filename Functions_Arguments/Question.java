import java.util.Scanner;
public class Question{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        if(isPrime(n)){
            System.out.println(n+" is prime");
        } else {
            System.out.println(n+" is not prime");
        }
    }

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c=2;
        while(c*c <=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }

}