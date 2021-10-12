// Learning 18 : Interfaces in Java
/*
    Interfaces is another way of process to achieve abstraction in Java.
    It is a completely "abstract class" that is used to group related methods with empty bodies.

    // How to access the interface methods?
    We need to use the keyword "implements".

    Notes on Interfaces:
       - Like abstract classes, interfaces cannot be used to create objects
       - Interface methods do not have a body - the body is provided by the "implement" class
       - On implementation of an interface, you must override all of its methods
       - Interface methods are by default abstract and public
       - Interface attributes are by default public, static and final
       - An interface cannot contain a constructor (as it cannot be used to create objects)

    Why And When To Use Interfaces?
        1) To achieve security - hide certain details and only show the important details of an object.

        2) We cannot inherit multiple parents class by using inheritance but we can use interfaces to do that.
*/

public class L18_Interfaces {
    public static void main(String[] args) {
        Pig1 myPig = new Pig1();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}

// Interface
interface Animal1 {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig1 implements Animal1 {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

