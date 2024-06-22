public class Abcpermutation {
    
    public static void printPermutation(String str, String perm, int idx){
        if(str.length()==0){
            System.out.println(perm);
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1); //it wont add current element it will add the remaining
            //Ex:ABC. where i=0(0,0) it wont include A and + (i+1) means 0+1 means from 1 to end including 1 also which is BC the newString
            printPermutation(newStr, perm+currChar, idx+1);
        }
    }
    public static void main(String args[]){
        String str="ABC";
        printPermutation(str, "", 0);
    }
    
}

//working of newStr
//suppose"ABC"
//where if i=1 means current is B
//substring(0,i)==(0,1) it wont include the B means 1 index in string it is A and substring(i+1)=(2) from index 2 to end measn only C
//newString = AC