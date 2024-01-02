package Strings;

import java.util.Scanner;

public class Convertigtoviceverse {
    public static void main(String args[]){
        //using string builder
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        //toggle
        //PHysiCs - phYSIcS
        for(int i=0;i<str.length();i++){
            //P to make small p 
            //check if alphabet is small or capital
            boolean flag = true; //true-->captial
            char ch = str.charAt(i);
            if(ch==' ')continue;
            int asci = (int)ch;
            if(asci>=97){ //flage =false;
                flag=false;
            }
            if(flag==true){//capital
                asci+=32;
                char dh = (char)asci;// a
                str.setCharAt(i, dh);
            }
            else{
                asci-=32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
            }
        }
        System.out.println(str);
    }
}
