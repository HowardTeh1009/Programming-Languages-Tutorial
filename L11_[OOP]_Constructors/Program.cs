using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace L11__OOP__Constructors
{
    class Program
    {
        /*
         * L11_Constructors:
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
        static void Main(string[] args)
        {
            // create a class object by using the constructor
            Car car = new Car("PMP1234", "Red", "Mustang", 2008); // using constructor can save a lot of time in creating an object compared to the method that we using in the last lecture

            Console.WriteLine("The color of the car is " + car.color);
            Console.WriteLine("The plate number of the car is " + car.plateNo);
            Console.WriteLine("The brand of the car is " + car.brand);
            Console.WriteLine("The car is manufactured on " + car.mfcYear);

            Console.ReadLine();
        }
    }

    class Car // create a new class called Car
    {
        // class attributes
        public string plateNo, color, brand;
        public int mfcYear;

        // create the class constructor method
        public Car(string plateNo, string color, string brand, int year) // the constructor must be public and have the same name as the class name
        {
            this.plateNo = plateNo; // this keyword is use to emphasize the current class attributes is equal to the parameter value if both class attribute and constructor parameter are having the same name
            this.color = color;
            this.brand = brand;
            mfcYear = year; // here we do not use this keyword because I want to show the difference of not using the this keyword while we have the difference attribute name
        }

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
