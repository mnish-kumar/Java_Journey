package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("Cherry", 1);
        map.put("Banana", 2);
        map.put("Apple", 3);

        //display hashmap
        System.out.println(map);

        // Access a value by key
        System.out.println("Get the value of map : " + map.get("Apple"));

        // Check if a key exists
        if (map.containsKey("Cherry")) {
            System.out.println("Exist in map.");
        } else {
            System.out.println("Not exist in map.");
        }

        // Remove a key-value pair
        map.remove("Banana");
        System.out.println("HashMap after removing key 3 : " + map);


        // Iterate through the HashMap
        System.out.println("\niterate in HashMap....");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}
