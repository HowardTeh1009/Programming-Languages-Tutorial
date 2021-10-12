// Learning 13 : Constructor in OOP
/*
    Constructor is s special method that is called when there is an object created.
    It is used to initialise the value of the object variable which is also known
    as the attribute of the class.

    We may create the constructor by ourself or else Java will create the constructor
    automatically. By default, the constructor that created automatically is not able to
    initialise the value of the object attributes.

    Why do we need constructor?
        - constructor is needed when there is multiple objects and we do not want
        the all objects to have the same values.
*/

public class L13_Constructor {
    public static void main (String[] args){
        // create the object of Human class
        Human human1 = new Human("John", 18, 64.5);
        System.out.println(human1.name); // display human1 name

        // create another object of Human class
        Human human2 = new Human("Danny", 21, 50.5);
        System.out.println(human2.name); // display human2 name

        // access the methods with two different objects
        human1.eat();
        human2.drink();
    }
}

// create another class named Human
class Human{
    // create the attributes for this class
    String name;
    int age;
    double weight;

    /*
     way to create the constructor (the constructor must be having the same name as the class)
     in this time we will create the constructor with parameters
    */
     Human(String humanName, int humanAge, double humanWeight){
        // set the value for the class attributes
        name = humanName;
        age = humanAge;
        weight = humanWeight;

        /*
          sometimes we need to include this keyword if your parameter in constructor
          is the same name as the class attributes
          for example, if your parameter is name, you should set the value is this way :
          this.name = name; (this.name is the attributes and name is the parameter)
        */
     }

    // create methods for Human class
    public void eat(){
         System.out.println(name + " is eating.");
    }

    public void drink(){
        System.out.println(name + " is drinking.");
    }
}
