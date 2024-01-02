package Collections.Queue;
import java.util.*;
//Insertion order is preserved 
//and duplicates are allowed
//in linked list queue hertorgenous data is allowed
//but not in priority queue
//add- if insertion fails it will return exception
//offer-if insertion fails it will return false
//element-when it fails throws exception
//peek-when it fails return null
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
        //loops
        Iterator itr = q.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for(Object ele:q){
            System.out.println(ele);
        }
    }
    public static void main(String args[]){
        Linkedlistqueue qu = new Linkedlistqueue();
        qu.queueexamples();
    }

}
