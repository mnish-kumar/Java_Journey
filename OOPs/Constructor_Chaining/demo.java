package OOPs.Constructor_Chaining;

public class demo {

    class A {
        A() {
            System.out.println("Parent default constructor.");
        }

        A(int a) {
            this();
            System.out.println("Parent constructor with one parameter.");
        }

        A(int a, String name) {
            this();
            System.out.println("Parent constructor with two parameter.");
        }
    }

    class B extends A {
        B() {
            super(12);
            System.out.println("Child default constructor.");
        }

        B(int a) {
            System.out.println("Child constructor with one parameter.");
        }
    }

    public static void main(String[] args) {
        demo outer = new demo();
        A obj = outer.new B();
    }
}
