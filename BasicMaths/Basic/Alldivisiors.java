package BasicMaths.Basic;

import java.util.ArrayList;
import java.util.List;

public class Alldivisiors {
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                result.add(i);
            }
        }
        return result;
    }
}
//another way
// for(int i=0;i<Math.sqt(n);i++){
//     if(n%i==0){
//         result.add(i);
//     }
//     if((n/i)!=i){
//         result.add(i);
//     }
//     Collections.sort(result);
// }