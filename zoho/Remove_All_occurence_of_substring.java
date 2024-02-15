import java.util.Stack;

public class Remove_All_occurence_of_substring {
    public static void main(String args[]) {
        Remove_All_occurence_of_substring solution = new Remove_All_occurence_of_substring();
        String result = solution.removeOccurrences("abacaba", "aba");
        System.out.println(result); // Output: "ca"

    }

    public String removeOccurrences(String s, String part) {
        // Create a StringBuilder to build the result
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
            if (st.size() >= part.length()) {
                boolean found = true;
                for (int j = 0; j < part.length(); j++) {
                    if (st.get(st.size() - part.length() + j) != part.charAt(j)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    for (int k = 0; k < part.length(); k++) {
                        st.pop();
                    }
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : st) {
            result.append(c);
        }
        return result.toString();
    }
}
