import java.util.Scanner;

public class FunctionForAdding {
    public static int addingNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = addingNumbers(a, b);
        System.out.println("sum of two numbers:"+sum);
    }
}
