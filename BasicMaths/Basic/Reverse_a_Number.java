package BasicMaths.Basic;



public class Reverse_a_Number {
    public static void main(String[] args) {
        int N = 7789;
        while(N>0){
            int last_digit = N%10;
            System.out.println(last_digit);
            N= N/10;
        }
        
    }
}
