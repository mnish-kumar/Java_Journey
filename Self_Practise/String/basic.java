package Self_Practise.String;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //1.
//        String s = sc.nextLine();
//        for (int i = 0; i < s.length(); i++)
//            System.out.println(s.charAt(i));

        //2.
//        String s1 = "Priyanka";
//        for (int i = s1.length() - 1; i >= 0; i--)
//            System.out.println(s1.charAt(i));

        //3.
//        String s2 = "abc";
//        String rev = "";
//        for (int i = s2.length() - 1; i >= 0; i--)
//            rev += s2.charAt(i);
//        System.out.println(s2.equals(rev) ? "Palindrome" : "Not Palindrome");

        //4.
//        String s3 = "aba";
//        char[] convert = s3.toCharArray();
//        int i = 0;
//        int j = convert.length - 1;
//        while (i < j) {
//            char temp = convert[i];
//            convert[i] = convert[j];
//            convert[j] = temp;
//            i++;
//            j--;
//        }
//        String reverse = new String(convert);
//        System.out.println(reverse.equals(s3) ? "P" : "not");

        //5.
//        String s4 = "aeifgdrtu";
//        char[] arr = s4.toCharArray();
//        int vowel = 0 , consonant = 0;
//        for (int i =0 ; i < arr.length; i++){
//            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
//                vowel++;
//            else
//                consonant++;
//        }
//        System.out.println(vowel + "\n" + consonant);

        //6.
//        String s5 = "AbcDg";
//        String ans = "";
//        for (char ch : s5.toCharArray()) {
//            if (ch >= 'a' && ch <= 'z')
//                ans += (char) (ch - 32);
//            else
//                ans += (char) (ch + 32);
//        }
//        System.out.println(ans);

        //7.
//        String[] s6 = {"pay", "attention", "practice", "attend"};
//        String prev = "at";
//        int count = 0;
//        for (String s : s6){
//            if (s.startsWith(prev))
//                count++;
//        }
//        System.out.println(count);

        //8.
//        String s7 = "hello bhai kaise ho";
//        String[] arr = s7.split(" ");

//        for (String word : arr){
//            String ans = word.substring(0 , 1).toUpperCase() + word.substring(1);
//            System.out.println(ans);
//        }
//        for (String word : arr) {
//            String temp = "";
//            temp += (char) (word.charAt(0) - 32);
//            temp += word.substring(1);
//            System.out.println(temp);
//        }

        //9.
//        String s8 = "hello bhai kaise ho a";
//        String[] arr = s8.split(" ");
//        for (String word : arr) {
//            String ans = "";
//            if (word.length() <= 2) {
//               ans += word.toUpperCase();
//            } else {
//                 ans += word.substring(0, 1).toUpperCase() + word.substring(1, word.length() - 1) + word.substring(word.length() - 1).toUpperCase();
//            }
//            System.out.print(ans + " ");
//        }

        //10.
//        String[] s9 = {"i am the best" , "hello" , "hurrey! you are won b"};
//        int max = Integer.MIN_VALUE;
//        for (String word : s9){
//            int length = word.split(" ").length;
//            max = Math.max(length,max);
//        }
//        System.out.println(max);

        //11.
//        String s10 = "asvbcjsddkjfejnc";
//        int[] map = new int[26];
//        char[] bitMap = s10.toCharArray();
//        for (char letter : bitMap){
//            map[letter - 97]++;
//        }
//        for (int i =0; i<map.length; i++){
//            if (map[i] !=0)
//            System.out.println((char) (i + 97) + "= " + map[i]);
//        }

        //12.
//        String s11 = "state";
//        String s12 = "taste";
//        char[] ch1 = s11.toCharArray();
//        char[] ch2 = s12.toCharArray();
//        Arrays.sort(ch1);
//        Arrays.sort(ch2);
//        System.out.println(ch1.length == ch2.length ? "Anagram" : "Not");

//        String s11 = "taste";
//        String s12 = "state";
//
//        if (s11.length() != s12.length()) {
//            System.out.println("Not anagram");
//        } else {
//            boolean isAnagram = true;
//            int[] arr = new int[26];
//            for (int i = 0; i < s11.length(); i++) {
//                char ch1 = s11.charAt(i);
//                char ch2 = s12.charAt(i);
//                arr[ch1 - 97]++;
//                arr[ch2 - 97]--;
//            }
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] != 0) {
//                    isAnagram = false;
//                    break;
//                }
//            }
//            System.out.println(isAnagram ? true : false);
//        }

    }
}
