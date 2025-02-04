package Practice_Session;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any two numbers find LCM.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int GCD = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                GCD = i;
            }
        }
        int LCM = a * b / GCD;
        System.out.println("Answer : " + LCM);
    }
}
