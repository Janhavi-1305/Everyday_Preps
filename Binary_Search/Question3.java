public class Question3 {
    public static void main(String[] args) {
        char[] arr = {'a', 'c', 'd', 'g'};
        char target = 'g';

        char result = ceiling(arr, target);
        System.out.println("Ceiling of " + target + " is: " + result);
    }

    public static char ceiling(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // wrap-around case
        return arr[start % arr.length];
    }
}
