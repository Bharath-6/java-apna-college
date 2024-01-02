package Basiccodinginjava;

public class ReverseString {
    // public static void main(String args[]){
    //     String str = "Hello";
    //     String rev = "";
    //     int n = str.length();
    //     for(int i=n-1;i>=0;i--){
    //         rev = rev + str.charAt(i);
    //     }
    //     System.out.println(rev);
    // }
    //using char array
    // public static void main(String args[]){
    //     String str = "hello";
    //     String rev="";
    //     char a[]=str.toCharArray();
    //     int n= a.length;
    //     for(int i=n-1;i>=0;i--){
    //         rev = rev+a[i];
    //     }
    //     System.out.println(rev);
    // }
    //using string buffer
    public static void main(String args[]){
        String str="Hello";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }
}
