package Self_Practise;

public class OOOPs {
    int a;
    static int b;

//    public void m1() {      // non static
//        m2();
//        System.out.println("m1");
//    }
//
//    public static void m2() {   //static
//        b = 34;
//        System.out.println("m2");
//    }

    //static block
    static {
        System.out.println("hello form static block.");
    }

    //intializer
    {
        System.out.println("Hello from intializer.");
    }

    //constructor
    OOOPs() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        OOOPs object = new OOOPs();
        OOOPs object1 = new OOOPs();
        OOOPs object3 = new OOOPs();
    }
}
