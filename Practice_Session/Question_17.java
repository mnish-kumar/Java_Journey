package Practice_Session;

import java.util.Arrays;

public class Question_17 {
    public static void main(String[] args) {
        //17 . Given an array of integers, update every element with the multiplication of previous and next elements with the following exceptions.
        //a) The First element is replaced by the multiplication of the first and second.
        //b) The last element is replaced by multiplication of the last and second last.

        int arr[] = {2, 3, 4, 5, 6};
        int n = arr.length;

        int prev = arr[0];
        arr[0] = arr[0] * arr[1];
        for (int i = 1; i < n - 1; i++) {
            int current = arr[i];
            arr[i] = prev * arr[i + 1];
            prev = current;
        }
        arr[n - 1] = prev * arr[n - 1];
        System.out.println(Arrays.toString(arr));
    }
}
