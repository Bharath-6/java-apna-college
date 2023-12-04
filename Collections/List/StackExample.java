package Collections.List;
import java.util.*;
public class StackExample {
    public void stackexample(){
        Stack<String> st = new Stack<>();
        st.push("pw");
        st.push("skills");
        System.out.println(st.peek());//skills
        System.out.println(st.pop());//skilss (will also remove it)
        System.out.println(st.peek());//pw
        System.out.println(st.size());//1
        System.out.println(st.empty());//false

    }
    public static void main(String args[]){
        StackExample s = new StackExample();
        s.stackexample();
    }
}
