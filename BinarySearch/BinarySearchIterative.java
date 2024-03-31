public class BinarySearchIterative {
    public static int search(int []nums, int target) {
        // Write your code here.
        int low = 0;
        int n = nums.length;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}
