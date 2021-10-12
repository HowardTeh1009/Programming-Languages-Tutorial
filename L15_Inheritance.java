// Learning 15_Inheritance
/*
    Inheritance is Java is the process where one class acquires the attributes
    and methods from one class to another.

    Inheritance concept can be classify in two categories :
        1) superclass (parent) - the class that being inherited from another classes
        2) subclass   (child)  - the class the inherits attributes and methods from another classes

    Way to perform inheritance to inherit a class :
        - use the "extends" keyword.

    Why and When is suitable to use inheritance?
        - It is useful for code reusability
            => reuse attributes and methods of an existing class when you create a new class.
*/

public class L15_Inheritance {
    public static void main (String[] args){
        // create an object for Bicycle class
        Bicycle bicycle1 = new Bicycle();

        // display the value of bicycle1
        System.out.println("This bicycle has " + bicycle1.wheels + " wheels."); // Output : This bicycle has 2 wheels.

        // use the object to call the methods that inherited from parent class
        bicycle1.accelerate(); // Output : The vehicle is moving.
        bicycle1.stop(); // Output : The vehicle is stopped.
    }
}

// create a parent class called Vehicle
class Vehicle{
    // declare the class attributes
    double speed;
    int wheels;
    int doors;

    // define class methods
    public void accelerate(){
        System.out.println("The vehicle is moving.");
    }

    public void stop(){
        System.out.println("The vehicle is stopped.");
    }
}

// create a child class that inherit everything in the Vehicle class
class Bicycle extends Vehicle{
    // create a class constructor for Bicycle
    Bicycle(){
        this.doors = 0; // access to the doors attribute from Vehicle class
        this.wheels = 2; // access to the wheels attribute from Vehicle class
    }
}

