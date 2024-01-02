package Strings;
import java.util.*;
public class Returnpalidromesubstring {
    //given a string s, return the number of palindromic substrings in it
    public static boolean isPalindromeSub(String s){
        String str1 = "";
        for(int i=0;i<s.length();i++){
            str1=s.charAt(i)+str1;
        }
        if(str1.equals(s)){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String args[]){
        String s = "abc";//op:3
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(isPalindromeSub(s.substring(i,j))==true){
                    System.out.print(s.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println("The Number of palidrom's in a substring is: "+count);
    }
}
        //This is for checking it is palidrome or not
        // int i=0;
        // int j=str.length();
        // boolean flag=true;
        // while(i<j){
        //     if(str.charAt(i)!=str.charAt(j)){
        //         flag=false;
        //         break;
        //     }
        //     i++;
        //     j--;
            
        // }
        // if(flag==true){
        //     System.out.println("Palidrome");
        // }
        // else{
        //     System.out.println("Not palidrome");
        // }
    
    

