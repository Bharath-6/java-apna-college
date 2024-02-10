import java.util.Arrays;

public class GiftReorder {
    

    public static int getMaxValue(int[] A, int[] B, int[] C) {
        int n = A.length;

        // Create an array to store the surprise values
        int[] surpriseValues = new int[n];

        // Calculate the surprise values based on the given formula
        for (int i = 0; i < n; i++) {
            surpriseValues[i] = (A[i] + B[i] + C[i]) * (i + 1);
        }

        // Sort the surprise values in descending order
        Arrays.sort(surpriseValues);
        reverseArray(surpriseValues);

        long result = 0;
        int MOD = 1000000007;

        // Calculate the maximum surprise value modulo (10^9 + 7)
        for (int i = 0; i < n; i++) {
            result = (result + surpriseValues[i]) % MOD;
        }

        return (int) result;
    }

    // Helper method to reverse an array
    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
