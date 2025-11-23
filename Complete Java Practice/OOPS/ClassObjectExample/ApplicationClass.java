package OOPS.ClassObjectExample;

public class ApplicationClass {
    public static void main(String[] args) {
        Student std = new Student("Rohit", "Pawar");

        std.setAge(10);
        std.setStandard(5);

        System.out.println("Student details : "+std.toString());
    }
}
