package Hashing.Project;

import java.util.*;

public class Project_87 {
    public static void main(String[] args) {
        // 87- 1832. Check if the Sentence Is Pangram

        String s = "Thequickbrownfoxjumpsoverthelazydog";

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        System.out.println(set.size() == 26 ? true : false);

    }
}
