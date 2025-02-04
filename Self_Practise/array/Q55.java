package Self_Practise.array;

import java.util.Scanner;
import java.util.Arrays;

public class Q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // find  max
        int size = sc.nextInt();
        int[] array = new int[size];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Max number in array: " + max);
    }
}
