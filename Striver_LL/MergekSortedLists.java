package Striver_LL;

import java.util.PriorityQueue;

public class MergekSortedLists {
    class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode list : lists) {
            if (list != null) {
                pq.add(list);
            }
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while (!pq.isEmpty()) {
            ListNode p = pq.poll();
            temp.next = p;
            if (p.next != null) {
                pq.add(p.next);
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}
}
