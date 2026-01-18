public class Change_name{
    public static void main(String[] args){
        String name = "Alice";
        System.out.println("Name before change: " + name);
        name = changeName(name);
        System.out.println("Name after change: " + name);
    }
    static void changeName(String originalName){
        originalName= "Bob";
    }
}