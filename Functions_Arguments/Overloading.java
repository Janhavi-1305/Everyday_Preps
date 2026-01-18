public class Overloading{                       //when multiple methods have same name but different parameters
    public static void main(String[] args){
        System.out.println(sum(5,10));          //calls sum(int, int)
        System.out.println(sum(5.5,10.5));      //calls sum(double, double)
        System.out.println(sum(5,10,15));       //calls sum(int, int, int)
    }

    static int sum(int a, int b){
        return a + b;
    }

    static double sum(double a, double b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }
}