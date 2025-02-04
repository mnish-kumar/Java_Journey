package Self_Practise.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // rotate k elements.
        int[] array = {2, 3, 4, 5, 6, 7};
        int k = sc.nextInt();
        k = k % array.length;

        for (int j = 0; j < k; j++) {
            int store = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = store;
        }
        System.out.println(Arrays.toString(array));
    }
}
