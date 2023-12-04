package InterviewPrep;

public class Occurencesinastring {
    public static void main(String args[]){
        String str="Bharath";
        char search='a';
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(search==str.charAt(i)){
                count++;
            }
            
        }
        System.out.println(count);

    }
}
