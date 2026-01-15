import java.util.Scanner;
public class Largest_number {
    public static void main(String[] args){ 
    Scanner in = new Scanner(System.in);
    int a,b,c;
    System.out.print("Enter three numbers:");
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();

    if(a>=b && a>=c){
        System.out.println(a+"is the largest number");
    }
    if(b>=a && b>=c){
        System.out.println(b+"is the largest number");
    }
    if(c>=a && c>=b){
        System.out.println(c+" is the largest number");
    }
    }
}