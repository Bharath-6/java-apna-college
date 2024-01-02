package Basiccodinginjava;

import java.util.Scanner;

public class checknumberhavinghowmanyoddsandeven {
    public static void main(String args[]){
        int rev =0;
        int count=0;
        int count1=0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num>0){
            rev = rev*10+num%10;
            if(rev%2==0){
                count++;
            }
            else{
                count1++;
            }
            num=num/10;
            
        }
        System.out.println("even count is: "+count);
        System.out.println("odd count is: "+count1);
    }
}
