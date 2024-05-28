// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
//push,pop,peek,isEmpty,size
class S {
    public class Stack{
            ArrayList<Integer> a = new ArrayList<>();
            public boolean isEmpty(){
                return a.size()==0;
            }
            public String push(int n){
                if(a.size()<5){
                    a.add(n);
                    return "Added";
                }
                else{
                    return "StackOverFlow";
                }
                
            }
            public int size(){
                return a.size();
            }
            public int peek(){
                return a.get(a.size()-1);
            }
            public int pop(){
                if(isEmpty()){
                    return -1;
                }
                return a.remove(a.size()-1);
            }
        }
    public static void main(String[] args) {
        S he = new S();
        Stack st = he.new Stack();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter your input:");
            String option = sc.nextLine();
            if(option.equals("add")){
                int n = sc.nextInt();
                System.out.println(st.push(n));
            }
            else if(option.equals("pop")){
                System.out.println(st.pop());
            }
            else if(option.equals("peek")){
                System.out.println(st.peek());
            }
            else if(option.equals("Empty")){
                System.out.println(st.isEmpty());
            }
            else if(option.equals("size")){
                System.out.println(st.size());
            }
            else if(option.equals("Quit")){
                break;
            }
            
        }
        sc.close();
    }
}