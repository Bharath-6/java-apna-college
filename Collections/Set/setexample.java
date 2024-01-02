package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class setexample {
    public static void main(String args[]) {
        // set-
        // *hashset
        // *linkedhashset
        // hashset-duplicates are not allowed
        // and insertion order is not preserved
        // hashcode will be used to insert the elements
        // searching of elements is so fast
        // not sequence all are not in the order
        // heterogenous data will be supported
        // for searching operations we use hashset
        // intital size is 16 elements
        // load factor/fill:ratio 0.75
        // intially it is 16 so we need to add extra so it will become 17 so new copy
        // and add element and refer to the hashset
        // THis is called as loadfactor for intital is 16 where it is 75 percent and
        // extra the above point will be done

        // HashSet hs = new HashSet(); // default capcity 16 and load factor 0.75;
        // HashSet hs = new HashSet(100); //initial capcity 100 we are giving
        // HashSet hs = new HashSet(100,(float)0.90);
        HashSet<Integer> hs = new HashSet<Integer>();
        // Adding elements into HashSet
        hs.add(100);
        hs.add(200);
        hs.add(500);
        hs.add(300);
        // it will be printing in different order how we inserted because
        // insertion order is not preserved
        System.out.println(hs);
        // remove()
        hs.remove(500); // directly it will be delete the value no index concept
        // contains()
        System.out.println(hs.contains(300));
        // empty or not
        System.out.println(hs.isEmpty());
        // loops
        // Reading elemens from hashset using for .. each loop
        // for all data types we use Object
        // for(int n : hs){
        // System.out.println(n); //random order
        // }
        // iterator
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // copying all elements in hs in another hashset
        HashSet<Integer> hh = new HashSet<Integer>();
        hh.add(5);
        hh.add(6);
        hh.add(7);
        HashSet<Integer> h = new HashSet<Integer>();
        h.addAll(hh);
        h.add(8);
        System.out.println(h);
        // remove all
        h.removeAll(hh);
        System.out.println(h); // where copied will be deleted and left over will be printed
        System.out.println(hs);

        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(15);
        set1.add(16);
        set1.add(17);
        set1.add(18);
        System.out.println(set1);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(50);
        set2.add(60);
        set2.add(17);
        System.out.println(set2);

        // union collect all the elements from two sets those are hash and set these are
        // two sets
        // and it will remove duplicate elements and only have unique elements
        set1.addAll(set2);
        System.out.println("union" + set1);

        // Intersection is known as also retain
        // where it will print common elements
        set1.retainAll(set2);
        System.out.println("intersection" + set1);
        // if we want to get common elements we have to comment out the union operation
        // above
        // difference between sets
        set1.removeAll(set2);
        System.out.println("Difference" + set1);
        // subset
        System.out.println(set1.containsAll(set2)); // what are the elements having set 2 will be having in set1 then
                                                    // true or else false means set is subset of set1
        System.out.println("Subset" + set1);

    }
}
