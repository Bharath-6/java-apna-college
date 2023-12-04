public class new11 {
    public static void main(String args[]){
        int i=0;
        String str="AB";
        char currChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            System.out.println(currChar);
            System.out.println(newStr);
    }
}
