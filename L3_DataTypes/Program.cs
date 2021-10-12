using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace L3_DataTypes
{
    /* L3_DataTypes:
     * Every variable consist of a specific data type to determine the size and the type of the data values.
     * Data types are very useful to save the time and memory by indicating the correct data type for the corresponding value.
     * 
     * There are a few types of data type available in C#:
     * 1) integer - int (can be only used to store the whole number value inside a variable)
     * 2) decimal - float / double (can be only used to store the decimal number value inside a variable)
     * 3) character - char (can be only used to store a single character value inside a variable)
     * 4) long text - string (can be only used to store text value inside a variable)
     * 5) true false - bool (can be only used to store true or false value inside a variable)
     * 
     * If you declare the data type and initialise the wrong format of data value, an error will occurs in the whole program.
     */

    class Program
    {
        static void Main(string[] args)
        {
            string text = "This is a long text"; // string data type variable - surrounded with double quotes ""
            char letter = 'A'; // char data type variable - surrounded with single quote ''
            int number = 15; // int data type variable - 15 is a whole number
            float weight = 55; // float data type variable - 55 is a decimal values
            double weight1 = 55; // double data type variable - 55.67 is a more precise decimal values 
            bool haveLunch = true; // bool data type variable - true indicate that the person already have lunch
        }

        /*Add ons:
         * When to use float or double in C#?
         * If you want to store a more precise decimal value with specific decimal places, you must use double instead of float.
         * C# is not allows float store the orecise decimal value as how other programming languages do.
         * 
         * eg. 55.67 !float but 55 float
         *     55 or 55.67 can both be double 
         */
    }
}
