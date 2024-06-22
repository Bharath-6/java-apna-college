package StriverRecursionandgfg.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        subsetss(nums,temp,ans,0);
        return ans;
    }
    public static void subsetss(int[] nums,List<Integer> temp,List<List<Integer>> ans,int idx){

        if(idx==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        subsetss(nums,temp,ans,idx+1);
        temp.remove(temp.size()-1);
        subsetss(nums,temp,ans,idx+1);
    }
    public static void main(String[] args){
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
}
