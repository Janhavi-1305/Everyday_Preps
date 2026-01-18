import java.util.Arrays;
public class VarArgs{
    public static void main(String[] args){
       // fun(2,3,4,5,6);   //we can pass any number of arguments(0 or more)
       multiple(1,2,"apple","banana","cherry");
    }

    static void multiple(int a,int b,String ...v){ //varargs should be the last parameter
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}