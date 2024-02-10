public class Binarysearch {
    public static void main(String args[]){
        int target = 12;
        int[] nums = {1,2,12,4};
        int result = search(nums,target);
        System.out.println(result);
    }
    public static int search(int[] nums, int target) {
        int l =0,h = nums.length-1,mid =0;
        while(l<=h){
            mid=(l+h)/2;
            if(nums[mid]==target){
            return mid;
            }
            else if(target<nums[mid]){
            h = mid-1;
            l=l;
            }
            else{
            l=mid+1;
            h=h;
            }
        }
        return -1;
    }
    
}
