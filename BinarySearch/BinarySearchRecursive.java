public class BinarySearchRecursive {
    public static int search(int[] nums, int target) {
        // Write your code here.
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        return bs(nums, low, high, target);
    }

    public static int bs(int[] nums, int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (target > nums[mid]) {
            return bs(nums, mid + 1, high, target);
        }
        return bs(nums, low, mid - 1, target);
    }
}
