package Strings;
//The string should be compressed such that consecutive duplicates
//of characters are replaced with the character and follwed by the 
//number of consecutive duplicates.
public class SequenceCount {
    public static void main(String[] args) {
        String ans = ""+str.charAt(0);// a3
        int count = 1;
        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr==prev){
                count++;
            }
            else{
                if(count>1) ans +=count;
                count=1;
                ans+=curr; // we are adding b right now
            }
        }
        if(count>1) ans+=count;
        System.out.println(ans);
    }
}
