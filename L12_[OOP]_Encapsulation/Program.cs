using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace L12__OOP__Encapsulation
{
    class Program
    {
        /*  L12_Encapsulation:
            Encapsulation in Java means that the attributes of a class will be hidden or private.
            The private attributes can only be accessed only through properties (getters & setters).
            You should make the attributes private if you want to keep those attributes confidential.

            Why we should use encapsulation?
                - Better control of class attributes and methods
                - Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
                - Flexible: the programmer can change one part of the code without affecting other parts
                - Increased security of data
        */
        static void Main(string[] args)
        {
            // create the car object
            Car car = new Car("PMP1234", "Red", "Mustang", 2018);

            // modify or set the private attribute values using properties
            car.PlateNo = "PKM7369";

            // retrieve the value of the new private attribute values using properties
            Console.WriteLine($"The new plate number is {car.PlateNo}");

            Console.ReadLine();
        }
    }

    class Car // create a new class called Car
    {
        // create class attributes that are private using private keywords
        private string plateNo, color, brand;
        private int mfcYear;

        // class constructors
        public Car(string plateNo, string color, string brand, int mfcYear)
        {
            this.plateNo = plateNo;
            this.color = color;
            this.brand = brand;
            this.mfcYear = mfcYear;
        }

        // create class properties (getters and setters in C#)
        // 1st way
        public string PlateNo
        {
            get { return plateNo; }
            set { plateNo = value; }
        }

        // 2nd way - shorhand/shorcut => this way is easier and less code
        public string Color { get; set;}
        public string Brand { get; set; }
        public int MfcYear { get; set; }

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
