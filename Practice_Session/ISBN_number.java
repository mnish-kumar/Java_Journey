package Practice_Session;

import java.util.Scanner;

public class ISBN_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question : Find ISBN number.

        int n = 1259060977;
        int dup = n;

        int c = 0;
        while (dup != 0) {
            c++;
            dup /= 10;
        }

        int sum = 0;
        if (c == 0) {
            while (n != 0) {
                int last = n % 10;
                sum += (last * c--);
                n = n / 10;
            }
            System.out.println(sum % 11 == 0 ? "True" : "False");
        } else
            System.out.println("false");
    }
}
