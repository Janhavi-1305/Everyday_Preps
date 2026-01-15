import java.util.Scanner;
public class Check_uppercase {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=in.next().trim().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println(ch+" is an uppercase letter.");
        }
        else{
            System.out.println(ch+ " is a lowercase letter.");
        }
        
    
    }
}