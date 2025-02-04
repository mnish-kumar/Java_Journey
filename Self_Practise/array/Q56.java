package Self_Practise.array;

import java.util.Scanner;
import java.util.Arrays;

public class Q56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {2, 96, 69, 77, 145, 20};
        int first_max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > first_max) {
                second_max = first_max;
                first_max = array[i];
            } else if (array[i] < first_max && array[i] > second_max) {
                second_max = array[i];
            }
        }
        System.out.println(second_max);
    }
}