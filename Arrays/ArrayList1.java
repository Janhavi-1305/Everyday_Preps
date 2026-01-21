import java.util.ArrayList;
public class ArrayList1{
    public static void main(String[] args0){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("ArrayList: "+list);

        System.out.println("contais 20: "+list.contains(20));

        list.set(1,25);
        System.out.println("After set: "+list);
    }
}