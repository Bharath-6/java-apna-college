public class Flatten_LL {
    public static Node flattenLinkedList(Node head) {
        // Write your code here
        if (head == null || head.next == null) {
            return head;
        }
        Node NewNode = flattenLinkedList(head.next);
        return merge(head, NewNode);

    }

    public static Node merge(Node list1,Node list2){
        Node dummy = new Node(-1);
        Node res = dummy;
        while(list1!=null && list2!=null){
            if(list1.data<list2.data){
                res.child = list1;
                res= res.child;
                list1 = list1.child;
            }
            else{
                res.child = list2;
                res= res.child;
                list2 = list2.child;
            }
            
        }
        if(list1!=null){
            res.child = list1;
        }
        else{
            res.child = list2;
        }
        return dummy.child;
}

// class Node {
// public int data;
// public Node next;
// public Node child;

// Node()
// {
// this.data = 0;
// this.next = null;
// this.child = null;
// }
// Node(int data)
// {
// this.data = data;
// this.next = null;
// this.child = null;
// }
// Node(int data, Node next, Node child)
// {
// this.data = data;
// this.next = next;
// this.child = child;
// }
// }