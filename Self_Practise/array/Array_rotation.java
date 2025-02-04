package Self_Practise.array;

import java.util.Scanner;

public class Array_rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //61- Array Reverse Without Using Extra space

//        int arr[]={1,2,3,4,5};
//        int i=0; int j= arr.length;
//        while (i<j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
//        System.out.println(Arrays.toString(arr));


//        int arr[] = {1, 2, 3, 22, 12, 111};
//        int size = 6;
//        int target = 22;
//        int ans = -1;
//        for (int i = 0; i < arr.length; i++) {
//            int currentelemnt = arr[i];
//            if (currentelemnt == target) {
//                ans = i;
//                break;
//            }
//        }
//        System.out.println(ans);


        // Binary Search
        int arr[] = {12, 75, 344, 386, 400, 500};
        int size = 6;
        int target = 386;
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int m = (start + end) / 2;

            if (arr[m] == target) {
                ans = m;
                break;
            } else if (start < target) {

            }
        }

    }
}
