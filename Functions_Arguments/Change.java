public class Change{
    public static void main (String[] args){
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array before change:");
        for(int num : numbers){
            System.out.print(num + " ");
        }
        changeFirstElement(numbers);
        System.out.println("\nArray after change:");
        for(int num : numbers){
            System.out.print(num + " ");
        }


    }
    public static void changeFirstElement(int[] arr){
        if(arr.length > 0){
            arr[0] = 99;
        }
    }
}