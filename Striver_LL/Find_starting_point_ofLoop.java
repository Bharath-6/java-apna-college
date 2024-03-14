package Striver_LL;

import org.w3c.dom.Node;

public class Find_starting_point_ofLoop {
    public static Node firstNode(Node head) {
        // Write your code here.
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // this is starting point
            }
        }

        return null;
    }
}
