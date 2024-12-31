package oops;

public class BMW extends Car{

    public BMW() {
        super("This is BMW car");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine of BMW started");
    }

    @Override
    public void startEngine(String engineSound) {       // overriding overloaded abstract method
        System.out.println("Engine of BMW starting... " + engineSound);
    }
}
