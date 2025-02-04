package Practice_Session;

import java.util.Arrays;

public class Questions_21 {
    public static void main(String[] args) {
        // 21.Move all the zeroes at right side and ones at left side

        int[] array = {0, 0, 1, 0, 1, 1, 0};
        int[] arr = new int[array.length];
        int left = 0;
        int right = array.length - 1;
        for (int element : array) {
            if (element == 1)
                arr[left++] = element;
            else
                arr[right--] = element;
        }

        for (int aa1 : arr){
            System.out.print(aa1 + " ");
        }


//        while (left < right) {
//            if (array[left] == 1) left++;
//            else if (array[right] == 0) right--;
//            else {
//                int temp = array[left];
//                array[left] = array[right];
//                array[right] = temp;
//            }
//        }
//        System.out.println(Arrays.toString(array));



//        int[] arr = {1, 0, 1, 1, 1, 0};
//        int max = Integer.MIN_VALUE;
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 1) count++;
//
//            else {
//                max = Math.max(count, max);
//                count = 0;
//            }
//        }
//        System.out.println(Math.max(max, count));


    }
}
