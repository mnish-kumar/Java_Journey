package Hashing.Project;

import java.util.*;

public class Project_84 {
    public static void main(String[] args) {

        // 84- Print the unique elements in an array

        int arr[] = {1, 4, 5, 2, 1, 6, 5, 2, 4, 1, 2, 8, 9};

        Set<Integer> set = new HashSet<>();
        for (int e : arr) set.add(e);
        System.out.println(set);


//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (!list.contains(arr[i]))
//                list.add(arr[i]);

//            boolean exists = false;
//            for (int j = 0; j < list.size(); j++) {
//                if (arr[i] == list.get(i)) {
//                    exists = !exists;
//                    break;
//                }
//            }
//            if (!exists)
//                list.add(arr[i]);

//        }
    }
}
