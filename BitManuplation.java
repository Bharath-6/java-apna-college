public class BitManuplation {
    public static void main(String args[]){
        int n = 5;// 0101
        int pos = 2;
        int bitMask = 1<<pos;

        if((bitMask & n)==0){
            System.out.println("bit was Zero");
        }else{
            System.out.println("bit was one");
        }
    }
}

// set
public class BitManuplation {
    public static void main(String args[]) {
        int n = 5;// 0101
        int pos = 1;
        int bitMask = 1 << pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}

// clear
public class BitManuplation {
    public static void main(String args[]) {
        int n = 5;// 0101
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}

// update

import java.util.Scanner;

public class BitManuplation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper=1 :set oper=2 : clear
        int n = 5;// 0101--0001->1
        int pos = 2;

        int bitMask = 1 << pos;
        if (oper == 1) {
            // set

            int newNumber = bitMask | n;
            System.out.println(newNumber);

        } else {
            // clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);

        }

    }
}
