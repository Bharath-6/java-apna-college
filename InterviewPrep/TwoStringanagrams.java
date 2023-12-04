package InterviewPrep;

import java.util.Arrays;

public class TwoStringanagrams {
    public static void main(String args[]){
        String str1="listen";
        String str2="silent";
        boolean anagramstat=false;
        if(str1.length()!=str2.length()){
            System.out.println("String are not anagrams");
        }else{
            char[] anagram1=str1.toCharArray();
            char[] anagram2=str2.toCharArray();
            Arrays.sort(anagram1);
            Arrays.sort(anagram2);
            anagramstat = Arrays.equals(anagram1, anagram2);
            
            
        }
        if(anagramstat==true){
            System.out.println("Strings are anagrams");
        }else{
            System.out.println("Strings are not anagrams");
        }

    }
}
