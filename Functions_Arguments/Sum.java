import java.util.Scanner;
public class Sum {
    // Function to calculate the sum of two integers
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int num1 = sc.nextInt();
        System.out.println("Enter second integer:");
        int num2 = sc.nextInt();

        int sum = calculateSum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}