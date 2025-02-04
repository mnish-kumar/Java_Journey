package String_Builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class first {
    public static void main(String[] args) throws IOException {


//        StringBuilder sb = new  StringBuilder(410);
//        System.out.println(sb.length());
//        System.out.println(sb.capacity());
//
//        //offset -> crop index
//        // append => use to add where the place of +
//        sb.append("hello");
//        System.out.println(sb);

//        String s = "hello";
//        //  Character.isLowerOrDigits(s.charAt(left))
//        StringBuilder sb = new StringBuilder();
//        for (int i = s.length() - 1; i >= 0; i--) {
//            sb.append(s.charAt(i));
//        }
//        System.out.println(sb);
        // many manupulation

        // paseInt = give primitive datatype result
//        int  a = Integer.parseInt("123");
//        System.out.println(a);

//        System.out.println(Integer.MIN_VALUE);

//        ISR -> read character

//        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        int a = Integer.parseInt(br.readLine());
        System.out.println(in);
    }
}
