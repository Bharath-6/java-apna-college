package Collections.List;
import java.util.*;

public class LinkedListExample {
    public void linkedListExample(){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(3);
        l.add(4);
        System.out.println(l);
    }
    public static void main(String args[]){
        LinkedListExample ex = new LinkedListExample();
        ex.linkedListExample();
    }
}
