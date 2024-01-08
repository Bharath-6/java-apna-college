package BasicMaths.Basic;

public class Palidrome {
    public static boolean palindromeNumber(int n) {
        // Write your code here.
        boolean b = false;
        int temp = n;
        int reverse = 0;
        int last_digit = 0;
        while (n > 0) {
            last_digit = n % 10;
            n = n / 10;
            reverse = (reverse * 10) + last_digit;
        }
        if (reverse == temp) {
            b = true;
        }
        return b;
    }
}
