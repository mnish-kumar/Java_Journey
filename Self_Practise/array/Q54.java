package Self_Practise.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] array = new int[size];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length ; i++) {
            sum = sum + array[i];
        }
        System.out.println("Total sum of element in array: " + sum);
    }
}
