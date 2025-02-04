package Practice_Session;

import java.util.Scanner;

public class harshad_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of num :");
        int num = scanner.nextInt();
        int temp = num;
        int sum = 0;

        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println(temp % sum == 0 ? "Harshad number" : "NOT");
    }
}
