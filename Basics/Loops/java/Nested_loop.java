package Basics.Loops.java;

import java.util.Scanner;

public class Nested_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //45- Project Restaurant v 1.0 => Homework
        // Nested loops  i=top to bottom j=left to right
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }

    }
}
