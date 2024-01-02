package Basiccodinginjava;

import java.util.Scanner;

public class Noofdigitsinanumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        while(num>0){
            num = num/10; // removes the last element in the number
            count++;
        }
        System.out.println(count);
    }
}
