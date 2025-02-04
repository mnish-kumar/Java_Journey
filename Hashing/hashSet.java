package Hashing;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        // creating
        HashSet<Integer> set = new HashSet<>();
        // Insert
        set.add(1);
        set.add(2);
        set.add(1);

        // Search -> Contains
        if (set.contains(1))
            System.out.println("exist");

        if (!set.contains(3))
            System.out.println("not exist");

        // Delete -> remove
        set.remove(1);
        if (!set.contains(1))
            System.out.println("delete the 1");
    }
}
