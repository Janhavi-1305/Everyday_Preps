import java.util.*;

public class Question {

    // Solution class (same as LeetCode)
    static class Solution {
        public int maximumCount(int[] nums) {
            int n = nums.length;

            int firstPos = firstPositive(nums);
            int firstZero = firstZero(nums);

            int positives = n - firstPos;
            int negatives = firstZero;

            return Math.max(positives, negatives);
        }

        // index of first element > 0
        private int firstPositive(int[] arr) {
            int s = 0, e = arr.length - 1;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[mid] > 0) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            return s;
        }

        // index of first element >= 0
        private int firstZero(int[] arr) {
            int s = 0, e = arr.length - 1;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[mid] >= 0) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            return s;
        }
    }

    // main method to test
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {-3, -2, -1, 0, 0, 1, 2};

        int result = sol.maximumCount(nums);
        System.out.println("Maximum count = " + result);
    }
}
