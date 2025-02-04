package Self_Practise;

public class Increment_decrement {
    public static void method(int a , int b){
        System.out.println(a++ + ++b);
    }
    public static void main(String[] args){
        method(5,5);
    }
}