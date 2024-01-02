package Basiccodinginjava;

import java.util.Scanner;

public class Fib1 {
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int num = 6;
    //     int a = 0;
    //     int b = 1;
    //     System.out.print(a+""+b+"");
    //     for(int i=3;i<=num;i++){
    //         int c = a+b;
    //         System.out.print(c+"");
    //         a=b;
    //         b=c;
            
    //     }
    // }
    //using functiom
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a);
        System.out.print(b);
        fibseries(a,b,num-2);
    }
    public static void fibseries(int a,int b, int num){
        if(num==0){
            return;
        }
        
        int c=a+b;
        System.out.print(c);
        fibseries(b,c,num-1);
        
}
}