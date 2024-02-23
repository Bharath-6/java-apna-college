package zoho;

import java.util.HashSet;
import java.util.Set;

public class K_diff_pairs {
    public int findPairs(int[] nums, int k) {
        if(k<0){
            return 0;
        }
        Set<Integer> unique = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        int count=0;

        for(int num : nums){
            if(unique.contains(num-k) && (!seen.contains(num))){
                count++;
                seen.add(num);
            }
            if(unique.contains(num+k) && (!seen.contains(num+k))){
                count++;
                seen.add(num+k);
            }
            unique.add(num);
        }
        return count;
}
}
