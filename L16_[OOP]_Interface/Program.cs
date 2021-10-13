using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace L16__OOP__Interface
{
    class Program
    {
        /*
            Interfaces is another way of process to achieve abstraction in Java.
            It is a completely "abstract class" that is used to group related methods with empty bodies.

            // How to access the interface methods?
            We can implement the interface by using the ':' symbol same as the inheritance and it is good to put a capital I symbol in front of the naming of an Interface class.

            Notes on Interfaces:
               - Like abstract classes, interfaces cannot be used to create objects
               - Interface methods do not have a body - the body is provided by the "implement" class
               - On implementation of an interface, you must override all of its methods
               - Interface methods are by default abstract and public
               - An Interface can only contain properties (getter and setter) and methods only.
               - We do not need to use override keywords to override the methods in an Interface.

            Why And When To Use Interfaces?
                1) To achieve security - hide certain details and only show the important details of an object.
                2) We cannot inherit multiple parents class by using inheritance but we can use interfaces to do that.
        */
        static void Main(string[] args)
        {
            Pig1 myPig = new Pig1();  // Create a Pig object
            myPig.animalSound();
            myPig.sleep();

            Console.ReadLine();
        }
    }

    interface IAnimal
    {
        void animalSound(); // interface method (does not have a body)
        void sleep(); // interface method (does not have a body)
    }

    // Pig "implements" the Animal interface
    class Pig1 : IAnimal
    {
        public void animalSound()
        {
            // The body of animalSound() is provided here
            Console.WriteLine("The pig says: wee wee");
        }
        public void sleep()
        {
            // The body of sleep() is provided here
            Console.WriteLine("Zzz");
        }
    }
}
