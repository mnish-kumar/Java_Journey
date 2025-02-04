package Self_Practise.Cognifyz;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Task : Palindrome checker
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int dummy = n;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n /= 10;
        }
        System.out.println(sum == dummy ? "Palindrome" : "Not palindrome");
    }
}
