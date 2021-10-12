// Learning 16 : Polymorphism
/*
    Polymorphism is referring to a single action that we can perform it in different ways.
    We usually use polymorphism concept to perform different kinds of task by using the same method.
*/

public class L16_Polymorphism {
    public static void main(String[] args){
        // create object for Shape, Circle and Rectangle
        Shape shape = new Shape();
        Shape circle = new Circle();
        Shape rec = new Rectangle();

        // let's us call the methods from each of the classes
        shape.drawing(); // Output : We are going to draw some shapes.
        circle.drawing(); // Output : We are drawing circle.
        rec.drawing(); // Output : We are drawing rectangle.

        // we are calling the same methods but all the methods that are called are perform the different actions
        // this is what polymorphism means in Java
    }
}

// create a parent class called School
class Shape{
    // define a class method for Shape
    public void drawing(){
        System.out.println("We are going to draw some shapes.");
    }
}

// create a few child classes to inherit parent class
class Circle extends Shape{
    // we can use the method in the Shape class to print different value of the string (polymorphism occurs here)
    public void drawing(){ // the method is the same as parent class but it perform different action
        System.out.println("We are drawing circle.");
    }
}

class Rectangle extends Shape{
    // we can use the method in the Shape class to print different value of the string (polymorphism occurs here)
    public void drawing(){ // the method is the same as parent class but it perform different action
        System.out.println("We are drawing rectangle.");
    }
}
