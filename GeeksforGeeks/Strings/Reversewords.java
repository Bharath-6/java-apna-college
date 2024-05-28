package Strings;
class Reversewords {
    public static void main(String[] args) {
        String s = "Mvs Bharath";
        char[] p  = reversewords(s.toCharArray());
        System.out.println(p);
    
    }
    public static char[] reversewords(char[] s){
        int start=0;
        for(int end=0;end<s.length;end++){
            if(s[end]==' '){
                reverse(s,start,end-1);
                start = end+1;
            }
        }
        reverse(s,start,s.length-1);
        reverse(s,0,s.length-1);
        return s;
        
    }
    public static void reverse(char[] s, int low, int high){
        char temp;
        while(low<high){
            temp = s[low];
            s[low]=s[high];
            s[high] = temp;
            low++;
            high--;
        }
    }
}