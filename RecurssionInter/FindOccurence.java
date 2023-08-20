package RecurssionInter;

//find the first and last occurence of the string 
public class FindOccurence {
    public static int first=-1;
    public static int last=-1;

    public static void findOcc(String str, int idx, char element){
        if(idx==str.length()){
            System.out.println(first);
             System.err.println(last);
             return;

        }
        char cuurChar=str.charAt(idx);
        if(cuurChar == element){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        findOcc(str, idx+1, element);
    }

public static void main(String args[]){
    String str = "abaacdaefaah";
    findOcc(str,0,'a');
}
}