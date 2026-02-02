public class Peak {

    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start != end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else { // nums[mid] > nums[mid + 1]
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        Peak sol = new Peak();

        int[] nums1 = {1, 2, 3, 1};
        int peakIndex1 = sol.findPeakElement(nums1);
        System.out.println("Peak index: " + peakIndex1);
        System.out.println("Peak value: " + nums1[peakIndex1]);

        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        int peakIndex2 = sol.findPeakElement(nums2);
        System.out.println("Peak index: " + peakIndex2);
        System.out.println("Peak value: " + nums2[peakIndex2]);
    }
}
