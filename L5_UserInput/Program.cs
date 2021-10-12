using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace L5_UserInput
{
    /* L5_UserInput:
     * In C#, we can write some program to accept inputs from the user and prompt the output on the console.
     * The reason of getting input from user is to make the dynamic updates towards to existing data or to create a new data.
     * To perform the user input function in C#, we need to use Console.ReadLine() to accept the user input.
     * 
     * However, different inputs that are having a different data types, we need to convert the Console.ReadLine().
     * For example:
     * i)   String input    : can directly use Console.ReadLine()
     * ii)  Integer input   : Convert.ToInt32(Console.ReadLine())
     * iii) Decimal input   : Convert.ToDouble(Console.ReadLine()) / Convert.ToDecimal(Console.ReadLine()) / Convert.ToSingle(Console.ReadLine())
     * iv)  Character input : Convert.ToChar(Console.ReadLine())
     */
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Welcome to Student Registration System");
            Console.Write("Enter your name: ");
            String name = Console.ReadLine(); // store the name input as a string type

            Console.Write("Enter your age: ");
            int age = Convert.ToInt32(Console.ReadLine()); // convert the ReadLine() to integer type to accept integer input

            Console.WriteLine("The student name is " + name);
            Console.WriteLine("The student age is  " + age);

            Console.ReadLine();
        }
    }
}
