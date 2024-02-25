class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Operations_in_LL {
    private static void print(Node head) {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

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

    private static Node removetail(Node head) {
        Node temp = head;
        if ((head == null) || head.next == null)
            return null;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        return head;
    }

    // removing the kth element in the list
    // it may be head or tail or any or nothing
    private static Node removek(Node head, int k) {
        // if ll is empty
        if (head == null)
            return head;
        // if element remove to be 1 then remove head
        if (head.data == k) {
            Node temp = head;
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node addfirst(Node head, int val) {
        Node newn = new Node(val);
        if (head == null) {
            head = newn;
            return head;
        }
        newn.next = head;
        head = newn;
        return head;

    }

    private static Node addPlace(Node head, int el, int v) {
        // if ll is empty insert at first
        if (head == null) {
            if (v == 1) {
                return new Node(el);
            }
        }
        if (v == 1) {
            Node temp = new Node(el);
            temp = head;
            return temp;
        }
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            // where v is place where we need to insert the element
            if (cnt == v - 1) {
                Node e = new Node(el);
                Node ne = temp.next;
                temp.next = e;
                e.next = ne;
                break;
            }
            temp = temp.next;

        }
        return head;

    }

    private static Node addLast(Node head, int va) {
        Node NewNode = new Node(va);
        if (head == null) {
            head = NewNode;
            return head;
        }
        Node currN = head;
        while (currN.next != null) {
            currN = currN.next;
        }
        currN.next = NewNode;
        return head;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 4, 5 };
        Node head = constructLL(arr);
        // head = removehead(head);
        // in every question u should return the modified head
        // head = removetail(head);
        // head = removek(head, 4);
        head = addLast(head, 8);
        head = addfirst(head, 6);
        head = addPlace(head, 3, 3);
        print(head);
    }
}
