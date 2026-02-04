public class Rotated_my {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int index = search(arr, target);
        System.out.println("Target found at index: " + index);
    }

    static int search(int[] arr, int target) {
        int peak = findPeak(arr);

        // try left side (0 to peak)
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }

        // try right side (peak+1 to end)
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    // Peak element in rotated sorted array
    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    // Order Agnostic Binary Search
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
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
