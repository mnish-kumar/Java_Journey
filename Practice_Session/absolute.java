package Practice_Session;

import com.sun.jdi.Value;

import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int[] arr = {1, 2, 3, 4};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                sum += Math.abs(arr[i] - arr[j]);
//            }
//        }
//        System.out.println("Total sum = " + sum);


        int[] a = {4, 2, 6, 2, 3};
        char[] b = {'b', 'a', 'c', 'a', 'b'};

        int min_a = Integer.MAX_VALUE, min_b = Integer.MAX_VALUE, min_c = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                switch (b[i]) {
                    case 'a' -> min_a = Math.min(min_a, a[i]);
                    case 'b' -> min_b = Math.min(min_b, a[i]);
                    case 'c' -> min_c = Math.min(min_c, a[i]);
                }
            }
        }
        int ans = Math.min(min_a + min_b, min_c);
        System.out.println(ans);
    }
}
