package LLPractice;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node{
    public int data;
    public Node next;
    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Arraytoll {
    public static Node converttoarr(int arr[]){
        if (arr.length == 0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = converttoarr(arr);
        Node temp1 = head;
        while(temp1!=null){
            System.out.println(temp1.data);
            temp1 = temp1.next;
        }
        // System.out.println(head.data);
    }
    
}