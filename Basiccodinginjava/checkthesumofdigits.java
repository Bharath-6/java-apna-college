package Basiccodinginjava;

import java.util.Scanner;

public class checkthesumofdigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int sum=0;
        while(num>0){
            sum = sum+num%10; //4
            num=num/10; //123
        }
        System.out.println(sum);
        

    }
    
}
