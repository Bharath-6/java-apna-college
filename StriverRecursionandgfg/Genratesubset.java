package StriverRecursionandgfg;

import java.util.ArrayList;

public class Genratesubset {
        public static ArrayList<ArrayList<Integer>> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        subset(arr,n,0,temp,ans);
        return ans;
    }
    public static void subset(ArrayList<Integer> arr,int n,int idx,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> ans){
        
        if(idx==arr.size()){
            ans.add(new ArrayList<>(temp));//dont forget to add new ArrayList<>(temp) , if you give simply temp then all list will be empty
            return;
        }
        temp.add(arr.get(idx));
        subset(arr,n,idx+1,temp,ans);
        temp.remove(temp.size()-1);
        subset(arr,n,idx+1,temp,ans);
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        System.out.println(subsetSums(arr,3));
    }
}
