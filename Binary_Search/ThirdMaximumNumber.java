import java.util.*;

public class ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {
        Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {
            long n = num;

            // Skip duplicates
            if ((first != null && n == first) ||
                (second != null && n == second) ||
                (third != null && n == third)) {
                continue;
            }

            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            } 
            else if (second == null || n > second) {
                third = second;
                second = n;
            } 
            else if (third == null || n > third) {
                third = n;
            }
        }

        // If third max doesn't exist, return max
        return third == null ? first.intValue() : third.intValue();
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 1};
        int[] nums2 = {1, 2};
        int[] nums3 = {2, 2, 3, 1};

        System.out.println(thirdMax(nums1)); // Output: 1
        System.out.println(thirdMax(nums2)); // Output: 2
        System.out.println(thirdMax(nums3)); // Output: 1
    }
}
