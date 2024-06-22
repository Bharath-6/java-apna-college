package StriverRecursionandgfg;

import java.util.ArrayList;

public class subsetsum1 {
    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        subset(arr,n,0,0,ans);
        //Collection.sort(subset) //if need sorted sum
        return ans;
    }
    public static void subset(ArrayList<Integer> arr,int n,int idx,int sum,ArrayList<Integer> ans){
        
        if(idx==arr.size()){
            ans.add(sum);
            return;
        }
        subset(arr,n,idx+1,sum+arr.get(idx),ans);
        subset(arr,n,idx+1,sum,ans);
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        System.out.println(subsetSums(arr,2));
    }
}
