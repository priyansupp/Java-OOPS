package oops2;

// Interface can only have methods without body that must be overridden in subclasses(kind of like abstract class with only abstract method)
// Total abstraction -> Interface cannot be instantiated
// All fields are public, static and final by default.
// A class that implements an interface must implement all the methods declared in the interface.
interface Animal {
    void eat();     // -> compiler -> public abstract void eat();
    void sleep();
    default void run() {        // default method can have implementation -> If no implementation found in subclass then this is executed -> But can be overridden in subclasses
        System.out.println("Animal runs");
    }
    // Static methods are associated with the class itself, not with instances of the class. This means they are called on the class directly, not on an object.
    // Static methods cannot be overridden -> Overriding is a mechanism for providing a different implementation of a method in a subclass for an object. Since static methods aren't associated with objects, they cannot be overridden.
    static int speed(int energy) {      // static methods can also have implementation
        return energy * 2;
    }
}

interface felide extends Animal {
    void burp();
}

// Cat must implement all the methods of Animal
class Cat implements Animal {
    @Override
    public void eat() {     // declare it public so it can be used from Main/other classes
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void run() {
        System.out.println("Cat runs");
    }

    // Method hiding(not overriding) -> The subclass method hides the superclass method
    // When you call the method on the subclass, the subclass version is executed.
    // When you call the method on the superclass, the superclass version is executed.
    static int speed(int energy) {
        return energy * 3;
    }
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping ");
    }
}

class Helper {
    public void help() {
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        feedPet(d1);
        feedPet(c1);
        d1.run();
    }

    void feedPet(Animal a) {
        a.eat();
    }
}

public class Interface {
    public static void main(String[] args) {
        System.out.println("Hello interface");

        new Helper().help();    // anonymous object
    }
}
