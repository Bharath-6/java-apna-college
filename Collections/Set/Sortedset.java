package Collections.Set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sortedset {
    public static void main(String args[]){
        TreeSet<Integer> st = new TreeSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(15);
        st.add(10);
        //sorted order
        //self balncing bst
        System.out.println(st);// 1 2 3 48 15 10

    }
}
