using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace L2_Variables
{
    class Program
    {
        /* L2_Variables : 
         * Variables are used to hold the values of the data during the program execution.
         * We can define and initialise the variables at the same or or define first but initialise later.
         * There are some variables with different data types. (Refer to the next tutorial)
         * Variables allow us to modify the program easily (dynamically) than hard code.
         * 
         * To display the variable, we can either pass in the variable directly into the WriteLine() method. eg. WriteLine(var)
         * or use concatenation symbol which is a plus symbol (+)
         * 
         * You can get to know about constant variable in C# too.
         * Add const keyword in front of your variable and the value is not allowed to change after the initialisation because
         * the constant variable means unchangeable variable.
         */

        static void Main(string[] args)
        {
            // initial text without implementing the variables
            Console.WriteLine("My name is John Doe.");
            Console.WriteLine("I am 19 years old in 2021.");
            Console.WriteLine("The most favourite subject that I like is programming languages.");
            Console.WriteLine("I am learning C# at this moment.");

            // create and initialise the variables 
            string name = "John Doe";
            int age = 19;
            string subject = "programming languages";
            string language = "C#";
            double weight; // uninitialise variable

            // display the initial text above by adding the variables into the WriteLine() method
            Console.WriteLine();
            Console.WriteLine("My name is " + name + ".");
            Console.WriteLine("I am " + age + " years old in 2021.");
            Console.WriteLine("The most favourite subject that I like is" + subject + ".");
            Console.WriteLine("I am learning " + language + " at this moment.");
            // it will display the texts as same as the above sample

            // let's modify some value and display the new texts
            name = "Jackie Chan";

            Console.WriteLine();
            Console.WriteLine("My name is " + name + "."); // the name will be changed to Jackie Chan instead of John Doe
            Console.WriteLine("I am " + age + " years old in 2021.");
            Console.WriteLine("The most favourite subject that I like is" + subject + ".");
            Console.WriteLine("I am learning " + language + " at this moment.");
            

            // let's initialise the value to the weight variable that not yet hold any value
            weight = 57.5;

            Console.WriteLine("My current weight is " + weight + "kg."); // it will pass in the 57.5 because weight variable has been initialised with the value

            Console.ReadLine(); 
        }

        /* Summary: Rules of defining a variable
         * - the variable name should only contain letters, digits and underscore (_)
         * - the variable name must start with a lowercase letter and cannot have spaces
         * - the variable are case sensitive
         * - reserved keywords are not allowed to be the variable name
         */
    }
}
