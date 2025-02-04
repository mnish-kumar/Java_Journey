package Hashing.Project;

import java.util.HashMap;
import java.util.Map;

public class Project_85 {
    public static void main(String[] args) {
        // 85- Find the freqency of elements in an integer array

        int arr[] = {1, 4, 5, 2, 1, 6, 5, 2, 4, 1, 2, 8, 9};
        Map<Integer, Integer> map = new HashMap();

        for (int element : arr) {
            if (map.containsKey(element)) {
                // fetch the previous
                int val = map.get(element);

                // increment
                val++;

                // put it back
                map.put(element, val);
            } else
                map.put(element, 1);
        }
        System.out.println(map);
    }
}
