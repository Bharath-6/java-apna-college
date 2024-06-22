public class PalidromeString {
    public static boolean pali(String str,int i){
        if(i==str.length()/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt((str.length()-1)-i)){
            return false;
        }
        return pali(str,i+1);
        
    }
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(pali(str,0));
        
    }
}
