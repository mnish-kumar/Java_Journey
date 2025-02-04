package OOPs.Constructor_Chaining;

public class demo_1 {
    class A {
        public void makan() {
            System.out.printf("Pitaji makan");
        }
    }

    class B extends A {
        public void makan() {
            System.out.printf("Bada makan");
        }
    }

        public static void main(String[] args) {
            demo_1 object = new demo_1();
            B obj = object.new B();
            obj.makan();
        }
    }
