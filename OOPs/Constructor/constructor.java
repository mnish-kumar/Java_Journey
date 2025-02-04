package OOPs.Constructor;

import java.util.Objects;

public class constructor {
    private String name;
    int age;
    private String clg;

    public String getName() {       // call function to user read because it is private -> getter
        return name;
    }

    constructor(String name, int age) {     // any type of requirements call object,
        this.name = name;
        this.age = age;
    }


    constructor(String name, int age, String clg) {
        this.name = name;
        this.age = age;
        this.clg = clg;
    }

       @Override
    public String toString() {  // toString is in-build method that calling automatic.
        return "constructor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", clg='" + clg + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //  Object calling and create
        constructor s1 = new constructor("manish", 20, "PATEL");
        constructor s2 = new constructor("rahul", 12, "BIHAR");
        constructor s3 = new constructor("sudhir", 34);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
