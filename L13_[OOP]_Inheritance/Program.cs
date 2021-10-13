using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace L13__OOP__Inheritance
{
    class Program
    {
        /*  L13_Inheritance:
            Inheritance is C# is the process where one class acquires the attributes
            and methods from one class to another.

            Inheritance concept can be classify in two categories :
                1) Base class (parent) - the class that being inherited from another classes
                2) Derived   (child)  - the class the inherits attributes and methods from another classes

            Way to perform inheritance to inherit a class in C#:
                - use the ':' symbol.

            Why and When is suitable to use inheritance?
                - It is useful for code reusability
                    => reuse attributes and methods of an existing class when you create a new class.
        */
        static void Main(string[] args)
        {
            // create a object from the derived class
            Receptionist r1 = new Receptionist("John Doe", 28, 3500);

            Console.WriteLine(r1.calcSalary()); // This will display the calcSalary method in the base class because the r1 is the object of Receptionist class and the Receptionist class has inherited the Employee class

            Console.ReadLine();
        }
    }

    // create a new class called Employee
    class Employee
    {
        // create the Animal class attributes
        public string name;
        public int age;
        public double salary;


        // class methods
        public string calcSalary()
        {
            return "The monthly salary of the Employee " + name + " is RM" + salary;
        }
    }

    // create another class called Receptionist to inherit the Employee class
    class Receptionist : Employee
    {
        // create a class attributes to store the bonus of the Receptionist staff
        public static double bonus = 0.3;

        // create a class constructors
        public Receptionist(string name, int age, double salary)
        {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }
    }
}
