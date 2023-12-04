package javaCollections;
import java.util.ArrayList; // Import the ArrayList class from the Java Collections Framework
// import java.util.List;
import java.util.Iterator;

public class MyArrayListExample {
    public static void main(String[] args) {
        // Declare and initialize your ArrayList
        // ArrayList al = new ArrayList(); where this is used for heterogenous means we can store different data types
        // ArrayList<Integer> al = new ArrayList<Integer>();
        // List al = new ArrayList();
        ArrayList al = new ArrayList();

        //Add new elements to the arraylist
        al.add(100);
        al.add("welcome");
        al.add(2,"hello");
        al.add(true);
        System.out.println(al);

        //find the objects stored in the array list
        System.out.println(al.size());//index from zero
        //remove elements
        al.remove(1);
        al.remove("hello");
        System.out.println(al);
        //Insert a new element
        al.add(1,"welcome");
        al.add(2,"java");

        System.out.println(al);
        //retreive specific element
        System.out.println(al.get(2));
        //replace element
        al.set(2,"Python");
        System.out.println(al);
        //search-contains() returns if found true or else false
        System.out.println(al.contains("Python"));

        //isEmpty()
        System.out.println(al.isEmpty());//false


        //1)for loop we can read the data
        // System.out.println("Reading Element using for loop...");
        // for(int i=0; i<al.size(); i++){
          
        //     System.out.println(al.get(i));
        // }

        // 2) for..each loop
        // System.out.println("Reading elements using for ..each loop");
        // for(Object e:al){
        //     System.out.println(e);
        // }

        //3)iterator()
        System.out.println("Reading elements using iterator method");
       Iterator it = al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
     
        }
}
}
