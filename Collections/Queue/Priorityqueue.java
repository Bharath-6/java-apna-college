package Collections.Queue;
import java.util.*;
public class Priorityqueue {
    //priority based processing
    static void Priorityqueueexample(){
        //PriorityQueue<Integer> pq = new PriorityQueue<>(); //min PQ
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());//this is for max priority
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek());// 5- the smallest ele has the highes priority queue
        System.out.println(pq);//Gurantee-topmost priority ele will be processed first
        System.out.println(pq.poll());
        System.out.println(pq.peek());//7
    }
    public static void main(String args[]){
        
        Priorityqueueexample();
    }
} 