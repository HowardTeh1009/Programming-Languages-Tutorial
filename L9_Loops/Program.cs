using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace L9_Loops
{
    class Program
    {
        /* L9_Loops:
         * We always use loop to perform the repetitive tasks. Loops are handy because they are able to
            save our time, reduce errors and allow our code to be more readable.
            Types of loops in Java :
            1) while loop         - the loop will start if the specified condition is true.
            2) do .... while loop - the loop will be executed once before checking the condition. The loop will be repeated after
                                    the condition checking is true.
            3) for loop           - we can use for loop to replace the while loop if we already know the exact how many times we want to loop
                                    the program.
         */
        static void Main(string[] args)
        {
            // while loop example
            int i = 0; // declare a variable i with 0 value
            while (i < 5)
            { // declare the while with the condition of i < 5
                Console.WriteLine(i); // if the condition is true, the system will print i value on the console
                i++; // i will increment by i at the end of the loop
            }
            // so this program will be loop for 5 times because the loop will stop when i reach number of 5.
            // Outputs : 0 1 2 3 4

            // do....while loop example
            int x = 0; // declare a variable x with 0 value
            do
            {
                Console.WriteLine(x); // the code will be execute first before checking the condition
                x++; // x will increment by x at the end of the loop
            } while (x < 5); // the condition is x < 5, if the condition is true, the loop will occurs
                             // Outputs : 0 1 2 3 4

            // for loop example
            int z = 0; // declare a variable z with 0 value
            for (z = 0; z < 5; z++)
            { // the loop will occurs if the z value is smaller than 5
                Console.WriteLine(z);
            }
            // Outputs : 0 1 2 3 4

            /* There is always few ways to exit the loop or continue the loop in Java
               We can use break statement or continue statement to do that.
             */

            // break statement example
            for (int index = 0; index < 10; index++)
            { // this for loop will keep print out index value once the index value is smaller than 10
                if (index == 4)
                { // if the index reaches the number of 4
                    break; // the loop will be break here
                }
                Console.WriteLine(index); // Output : 0 1 2 3
            }

            // continue statement example
            // continue statement will break one iteration in the loop 1st, if the specified condition is true, the loop will be continue again
            for (int count = 0; count < 10; count++)
            {
                if (count == 4)
                { // the loop break when reach number of 4
                    continue; // but then continue the loop
                }
                Console.WriteLine(count); // Output : 0 1 2 3 5 6 7 8 9
            }

            Console.ReadLine();
        }
    }
}
