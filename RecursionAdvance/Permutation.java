package RecursionAdvance;

public class Permutation {
    public static void printPerm(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            //"abc"-->if we take a the -->"bc"
            String newstr=str.substring(0,i) + str.substring(i+1);
            printPerm(newstr, permutation+currChar);

        }
    }
    public static void main(String args[]){
        String str ="abc";
        printPerm(str, "");
    }
}
