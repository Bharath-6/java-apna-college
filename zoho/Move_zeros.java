package zoho;

import java.util.Arrays;

public class Move_zeros {
    public void moveZeroes(int[] nums) {
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            System.out.println(Arrays.toString(nums));
            return;
        }
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

