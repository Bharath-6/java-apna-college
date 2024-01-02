package Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class Treemapexample {
    public static void main(String args[]){
        TreeMap<Integer, String> thmp = new TreeMap<>();
        thmp.put(3,"mvv");
        thmp.put(2,"mv");
        thmp.put(1,"m");
        System.out.println(thmp);
        //it will be in sorted order
    }
}
