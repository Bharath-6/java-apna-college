import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        
        // Call a function to get the number representation
        String result = getAlphabetPositions(word);
        
        System.out.println(result);
    }

    public static String getAlphabetPositions(String word) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            // Check if it's a lowercase letter
            if (Character.isLowerCase(c)) {
                int position = c - 'a' + 1;
                result.append(position);
            }

            // Check if it's an uppercase letter
            else if (Character.isUpperCase(c)) {
                int position = c - 'A' + 1;
                result.append(position);
            }

            // Handle non-alphabetic characters
            else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
