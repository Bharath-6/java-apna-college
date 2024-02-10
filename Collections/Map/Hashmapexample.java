package Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hashmapexample {
    public static void main(String args[]){
        // Map<Integer, String> hm = new HashMap<>();
        // hm.put(3,"Bharath");
        // hm.put(2,"Hello World");
        // hm.put(7,"Thala for a reason");
        // // hm.put(2,"Mvs"); //over-riding = 2,Mvs
        // hm.putIfAbsent(2,"Mvs"); // Hello world so the value wont change

        // System.out.println(hm.entrySet());
        // System.out.println(hm.values());// only values
        // System.out.println(hm);
        // System.out.println(hm.get(2));//hello world
        // System.out.println(hm.containsValue("Thala for a reason")); //true
        // //iterate over keys
        // for(Integer i : hm.keySet()){
        //     System.out.println(i);
        // }
        // //iterate through values
        // for(String k : hm.values()){
        //     System.out.println(k);
        // }
        // //we can use var so whatever there it will print
        // for(var j : hm.values()){
        //     System.out.println(j);
        // }
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(1,1);
        hm.put(2,1);
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(3);
        for(int i : l){
            hm.put(i, hm.getOrDefault(i, 0) + 1);

        }
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            System.out.println("Key:"+entry.getKey());
            System.out.println("value:"+entry.getValue());

        }
        //another way
        Set<Integer> Keys = hm.keySet();
        for(int key: Keys){
            System.out.println(key+" "+hm.get(key));
        }
        //removing a pair in hashmap
        hm.remove(3);
        System.out.println(hm); //{1=2, 2=1}
    
    }
}
