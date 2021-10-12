// Learning 12 : OOP Concepts
/*
    OOP stands for Object-Oriented Programming in Java.
    OOP is about creating objects that contain data and methods.

    Why we should use OOP over Procedural Programming (PP)?
      - it is easier to execute and faster
      - give a clear structure for the programs and easy to read and understand
      - make the code DRY (Don't Repeat Yourself), therefore, the codes are easy to maintain and modify
      - allows us to create usable applications with less code and shorter development time

    Tips of OOP : DRY (Don't Repeat Yourself)
    We should not repeat the codes that use to perform the same thing. We should place repetition codes
    under a same place and reuse them instead of repeating it.

    In OOP, there are two aspects that are very important which is Classes and Objects.
    For example :
    Class - Fruit Objects : apple, banana, mango
    Class - Car   Objects : Volvo, Mercedes, BMW

    Every classes will have their own attributes which is known as the term "variable"
    and their methods which is the function of the class.
*/

public class L12_OOPConcepts { // let's take this as the main class
    public static void main (String[] args){
        // create object of Car here
        Car car1 = new Car(); // declare by using class name followed by obj name and "new" keyword

        // access the object attributes by using dot (.) sign
        System.out.println(car1.brand + " " + car1.model); // Output : BMW M3
        // access the method from the class
        car1.displayColor(); // Output : The color of the car is Yellow
    }
}

// create a second class here
class Car{
    // declare the attributes of Car class
    String color = "Yellow";
    String brand = "BMW";
    String model = "M3";
    int mfgYear = 2013;

    /*
         declare the methods here
         there are two types of methods which are public and static
         static can be called without creating objects as usual and public methods can only
         be called when there is an object
    */
    public void displayColor(){
        System.out.println("The color of the car is " + color);
    }
}
