package StriverRecursionandgfg.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSum2 {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        subset(nums,0,new ArrayList<>(),ans);
        return ans;
    }
    public static void subset(int[] nums,int idx,List<Integer> ds,List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int i=idx;i<nums.length;i++){
            if(i!=idx && nums[i]==nums[i-1])continue;
            ds.add(nums[i]);
            subset(nums,i+1,ds,ans);
            ds.remove(ds.size()-1);//when u backtrack u need to remove the last element

        }
    }
    public static void main(String[] args){
        int[] nums = {1,2,2,2,3,3};
        System.out.println(subsetsWithDup(nums));
    }

}
