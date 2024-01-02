package Collections.List;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linked_ll_example {
    public static void main(String args[]) {
        // Declare Linked List
        // LinkedList li = new LinkedList(); // for different types of data types
        LinkedList<Integer> lis = new LinkedList<Integer>();
        lis.add(100);
        lis.add(200);
        lis.add(300);
        //Adding at first
        lis.addFirst(400);
        //Adding at last
        lis.addLast(600);
        //getting first
        System.out.println(lis.getFirst());
        //getting last
        System.out.println(lis.getLast());
        //removing first
        lis.removeFirst();
        //removing last
        lis.removeLast();
        // remove index we can only remove by index
        lis.remove(2);
        // adding in the midlle of the ll
        lis.add(2, 400);
        // retreving value/object
        System.out.println(lis.get(2));
        lis.set(2, 500);
        System.out.println(lis.contains(300));
        System.out.println(lis.size());
        System.out.println(lis.isEmpty());
        System.out.println(lis);
        // reading elements from LL using for loop
        for (int i = 0; i < lis.size(); i++) {
            System.out.println(lis.get(i));
        }
        // using each loop
        for (Object e : lis) {
            System.out.println(e);
        }
        // iterator() method
        Iterator it = lis.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //Adding one linkedlist to another
        LinkedList new_l = new LinkedList();
        new_l.addAll(lis);
        System.out.println(new_l);
        new_l.removeAll(lis);
        System.out.println(new_l);
        //sort() Collection.sort(collection)
        Collections.sort(lis);
        System.out.println(lis);
        Collections.sort(lis,Collections.reverseOrder());
        System.out.println(lis);
        //shuffle
        Collections.shuffle(lis);
        System.out.println(lis);
    }
}
//Arraylist-1)retriving
// for insertion and deletion we linked list because arraylist
// need so much of perfomance of moving elements front and back
// if replaces any element
// Linkedlist preffered for more insertion and deletion
//for more retrivels we cannot use linkedlist we use arraylist
//bcz where each element will be reffering to another elements so it take so much of time
// collection-
// list--
// 1)arrraylist
// 2)linkedlist
//linkedlist-1)dequeue
//2)list
// Duplicated and null insertion oriented -properties

