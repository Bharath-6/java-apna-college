package Basiccodinginjava;

public class checkStringispalidrome {
    public static void main(String args[]){
        String str = "madam";
        String rev = "";
        int n = str.length();
        for(int i=n-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("It is palidrome");
        }
        else{
            System.out.println("It is not a palidrome");
        }
        
    }
}
