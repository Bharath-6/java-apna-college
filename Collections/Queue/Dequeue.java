package Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
    public static void main(String args[]){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq); // 2 1 3 4
        System.out.println(dq.pollFirst()); //2
        System.out.println(dq.pollLast());//4
        System.out.println(dq);//1  3
    }
;}
