class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}
public class Array_to_LL {
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

    public static void main(String args[]) {
        int[] arr = { 1, 5, 8, 7 };
        Node head = constructLL(arr);
        System.out.print(head.data);

    }
}