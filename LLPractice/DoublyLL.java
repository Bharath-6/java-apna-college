package LLPractice;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node{
    int data;
    Node next;
    Node back;
    Node(int data1,Node next1,Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }
    public Node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}
class DoublyLL {
    private static Node converttoDDarr(int arr[]){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = converttoDDarr(arr);
        // Node temp1 = head;
        // while(temp1!=null){
        //     System.out.println(temp1.data);
        //     temp1 = temp1.next;
        // }
        System.out.println(head.data);
    }
    
}
