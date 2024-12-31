package school;

public class Student {
    private int rollNo;                         // instance variable
    private String name;
    private int standard;
    public static String school =
            "Ascent International School";      // class variable

    public Student() {}     // default constructor

    // overloaded constructor -> With params
    public Student(int rollNo, String name, int standard) {
        this.rollNo = rollNo;
        this.name = name;
        this.standard = standard;
    }

    public void sayHello() {
        System.out.println("Hello Students");
    }
}
