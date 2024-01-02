package Strings;

public class Toogleusingstring {
     public static String convertCase(String input) {
        if (input == null) {
            return null;  // Handle null input if needed
        }

        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the character is uppercase or lowercase and convert accordingly
            if (currentChar >= 'A' && currentChar <= 'Z') {
                result += (char) (currentChar + 32);  // Convert uppercase to lowercase
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                result += (char) (currentChar - 32);  // Convert lowercase to uppercase
            } else {
                result += currentChar;  // Keep non-alphabetic characters unchanged
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "PhysiCs";
        String converted = convertCase(input);
        System.out.println("Original: " + input);
        System.out.println("Converted: " + converted);
    }
}