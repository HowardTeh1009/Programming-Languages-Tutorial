using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace L6_Arrays
{
    /* L6_Arrays:
     * Array can be used to store multiple values inside a one variable. This is very helpful for us to store up to tens, hundreds or thoudsands of values 
     * in a complex application.
     * 
     * Ways to create an array:
     * 1) string[] cars = new string[4]; - we can make the declaration and do the initialisation later
     * 2) string[] cars = new string[4] {"Volvo", "BMW", "Ford", "Mazda"}; - we can make the declaration and the initialisation at the same time
     * 3) string[] cars = new string[] {"Volvo", "BMW", "Ford", "Mazda"}; - this method looks like method 1 and 2 but this method do not specifying the array size
     * 4) string[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; - omitting the new keyword, and without specifying the size
     * 
     * If you use the method 4 to create an array, you must initialsie the values at the same time. Or else, you must use the method 1 - 3 that have the new keywords.
     */
    class Program
    {
        static void Main(string[] args)
        {
            int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // declare the array using the last option from the notes
            // index position 0  1  2  3  4  5  6  7  8  9 

            // display all the values in the numbers array using loop
            // for loop method
            for (int i = 0; i < numbers.Length; i++)
            {
                Console.WriteLine(numbers[i]); 
            }

            // foreach loop method
            foreach(int i in numbers)
            {
                Console.WriteLine(i);
            }

            // access the specific value of the array using the index position
            Console.WriteLine(numbers[5]); // Output: 6

            // modify the initial value of the array to a new value
            numbers[3] = 25; // the value in index position 3 is changed from 4 to 25
            Console.WriteLine(numbers[3]); // Output: 25

            // check the length of the array using length method
            Console.WriteLine(numbers.Length); // Output: 9

            Console.ReadLine();
        }
    }
}
