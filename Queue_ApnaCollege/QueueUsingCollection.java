import java.util.*;
public class QueueUsingCollection {
    public static void main(String args[]){
        // QueueLL q = new QueueLL();
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        //we can implement any one of the them
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        // System.out.println("Removed: "+q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
