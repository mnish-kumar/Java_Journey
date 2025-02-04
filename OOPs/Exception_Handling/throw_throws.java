package OOPs.Exception_Handling;

import java.util.Scanner;


//throw exception
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class throw_throws {
    public static void main(String[] args) {

        // throws ke liye
//        int arr[] = new int[5];
//        try {
//            getNum(arr);
//        }catch (Exception e){
//            System.out.println("Catch the exception.\n" + e.getMessage());
//        }


        //throw ke liye
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter your age : ");
            int age = sc.nextInt();

            if (age > 100) {
                throw new MyException("Age cannot be  greater than 100.");
            }

        }catch (MyException e){
            System.out.println("Error: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Invalid input. Please enter a valid age."); // Handle other exceptions like input mismatch
        }

    }

    //throws Exception
//    public static int getNum(int [] arr) throws ArithmeticException{
//        return arr[8];
//    }

}
