package Strings;
//java program to reverse each word in a string
public class Reversespacebetweenword {
    public static void main(String[] args) {
        String str= "I am a man hello";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
                sb= new StringBuilder("");//delete the empty string
            }
        }
        sb.reverse();
        ans+=sb;//wherer string builde is not deleted yet
        System.out.println(ans);
    }
}
