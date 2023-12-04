package InterviewPrep;

public class Reversearray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 7, 6, 4, 9, 12 };
        
        // Loop till the half-length of the array
        for (int t = 0; t < a.length / 2; t++) {
            int tmp = a[t]; // Store the current element in a temporary variable
            a[t] = a[a.length - t - 1]; // Replace the current element with the corresponding element from the end
            a[a.length - t - 1] = tmp; // Replace the corresponding element from the end with the temporary variable
        }

        // Print the reversed array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
