package Striver_LL;

import org.w3c.dom.Node;

public class Find_the_intersection_point_of_Y_LinkedList {
    // only function code
    public static int findIntersection(Node firstHead, Node secondHead) {
        // Write your code here
        if (firstHead == null || secondHead == null) {
            return 0;
        }
        Node t1 = firstHead;
        Node t2 = secondHead;
        while (t1 != t2) {
            t1 = t1.next;
            t2 = t2.next;
            if (t1 == t2) {
                return t1.data;
            }
            if (t1 == null)
                t1 = secondHead;
            if (t2 == null)
                t2 = firstHead;
        }
        return 0;
    }
}
