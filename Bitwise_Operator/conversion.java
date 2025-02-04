package Bitwise_Operator;

import Self_Practise.array.MyArray;

import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Decimal to Binary Conversion
//        int n = sc.nextInt();
//        StringBuilder bin = new StringBuilder();
//        while (n > 0) {
//            int res = n % 2;
//            bin.append(res);
//            n = n / 2;
//        }
//        System.out.println(bin.reverse());
        //       System.out.println(Integer.toBinaryString(n)); //shortcut trick


        //Binary to decimal conversion
//        String binary = "100100";
//        int decimal = 0;
//        int i = 1;
//        while (i <= binary.length()) {
//            if (binary.charAt(i - 1) == '1') {
//                decimal += (int) Math.pow(2, binary.length() - i);
//            }
//            i++;
//        }
//        System.out.println(decimal);


        //finding even or odd
//        int n = sc.nextInt();
//        System.out.println((n & 1) != 0 ? "Odd" : "Even");

        //left||right shift operator
        int n = 5;
        System.out.println(n << 2); // A*2pow n
        System.out.println(n >> 2);//  A/2pow n

        //finding even and odd -> least significant number is 0 that is even either odd.
        int number = sc.nextInt();
        System.out.println((number & 1) == 0 ? "Even" : "Odd");
    }
}
