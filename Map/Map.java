import java.util.*;

public class Map {
    public static void main(String[] args) {
        // where we are performing map functionalities
        HashMap<String, Integer> mp = new HashMap<>();
        String[] arr = { "apple", "mango", "apple", "litchi" };

        for (String fruit : arr) {
            // getOrDefault is used to get current value and where we will be increasing the
            // value of the repeated key
            mp.put(fruit, mp.getOrDefault(fruit, 0) + 1);
        }
        // to print whole hashmap
        System.out.println(mp);
        // to get only keys
        System.out.println(mp.keySet());
        // to get only values
        System.out.println(mp.values());

        // to get both simultaneously

        for (String key : mp.keySet()) {
            System.out.println("key: " + key + " " + " value:" + mp.get(key));
        }
        // to get certain indivual value mp.get and enter the key
        System.out.println(mp.get("apple"));

        // to check certain key is their or not
        if (mp.containsKey("apple")) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }
}
