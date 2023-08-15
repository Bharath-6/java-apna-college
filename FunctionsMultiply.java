import java.util.Scanner;

public class FunctionsMultiply {
    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The multiplied value is " + multiplyNumbers(a, b));

    }
}
