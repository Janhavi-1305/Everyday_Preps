import java.util.Scanner;
public class SearchInChar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        System.out.print("Enter a character to search: ");
        char ch=sc.next().charAt(0);
        int index=linearSearch(str,ch);
    }

    public static int linearSearch(String str,char target){
        if(str.length()==0){
            System.out.println("String is empty.");
            return -1;
        }
        for(char ch : str.toCharArray()){
            if(ch==target){
                System.out.println("Character '"+target+"' found in the string.");
                return 1;
            }

        }
        System.out.println(" not found");
        return -1;
    }
}