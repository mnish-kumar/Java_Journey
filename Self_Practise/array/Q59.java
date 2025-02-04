package Self_Practise.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4};
        int k = sc.nextInt();
        System.out.println(Arrays.toString(rotate(array, k)));
    }

    public static int[]  rotate(int[] array, int k) {
        int n = array.length;
        reverse(array, 0, n - 1);
        reverse(array, 0, k - 1);
        reverse(array, k, n - 1);
        return array;
    }

    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
