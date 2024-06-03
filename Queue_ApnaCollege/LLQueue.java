//Queue using Linked List
//all operations will be 0(1)
//where head is front and rear is tail
public class LLQueue {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class QueueLL{
        static Node head = null;
        static Node tail = null;
        //check empty or not
        public static boolean isEmpty(){
            return head == null && tail == null;
        }
        //add
        public static void add(int data){
            Node newNode = new Node(data);
            if(tail==null){
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            if(head.next==null){
                tail=null;
            }
            head = head.next;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String args[]){
        QueueLL q = new QueueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        // System.out.println("Removed: "+q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
