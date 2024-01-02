package Strings;

public class Printingsubstrings {
    public static void main(String args[]){
        String str = "Bharath";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}
