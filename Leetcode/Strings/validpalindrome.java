package Strings;

class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "");
        // words with out spaces and converted lower case will be seen in down
        String sl = result.toLowerCase();
        String reverse = "";
        for (int i = 0; i < sl.length(); i++) {
            reverse = sl.charAt(i) + reverse;
        }
        return reverse.equals(sl);

    }
}