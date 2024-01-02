package Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhashset {
    //hashset-duplicates not allowed
    //insertion order is not preserved
    //hashtable
    //Linkedhashset-duplicates not allowed
    //insertion order is preserved
    //hash table
    //load factor is same 
    public static void main(String args[]){
        //LinkedHashSet <Integer>lset = new LinkedHashSet();
        LinkedHashSet lset = new LinkedHashSet();
        //HashSet hset = new HashSet();
        lset.add(100);
        lset.add(200);
        lset.add(500);
        System.out.println(lset);
    }
}
