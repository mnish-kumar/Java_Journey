package OOPs.Constructor;

public class starting {

    String name;
    int age;
    String clgName;

    public static void main(String[] args) {
        // Method I
        starting s1 = new starting();          // new = new space in memory.
        s1.name = "Manish Kumar";
        s1.age = 21;
        s1.clgName = "PATEL.";

        starting s2 = new starting();
        s2.name = "Man Kumar";
        s2.age = 20;
        s2.clgName = "Patel.";

        System.out.println(s1.name + " " + s1.age + " " + s1.clgName);
        System.out.println(s2.name + " " + s2.age + " " + s2.clgName);
    }
}