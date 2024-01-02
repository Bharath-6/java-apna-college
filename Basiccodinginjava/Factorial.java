package Basiccodinginjava;

import java.util.Scanner;

public class Factorial {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num= sc.nextInt();
//         int Factorial=1;
//         for(int i = 1;i<=num;i++){
//             Factorial*=i;
//         }
//         System.out.println(Factorial);
//     }
// 
//using function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = factofnumer(num);
        System.out.println(factorial);
    }
    public static int factofnumer(int num){
        if(num==0 || num==1){
            return 1;
        }
        else{
            int result = num*(factofnumer(num-1));
            return result;
        }
        
    }
}