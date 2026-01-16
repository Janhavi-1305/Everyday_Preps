import java.util.Scanner;
public class Switch1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a fruit name (apple, banana, orange, mango):");
        String fruit=sc.nextLine().toLowerCase();
        switch(fruit){
            case "apple":
                System.out.println("Apples are red or green.");
                break;
            case "banana":
                System.out.println("Bananas are yellow.");
                break;
            case "orange":  
                System.out.println("Oranges are orange.");
                break;
            case "mango":
                System.out.println("Mangoes are yellow when ripe.");
                break;
            default:
                System.out.println("Unknown fruit.");
        }
    }
}