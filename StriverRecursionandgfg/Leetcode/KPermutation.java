package StriverRecursionandgfg.Leetcode;

//Not a recursion problem if we use recursion it will come under brutee force where tc is N! and more

import java.util.ArrayList;
import java.util.List;

public class KPermutation {
    public static String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int fact = 1;
        for (int i = 1; i < n; i++) {
            fact = fact * i;
            numbers.add(i);
        }
        numbers.add(n);
        String ans = "";
        k = k - 1;
        while (true) {
            ans = ans + numbers.get(k / fact);
            numbers.remove(k / fact);
            if (numbers.size() == 0) {
                break;
            }
            k = k % fact;
            fact = fact / numbers.size();
        }
        return ans;
    }

    // Tc; expected is : N^2 and our time is : N^2
    // sc: O(N)
    public static void main(String[] args) {
        System.out.println(getPermutation(4, 17));
    }
}
