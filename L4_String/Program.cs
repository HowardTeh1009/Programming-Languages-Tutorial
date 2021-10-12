using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace L4_String
{
    /*L4_String: 
     * - There are a few of string methods built in in the C# for us to perform certain operations on the strings.
     * - The common string methods are:
     * i)   length           - to check the number of characters in a string
     * ii)  ToUppper/ToLower - to convert the string to uppercase or lowercase
     * iii) access           - access the character in a string by referring to its index position using square brackets [].
     * iv)  Substring        - to extract certain parts of characters from a string by referring the starting position and the length of return value.
     * v)   IndexOf          - to find the index position of the specific character in a string.
     * vi)  Contains         - to check if the string contains the specific words or not. Return true or false
     * 
     *For more references: https://www.softwaretestinghelp.com/c-sharp/csharp-strings/#C_String_Methods
     */

    class Program
    {
        static void Main(string[] args)
        {
            string text = "Programming Language"; // declare a text on top of the program

            // check the length of the text string
            Console.WriteLine(text.Length); // return 20

            // convert the text to UPPERCASE and lowercase form
            Console.WriteLine(text.ToUpper()); // return "PROGRAMMING LANGUAGE"
            Console.WriteLine(text.ToLower()); // return "programming language"

            // access the specific character using the square brackets
            Console.WriteLine(text[5]); // return 'a'

            // extract certain parts of the text string
            Console.WriteLine(text.Substring(3,8)); // return "gramming"

            // get the index position of the specific character in the text string
            Console.WriteLine(text.IndexOf('a')); // return 5

            // check if the text string contains "programming" and "C#"
            Console.WriteLine(text.Contains("Programming")); // return true
            Console.WriteLine(text.Contains("C#")); // return false

            Console.ReadLine();
        }
    }
}
