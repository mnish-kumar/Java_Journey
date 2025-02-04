package Self_Practise.array;

import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input taking in array
        System.out.println("Enter size of an array:");
        int size =scanner.nextInt();
        int arr[]=new int[size];

        // Array me value store karne ke liye
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Enter " + i + " element;");
            arr[i]=scanner.nextInt();
        }
        //Array ki value print karane ke liye for loop
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
