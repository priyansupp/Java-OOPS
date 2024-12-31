package oops;

public class Toyota extends Car {

    public Toyota() {
        super("This is Toyota car");
    }

    public static void main(String[] args) {
        System.out.println("Toyota class main");
    }

    @Override
    public void startEngine() {     // make this public so you can call this from Toyota class's object
        System.out.println("Engine of Toyota started");
    }

    @Override
    public void startEngine(String engineSound) {       // overriding overloaded abstract method
        System.out.println("Engine of Toyota starting... " + engineSound);
    }
}
