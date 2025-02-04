package Hashing.Project;

import java.util.*;

public class Project_86 {
    public static void main(String[] args) {
        // 86- 771. Jewels and Stones
        int ans = 0;
        Set<Character> set = new HashSet<>();
        String jewels = "aA", stones = "aAAbbbb";
        for (char jewel : jewels.toCharArray()) {
            set.add(jewel);
        }
        for (char stone : stones.toCharArray()) {
            ans += set.contains(stone) ? 1 : 0;
        }
        System.out.println("Count = " + ans);

    }
}
