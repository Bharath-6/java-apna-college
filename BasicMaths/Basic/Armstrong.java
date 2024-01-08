package BasicMaths.Basic;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp=n;
		int ld = 0;
		int sum=0;
		while(n>0){
			ld = n%10;
			sum=sum+(ld*ld*ld);
			n=n/10;
		}
		if(sum==temp){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}

	}
}
