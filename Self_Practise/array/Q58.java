package Self_Practise.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q58 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[]array = new int[size];

        for (int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();

        int [] reverse = new int [array.length];
        int str = 0;
        for (int i = array.length - 1; i >=0 ; i--) {
            reverse[str]= array[i];
            str++;
        }
        System.out.println(reverse);

    }
}
