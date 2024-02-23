class Node {
    int data; // the data value
    Node next; // the reference to the next Node in the linked list

    // constructors
    Node(int data1, Node next1) {
        this.data = data1; // Initialize data with the provided value
        this.next = next1; // Initialize next with the provided reference
    }

    Node(int data1) {
        this.data = data1; // Initialize data with the provided value
        this.next = null; // Initialize next as null since it's the end of the list
    }
    // Node(int data) {
    //     this.data = data; // Initialize data with the provided value
    //     this.next = null; // Initialize next as null since it's the end of the list
    // } //we can write only one this constructor also
}

public class Creating_LL {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5 };
        // Creating a new Node with the value from the array
        Node y = new Node(arr[0]); 
         // Printing the data stored in the Node
        System.out.println(y.data);
        //printing of the address of the data
        // System.out.println(y.next); 
    }
}
