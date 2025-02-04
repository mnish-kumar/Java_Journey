package Self_Practise.array;

import java.util.Scanner;

public class LinearSearch {

    // Find a linear search
    public static boolean linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            if (currentElement == target) {
                // found the  element
                return true;
            }
        }
        // yaha tak aa gaye iska matlab aapne pura array traverse kar liya hai
        // element not found
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {12, 3, 2, 43, 43};
        int size = 5;
        int target = 55;
        boolean ans = linearSearch(array, target);
        System.out.println("Target is available in array ? " + ans);


    }
}
