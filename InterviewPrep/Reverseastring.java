package InterviewPrep;

public class Reverseastring {
    public static void main(String args[]){
        String str="ABA";
        String reverse= "";
        for(int i=0;i<str.length(); i++){
            reverse=str.charAt(i)+reverse;
          
        }
        System.out.println(reverse);
        if(str.equals(reverse)){
            System.out.println("Palidrome");
        }else{
            System.out.println("Not A Palidrome");
        }
    }
}
