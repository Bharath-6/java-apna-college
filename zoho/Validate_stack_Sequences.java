package zoho;

import java.util.Stack;

public class Validate_stack_Sequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j=0;
        Stack<Integer> st = new Stack<>();
        for(int val: pushed){
            st.push(val);
            while(!st.isEmpty() && st.peek()==popped[j]){
                st.pop();//then pop out
                j++;
            }
        }
        return st.isEmpty();
}
