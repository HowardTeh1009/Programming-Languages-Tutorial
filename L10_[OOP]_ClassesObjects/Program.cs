using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace L10__OOP__ClassesObjects
{
    class Program
    {
        /*  L10_OOP Concepts - Classes & Obejcts:
            OOP stands for Object-Oriented Programming in C#.
            OOP is about creating objects that contain class attributes and class methods.

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
        static void Main(string[] args)
        {
            // create a class object for the Car class
            Car car = new Car();

            // set the values to the object attributes
            car.plateNo = "PMP1234";
            car.color = "Red";
            car.brand = "Mustang";
            car.mfcYear = 2018;

            // display the attributes of the Car class and call the methods from the Car class
            Console.WriteLine("The color of the car is " + car.plateNo);
            car.accerelate(50);
            
            Console.ReadLine();
        }
    }

    class Car // create a new class called Car
    {
        // class attributes
        public string plateNo, color, brand;
        public int mfcYear;

        // class methods
        public void accerelate(int speed)
        {
            Console.WriteLine($"The car is accerelate at the speed of {speed} km/h.");
        }

        public void deccerelate(int speed)
        {
            Console.WriteLine($"The car is deccerelate and the speed now is {speed} km/h.");
        }
    }
}
