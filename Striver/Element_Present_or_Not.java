class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class Element_Present_or_Not {
    public static int find(Node head, int k) {
        // Write your code here
        Node temp = head;
        while (temp != null) {
            if(temp.data==k){
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 3};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);

        int val = 3;  // Element to be checked for presence in the linked list

        // Call the checkifPresent function and print the result
        System.out.print(find(head, val));

    }
}