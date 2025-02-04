package OOPs.Exception_Handling;


public class try_catch {
    public static void main(String[] args) {

        // try and catch explain
        int[] arr = new int[5];
        System.out.println(arr[0]);     //Answer = 0

        //Exception handle through the try-catch block
        try {
            System.out.println(arr[6]);     //ArrayIndexOutOfBound = length 5 hai aur access 6 kar rahe hai -> terminate the program
            int a = 5 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("I'm trying to fix index out of bound.\n");
        } catch (Exception e) {
            System.out.println(e.getStackTrace());      //kis line pe galti ho rahi hai
            System.out.println(e.getMessage());         //kya galat hai message
            System.out.println(e);
        }finally {
            System.out.println("I will always run...😍");
        }
        System.out.println("Hello i am the present after the Exception...");

    }
}
