package StriverRecursionandgfg.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PermutationArray {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        per(ans,nums,0);
        return ans;
        
    }
    public static void per(List<List<Integer>> ans,int[] nums,int idx){
       if(idx==nums.length){
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            temp.add(nums[i]);
        }
        ans.add(new ArrayList<>(temp));
       }
       for(int i=idx;i<nums.length;i++){
        swap(i,idx,nums);
        per(ans,nums,idx+1);
        swap(i,idx,nums);
       }
    }
    public static void swap(int a,int b,int[] nums){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
}
