class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Operations_in_LL {
    public static Node constructLL(int[] arr) {
        // Write your code here
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    private static Node removehead(Node head) {
        if (head == null)
            return head;
        head = head.next;
        return head;
    }

    public static void main(String args[]){
        int[] arr = {1,2,4,5};
        Node head = constructLL(arr);
        head = removehead(head);
        System.out.println(head);
    }
}
