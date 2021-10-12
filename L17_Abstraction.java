// Learning 17 : Abstraction in Java
/*
    Java Abstraction : a process of hiding certain details and showing essential information to the user

    How can to perform abstraction in Java?
    - Abstraction can be achieved by using abstract class or interfaces. (We will be focusing in abstract class in this tutorial)
    - We need to use "abstract" keyword
        => "abstract" keyword is a non-access modifier and it is used for classes and methods in Java
        => abstract class : is a class that is restricted and cannot be used to create objects (in order to access the abstract class, we must inherit it with another class)
        => abstract method : can only be used in the abstract class and does not have a body.
                             we only can configure/ define the body by using the child class(subclass).
*/

public class L17_Abstraction {
    public static void main(String[] args){
        // create objects for Dog and Cat classes
        Dog dog1 = new Dog("Dog");
        Cat cat1 = new Cat("Cat");

        // let's call the methods from Dog and Cat objects
        dog1.animalEat();   // Output : Dog is eating.....
        dog1.animalSound(); // Output : Dog sounds Ooofff Ooofff
    }
}

// create an abstract class
abstract class Animal{
    // declare class attributes
    String animalType;

    // create an abstract method without body
    public abstract void animalSound(); // we do not define any codes in this body because we do not include curly braces

    // create a normal method
    public void animalEat() {
        System.out.println(animalType + " is eating.....");
    }
}

// create subclasses to inherit the abstract Animal class
class Dog extends Animal{
    // create a class constructor for Dog class
    public Dog(String type){
        this.animalType = type;
    }

    public void animalSound(){ // we can configure the body of the abstract methods in subclass
        System.out.println(animalType + " sounds Ooofff Ooofff");
    }
}

class Cat extends Animal{
    // create a class constructor for Dog class
    public Cat(String type){
        this.animalType = type;
    }

    public void animalSound(){ // we can configure the body of the abstract methods in subclass
        System.out.println(animalType + " sounds Meow Meow");
    }
}


