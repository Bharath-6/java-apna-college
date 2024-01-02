package Basiccodinginjava;
import java.util.Scanner;
public class Basiccalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        double a = sc.nextInt();
        double b = sc.nextInt();
        System.out.println("Choose the Operator[+,*,-,/,%]");
        char operator = sc.next().charAt(0);
        double result;
        switch(operator){
            case '+':
                result = a+b;
                System.out.println("Result: "+result);
                break;
            case '*':
                result = a*b;
                System.out.println("Result: "+result);
                break;
            case '-':
                result = a-b;
                System.out.println("Result: "+result);
                break;
            case '/':
                if(b!=0){
                    result=a/b;
                    System.out.println("Result: "+result);
                }
                else{
                    System.out.println("Cannot divide by zero");
                }
                break;
            case '%':
                result = a%b;
                System.out.println("Result: "+result);
                break;
            default:
            System.out.println("Invalid Operator");
            

        }

    }
}
