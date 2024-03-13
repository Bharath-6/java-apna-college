package Striver_LL;

import org.w3c.dom.Node;

public class Cycle_detection_singleLL {
     public static boolean detectCycle(Node head) {
        //Your code goes here
        if(head==null || head.next==null){
            return false;
        }
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
