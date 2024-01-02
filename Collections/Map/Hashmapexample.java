package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Hashmapexample {
    public static void main(String args[]){
        Map<Integer, String> hm = new HashMap<>();
        hm.put(3,"Bharath");
        hm.put(2,"Hello World");
        hm.put(7,"Thala for a reason");
        // hm.put(2,"Mvs"); //over-riding = 2,Mvs
        hm.putIfAbsent(2,"Mvs"); // Hello world so the value wont change

        System.out.println(hm.entrySet());
        System.out.println(hm.values());// only values
        System.out.println(hm);
        System.out.println(hm.get(2));//hello world
        System.out.println(hm.containsValue("Thala for a reason")); //true
        //iterate over keys
        for(Integer i : hm.keySet()){
            System.out.println(i);
        }
        //iterate through values
        for(String k : hm.values()){
            System.out.println(k);
        }
        //we can use var so whatever there it will print
        for(var j : hm.values()){
            System.out.println(j);
        }
    }
}
