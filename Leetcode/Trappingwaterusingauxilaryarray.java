package Leetcode;

class Solution {
    public int trap(int[] height) {
        int result=0;
        int n=height.length;
        int[] lb=new int[n];
        int[] rb=new int[n];
        lb[0]=height[0];
        for(int i=1;i<n-1;i++){
            lb[i]=Math.max(lb[i-1],height[i]);
        }
        rb[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rb[i]=Math.max(height[i],rb[i+1]);
        }
        
        for(int i=1;i<n-1;i++){
            int tw=Math.min(rb[i],lb[i])-height[i];
            result=result+tw;
        }
        return result;
    }
}