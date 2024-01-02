package Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhash {
    public static void main(String args[]){
        Map<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(3,"mvv");
        lhm.put(2,"mv");
        lhm.put(1,"m");
        System.out.println(lhm);
        //order is preserved
    }
}
