package StriverRecursionandgfg.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutationarraylist {
    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for(int a:nums){
            arr.add(a);
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        per(arr,ans,temp,nums.length);
        return ans;
        
    }
    public static void per(List<Integer> arr,List<List<Integer>> ans,List<Integer> temp,int n){
        if(temp.size()==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < arr.size(); i++) {
            int current = arr.remove(i);
            temp.add(current);
            per(arr, ans, temp, n);
            temp.remove(temp.size() - 1); // Backtrack
            arr.add(i, current); // Restore arr
        }
    }
    public static void main(String[] args){
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
}
