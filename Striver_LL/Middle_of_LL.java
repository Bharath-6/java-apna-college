package Striver_LL;

import org.w3c.dom.Node;

public class Middle_of_LL {
    public static Node findMiddle(Node head) {
        // Write your code here.
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
