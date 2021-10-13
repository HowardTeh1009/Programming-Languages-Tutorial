using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace L14__OOP__Polymorphism
{
    class Program
    {
        /*  L14_Polymorphism
            Polymorphism is referring to a single action that we can perform it in different ways.
            We usually use polymorphism concept to perform different kinds of task by using the same method.
        */
        static void Main(string[] args)
        {
            // create a object from the derived class
            Receptionist r1 = new Receptionist("John Doe", 28, 3500);

            r1.calcSalary(); // This will display the calcSalary method in the base class because the r1 is the object of Receptionist class and the Receptionist class has inherited the Employee class
            
            Console.ReadLine();
        }
    }

    // create a new class called Shape
    class Employee
    {
        // create the Eployee class attributes
        public string name;
        public int age;
        public double salary;

        // class methods
        public virtual void calcSalary() // add the virtual keywords to allow the derived classes to override the method
        {
            Console.WriteLine("The monthly salary of the Employee " + name + " is RM" + salary);
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

        // polymorphism occurs here
        // overload the calcSalary() method from the base class as polymorphism means perform different operations using the same method
        public override void calcSalary() // add the override keyword into the method to override the method from the base class
        {
            salary = salary + (salary * bonus);
            Console.WriteLine("The monthly salary of the Employee " + name + " is RM" + salary);
        }
    }
}
