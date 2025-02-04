package OOPs.Constructor;

public class createMethod {
    String name;
    int age;
    String clgName;
    int year;

    createMethod() {  // This is a special type of method. jitne baar object call hoga utna baar ye call hoga.
        System.out.println("Hey!");
    }

    public void fillDetails(String name, int age, String clgName, int year) {
        this.name = name;
        this.age = age;
        this.clgName = clgName;
        this.year = year;
    }

    public static void main(String[] args) {

        createMethod s1 = new createMethod();
        s1.fillDetails("Manish kumar", 20, "Patel", 3);
        System.out.println(s1.name + " " + s1.age + " " + s1.clgName + " " + s1.year + ".");

        createMethod s2 = new createMethod();
        s2.fillDetails("Priyanka kumari", 19, "Bihar", 2);
        System.out.println(s2.name + " " + s2.age + " " + s2.clgName + " " + s2.year + ".");
    }
}
