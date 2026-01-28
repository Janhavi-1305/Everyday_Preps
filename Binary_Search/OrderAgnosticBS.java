public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {34, 15, 11, 7, 6, 5, 3, 0, -2, -4, -12};
        int target = 15;
        int result = orderAgnosticBinarySearch(arr, target);
        System.out.println("Element found at index: " + result);
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}