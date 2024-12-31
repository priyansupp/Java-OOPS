package oops;

// abstract classes contain abstract as well as non-abstract methods
// abstract is not an access modifier, public is
abstract public class Car {

    public String msg;

    public static void main(String[] args) {    // abstract class can have static methods
        System.out.println("Car abstract class main");
    }

    // abstract methods can only be in abstract classes and don't have any implementation - Must be overridden in subclasses
    abstract public void startEngine();     // make this public, so you can call this function from Car class's reference
    abstract public void startEngine(String engineSound);   // overloading abstract method

    // abstract class can have constructor(to be called using super() from child class's constructor)
    Car(String msg) {
        this.msg = msg;
    }
}
