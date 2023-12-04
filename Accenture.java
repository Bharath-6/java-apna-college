public class Accenture {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3,1,7,6};
        int n = arr.length;

        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                // Count the number of even elements
                evenCount++;
            }
        }

        int oddIndex = evenCount;
        int evenIndex = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                // Move even elements to the beginning
                int temp = arr[i];
                arr[i] = arr[evenIndex];
                arr[evenIndex] = temp;
                evenIndex++;
            } else {
                // Move odd elements after even elements
                int temp = arr[i];
                arr[i] = arr[oddIndex];
                arr[oddIndex] = temp;
                oddIndex++;
            }
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
