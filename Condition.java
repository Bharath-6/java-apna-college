import java.util.Scanner;

public class Condition {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int button = sc.nextInt();


        // if(button==1){
        //     System.out.println("hello");
        // }
        // else if(button==2){
        //     System.out.println("namaste");
        // }
        // else if(button==3){
        //     System.out.println("hey");
        // }
        // else{
        //     System.out.println("Invalid Button");
        // }
    
    switch(button){
        case 1: System.out.println("hello");
        break;
        case 2: System.out.println("Namaste");
        break;
        case 3: System.out.println("hey");
        break;
        default: System.out.println("Invalid Button");
        

    }
}
}