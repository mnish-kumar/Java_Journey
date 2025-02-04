package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class haspMap {
    public static void main(String[] args) {
        //HashMap => combination of key-pair.

        HashMap<String, Integer> map = new HashMap<>();
        //Insertion
        map.put("india", 120);
        map.put("US", 12);
        map.put("Canada", 2);
        System.out.println(map);

        // contains
        if (map.containsKey("US"))
            System.out.println("Key is present in map.");
        else
            System.out.println("Key is not present in map.");

        //get -> kya meri key present hai map me. nahi hai to null print hota hai
        System.out.println(map.get("US"));
        System.out.println(map.get("USE"));

        //Iterate in hashMAp
//        int arr[] = {1,2,3}; normal array traverse
//        for (int i : arr)
//            System.out.println(i);

        // hasMAp traverse method I,
        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println(e.getKey() + "= " + e.getValue());

        // haspMAp traverse method II,
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // remove
        map.remove("US");
        System.out.println(map);
    }
}
