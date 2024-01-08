package BasicMaths.Basic;

import java.util.Scanner;

public class Checkprime {
    public static void main(String[] args) {
        //Your code goes here
        Scanner sc = new Scanner(System.in);
        int count=0;
        int n = sc.nextInt();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if((n/i)!=i){
                count++;
                }
            }
        }
        if(count==2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

}
