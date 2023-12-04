import java.util.Scanner;

public class Selectionsort {
    public static void selectionSort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            int min_index = j;
            for (int k = j + 1; k < arr.length; k++) {
                if (arr[k] < arr[min_index]) {
                    min_index = k;
                }
            }
            // Swap arr[j] and the minimum element
            int temp = arr[j];
            arr[j] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Add a new line for clarity

        sc.close(); // Close the scanner when done.
    }
}
