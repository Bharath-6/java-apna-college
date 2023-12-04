import java.util.Scanner;

public class ReverseArray {
    public static String reverseWord(String str) {
        // Create a StringBuilder to build the reversed string
        StringBuilder reversed = new StringBuilder(str);
        
        // Use the reverse method to reverse the string
        reversed.reverse();
        
        // Convert the StringBuilder back to a String
        String reversedStr = reversed.toString();
        
        return reversedStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String reversed = reverseWord(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
