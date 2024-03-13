package Striver_LL;

public class Find_length_loop {
    public static int lengthOfLoop(Node head) {
        // Write your code here
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return findlength(slow,fast);
            }
        }
        return 0;
    }
    public static int findlength(Node slow,Node fast){
        int cnt  = 1;
        fast = fast.next;
        while(fast!=slow){
            cnt++;
            fast = fast.next;
            
        }
        return cnt;
    }
}
