package Practice_Session;

import java.util.Scanner;

public class Perfect_Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question - Perfect square 25=5*5 , 36=6*6
        int a=scanner.nextInt();
        if (isPerfectSquare (a))
            System.out.println("yes");
        else
            System.out.println("no");
    }

    public static boolean isPerfectSquare(int a){
        if (a <  0){
            return false;
        }int sqrt = (int) Math.sqrt(a);
        return  sqrt*sqrt == a;
    }
}
