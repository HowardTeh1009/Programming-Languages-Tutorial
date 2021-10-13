using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace L15__OOP__Abstraction
{
    class Program
    {
        /*  L15_Abstraction:
            Abstraction : a process of hiding certain details and showing essential information to the user.

            How to perform abstraction in C#?
            - Abstraction can be achieved by using abstract class or interfaces. (We will be focusing in abstract class in this tutorial)
            - We need to use "abstract" keyword
                => "abstract" keyword is a non-access modifier and it is used for classes and methods in C#
                => abstract class  : is a class that is restricted and cannot be used to create objects (in order to access the abstract class, we must inherit it with derived class)
                => abstract method : can only be used in the abstract class and does not have a body or definition.
                                     we only can configure/ define the body by using the derived class (subclass).
        */
        static void Main(string[] args)
        {
            // create objects for Dog and Cat classes
            Dog dog1 = new Dog("Dog");
            Cat cat1 = new Cat("Cat");

            // let's call the abtract methods from Dog and Cat objects
            dog1.animalEat();   // Output : Dog is eating.....
            dog1.animalSound(); // Output : Dog sounds Ooofff Ooofff

            cat1.animalEat();   // Output : Cat is eating.....
            cat1.animalSound(); // Output : Cat sounds Meow Meow

            Console.ReadLine();
        }
    }

    // create an abstract class
    abstract class Animal
    {
        // declare class attributes
        public string animalType;

        // create an abstract method without body
        public abstract void animalSound(); // we do not define any codes in this body because we do not include curly braces
        public abstract void animalEat();
    }

    // create subclasses to inherit the abstract Animal class
    class Dog : Animal
    {
        // create a class constructor for Dog class
        public Dog(string type)
        {
            this.animalType = type;
        }

        public override void animalSound() // add in the override method to configure the abstract method
        { // we can configure the body of the abstract methods in subclass
                Console.WriteLine(animalType + " sounds Ooofff Ooofff");
        }

        public override void animalEat()
        {
            Console.WriteLine(animalType + " is eating.....");
        }
    }

    class Cat : Animal
    {
        // create a class constructor for Dog class
        public Cat(string type)
    {
        this.animalType = type;
    }

        public override void animalSound()
        { // we can configure the body of the abstract methods in subclass
                    Console.WriteLine(animalType + " sounds Meow Meow");
        }

        public override void animalEat()
        {
            Console.WriteLine(animalType + " is eating.....");
        }
    }

}
