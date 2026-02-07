import java.util.*;

public class SearchPosition {

    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        // low is the correct insert position
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};

        int target1 = 5;
        int target2 = 2;
        int target3 = 7;

        System.out.println("Output: " + searchInsert(nums, target1)); // 2
        System.out.println("Output: " + searchInsert(nums, target2)); // 1
        System.out.println("Output: " + searchInsert(nums, target3)); // 4
    }
}
