package Basiccodinginjava;

public class ChecktheStringisspellcorrectornotandchecklikenumberalso {

}

public class Solution {
    static int goodSpell(int n, String s) {

        // Variables to store the first half product and the second half product.
        int prod1 = 1, prod2 = 1;

        for (int i = 0; i < n; i++) {

            // First half.
            if (i < (n / 2)) {
                prod1 *= (s.charAt(i) - '0');
            }

            // Second half.
            else {
                prod2 *= (s.charAt(i) - '0');
            }
        }

        // Check if these two products are equal.
        return prod1 == prod2 ? 1 : 0;
    }
}
