package Striver_LL;

import org.w3c.dom.Node;

public class Delete_Middle_Node {
    public static Node deleteMiddle(Node head) {
        // Write your code here.
        if(head==null || head.next==null){
            return null;
        }
        Node fast = head;
        Node slow = head;
        fast = head.next.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
