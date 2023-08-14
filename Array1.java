import java.util.*;

public class Array1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] marks = new int[size];
        // type [] arrayName={1,2};
        // int[] marks = { 1, 2, 3, 4, 5 };
        // input

        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
