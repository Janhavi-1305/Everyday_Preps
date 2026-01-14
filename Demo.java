import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Please enter a value");
        Scanner input=new Scanner(System.in);
        int value=input.nextInt();
        System.out.println("You enterd: "+value);

        System.out.println("Please enter a name");
        String name=input.next();
        System.out.println("You enterd: "+name);

        System.out.println("Please enter a sentence:");
        String sentence=input.nextLine(); // Consume the leftover newline
        System.out.println("You enterd: "+sentence);
}