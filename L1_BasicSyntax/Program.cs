using System; // is like the program package such as include <stdio> in C Programming
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace L1_BasicSyntax // is the namespace that used to show the project title
{
    class Program // is a container for the data and methods - write all the codes inside this block
    {
        static void Main(string[] args) // this is the main method - only codes inside the main method will be executed
        {
            Console.WriteLine("Welcome to C# tutorial class."); // to display the output on the window console
            Console.ReadLine(); // to let user press [ENTER] to end the program / press CTRL + F5 to see the output

            /* notes: using c# in .NET framework will not show the output directly through inital debugging.
             *        Either put Console.ReadLine() at the end of the program or use CTRL + F% to debug
             */       
        }
    }
}
