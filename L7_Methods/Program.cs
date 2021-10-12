using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace L7_Methods
{
    /* L7_Methods:
     * A method is used to run repetitive codes in a complex program.
     * We can write a block of codes by writing the statements or pass in the parameter that we want to execute into the method.
     * The benefits of using a method in a program is to rNepeat the execution of codes without writing them over and over again. We just have to 
     * define once and use it for many times.
     * 
     * We also can overload the method with the same name by passing different types of parameters to perform different functions.
     * This is called method overloading.
     */
    class Program
    {
        static void Main(string[] args)
        {
            WelcomeUser();       // Output: Welcome to Lecture 7: Methods.
            WelcomeUser("Alex"); // Output: Hi Alex, welcome to Lecture 7: Methods. (the string value Alex has been passed into this method)
            WelcomeUser("John", "Methods"); // Output: Hi John, welcome to Lecture 7: Methods. (the string value John and Methods has been passed into this method)
            Console.ReadLine();
        }

        // create a normal void method that displays welcoming message to the user
        static void WelcomeUser()
        {
            Console.WriteLine("Welcome to Lecture 7: Methods.");
        }

        // overload the WelcomeUser method by passing in the parameter into the method
        static void WelcomeUser(String name) // String name is the parameter that passed into this method
        {
            Console.WriteLine($"Hi {name}, welcome to Lecture 7: Methods."); // pass the name parameter into this statement to display the user name
        }

        // overload the WelcomeUser method again by passing in the name and lecture title
        static void WelcomeUser(String name, String title) // String name is the parameter that passed into this method
        {
            Console.WriteLine($"Hi {name}, welcome to Lecture 7: {title}."); // pass the name and title parameters into this statement to display the user name and lecture title
        }
    }
}
