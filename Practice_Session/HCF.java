package Practice_Session;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int Highest_common =0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
               Highest_common=i;
            }
            System.out.println("HCF " + Highest_common);
        }
    }
}
