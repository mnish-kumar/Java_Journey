package OOPs.Getter_Setters;

public class effective {

    private int age;
    private String name;

    //jo phle set hai usko dekhne ke liye get ka use hota hai
    public int getAge() {
        return age;
    }

    //phle se jo value hai usko change karne ke liye.
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "effective{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
//    effective(int age , String name) {
//        this.age = age;
//        this.name = name;
//    }
}
