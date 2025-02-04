package Practice_Session;

import java.security.PublicKey;
import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //18. We are given an array of Integers. We have to perform the following operation on the array until it is fully exhausted.
        //Select the max number in the array and delete that number including all the numbers to its right side in the array.
        //Repeat the step 1 for the left elements of the array i.e select the maximum element in the left elements  and delete it including all numbers to its right.
        //Our task is to simulate the above procedure and return the number of steps that will be taken until the first element(index 0) of the array is also deleted and array is said to be exhausted.
        //Input : Array = [2, 3, 5, 4, 1]
        //Output : Steps Taken: 3
        //Explanation: Step 1: Remove 5 and elements to its right
        //             so, Array becomes [2, 3]
        //             Step 2: Remove 3 as it is the maximum and
        //             right most already so, Array becomes [2]
        //             Step 3: Remove 2 and the array becomes EMPTY
        //             Hence, at the end of step 3 the array stands
        //             exhausted.
        //Select the max number in the array and delete that number including all the numbers to its right side in the array.
        //Repeat the step 1 for the left elements of the array i.e select the maximum element in the left elements  and delete it including all numbers to its right.
        //Our task is to simulate the above procedure and return the number of steps that will be taken until the first element(index 0) of the array is also deleted and array is said to be exhausted.
        //Input : Array = [2, 3, 5, 4, 1]
        //Output : Steps Taken: 3
        //Explanation: Step 1: Remove 5 and elements to its right
        //             so, Array becomes [2, 3]
        //             Step 2: Remove 3 as it is the maximum and
        //             right most already so, Array becomes [2]
        //             Step 3: Remove 2 and the array becomes EMPTY
        //             Hence, at the end of step 3 the array stands
        //             exhausted.

        int[] arr = {2, 3, 5, 4, 1};
        int c = 0;
        int index = arr.length;
        while (index != 0) {
            index = findmax(arr, index);
            c++;
        }
        System.out.println(c);
    }


    public static int findmax(int arr[], int n) {
        int max = 0, index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

}
