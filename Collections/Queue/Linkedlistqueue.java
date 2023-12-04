package Collections.Queue;
import java.util.*;
public class Linkedlistqueue {
    static void queueexamples(){
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q.peek());//peek is 2
        System.out.println(q.poll());//2 will be removed
        System.out.println(q.peek());//3
        System.out.println(q.size());//2
        System.out.println(q);
    }
    public static void main(String args[]){
        Linkedlistqueue qu = new Linkedlistqueue();
        qu.queueexamples();
    }

}
