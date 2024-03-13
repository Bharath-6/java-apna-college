public class Sort_o's_1's_2's {
    public static Node sortList(Node head) {
        // Write your code here
        if(head==null || head.next==null){
            return head;
        }
        Node zerohead = new Node(-1);
        Node onehead = new Node(-1);
        Node twohead = new Node(-1);

        Node zero = zerohead;
        Node one = onehead;
        Node two = twohead;
        Node temp=head;

        while(temp!=null){
            if(temp.data==0){
                zero.next = temp;
                zero = zero.next;
            }
            else if(temp.data==1){
                one.next = temp;
                one = one.next;
            }
            else{
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;

        }
        //check the node is their or null to connect with 1
        zero.next = (onehead.next!=null) ? (onehead.next) : (twohead.next);
        one.next = twohead.next;
        two.next=null;
        Node newhead = zerohead.next;
        return newhead;
    }
}
