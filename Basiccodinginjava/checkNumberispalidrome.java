package Basiccodinginjava;

import java.util.Scanner;

public class checkNumberispalidrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int orginal = num;
        int rev = 0;
        while(num!=0){
            rev = rev*10+num%10;
            num = num/10;
        }
        if(rev==orginal){
            System.out.println("It is Palindrome Number");
        }
        else{
            System.out.println("It is not a palidrome number");
        }
        

    }
}
