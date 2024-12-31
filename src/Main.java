// public class -> A class declared with the modifier 'public' -> that class is visible to all classes everywhere.
//                 Can be accessed from outside the package(eg: Inheritance can be accessed in Main.java outside its oops package)
// class -> If a class has no modifier (the default, also known as package-private), it is visible only within its own package
//          (packages are named groups of related classes)
// NOTE: Classes cannot be private/protected -> Doesn't make sense
//       Only members of classes can have private/protected/public modifiers.

// There can be atmost one public class in a .java source file -> That public class's name must match the filename
// The main method must be public static(to access from outside the class without creating any instance of the class)

import oops.BMW;
import oops.Toyota;
import school.Boy;
import school.Girl;
import school.Student;
import oops.Car;

class Helper {
    public void help() {
        Student s1 = new Student(12, "Priyanshu", 12);
        Boy b1 = new Boy(13, "Ashish", 11, 9);
        Girl g1 = new Girl(14, "Kanak", 10, 8);

        s1.sayHello();
        b1.sayHello();
        g1.sayHello();

        // static variable
        System.out.println(Student.school);

        // Car c1 = new Car();     // abstract classes cannot be instantiated -> They have abstract methods that are not implemented
        Toyota t1 = new Toyota();  // Toyota extends Car and implements its abstract method and hence can be instantiated
        BMW bmw1 = new BMW();
        // t1.startEngine();           // startEngine() must be public inside Toyota to be accessed via Toyota's object.
        // bmw1.startEngine();         // startEngine() must be public inside BMW to be accessed via BMW's object.
        startCar(t1);
        startCar(bmw1);

        startCarWithSound(t1, "Trrrrmmmm");
        startCarWithSound(bmw1, "brrrrmmmm");

        printMsg(t1);
        printMsg(bmw1);
    }

    private void printMsg(Car c) {
        System.out.println(c.msg);
    }

    // This method takes reference of Car class. Note -> Toyota, BMW both are Car
    private void startCar(Car c) {
        c.startEngine();            // startEngine() must be public inside Car to be accessed via Car's reference(c) here.
    }

    private void startCarWithSound(Car c, String engineSound) {
        c.startEngine(engineSound);
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Main class main");
        // Toyota.main(null);     // just another method that can be called

        Helper h = new Helper();
        h.help();
    }
}