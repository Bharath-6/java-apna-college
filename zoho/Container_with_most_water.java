package zoho;

public class Container_with_most_water {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int ans = 0;
        while(l<r){
            ans = Math.max(ans, (r-l)*Math.min(height[l],height[r]));
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
}
