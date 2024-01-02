package Basiccodinginjava;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Reverseanumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        while(num!=0){
            // we will be taking out the last number 
            rev = rev*10+num%10; // 0*10+1234%10 = 4, 4*10+123%10 = 3 , 3*10+12%10=2 , 2*10+1%10 = 1, num will be zero now
            //removing the last element
            num=num/10;
            
        }
        System.out.println(rev);
        
    }
}   
//using string buffer
// public class Reverseanumber{
//     public static void main(String args[]){
//         int num = 1234;
//         StringBuffer sb = new StringBuffer(String.valueOf(num));
//         StringBuffer rev=sb.reverse();
//         System.out.println(rev);
//     }
//     public static void main(String args[]){
//         int num = 1234;
//         StringBuilder sb = new StringBuilder();
//         sb.append(num);
//         sb.reverse();
//         System.out.println(sb);
        
//     }
    
// }

