package RecurssionInter;

public class ReverseString {
    public static void printRev(String str,int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str,idx-1);
    }
    public static void main(String args[]){
        String str="Bharath";
        printRev(str, str.length()-1);
        //where we will count 0,1,2,3 but it will know str.length()=4 so -1 then it will be 3

    }
    
}
