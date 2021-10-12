using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace L8_DecisionMaking
{
    /* L8_Decision Making:
     * In a programming language, we usually need to perform different actions based on the different decisions made by the users.
     * For example, there is a scenario that requires the users to choose if they want to select to perform 'A' or 'B' operations.
     * after the users have chosen the operation that they wished to perform, then the system will perform the operation based on the
     * decision that the users have made.
     * 
     * In C#, it has some following condition statements that can be used by the programmer. For eg.
     * 1) If statement      - Only carry out the operation if the specified condition is true.
     * 2) Else statement    - If the specified condition is not true, the program will carry out the other operations.
     * 3) Else if statement - If the first condition is false, the program will look to the new condition in else if statement and lastly the else statement.
     * 4) Switch statement  - To declare different alternative blocks of operation if the decision match the case in the switch statement.
     */
    class Program
    {
        static void Main(string[] args)
        {
            // If statement
            int num = 5;
            if (num == 5)
            {
                Console.WriteLine("The number is equal to 5.");
            }

            // Else statement
            num = 2; // change to initial num value from 5 to 2 to test the else statement
            if (num == 5)
            {
                Console.WriteLine("The number is equal to 5.");
            }
            else
            {
                Console.WriteLine("The number is not equal to 5."); // this statement will be executed
            }

            // Else if statement
            num = 26; // change to num value from 2 to 26 to test the else statement
            if (num > 5 && num < 10)
            {
                Console.WriteLine("The number is greater than 5 but smaller than 10.");
            } 
            else if (num > 10)
            {
                Console.WriteLine("The number is greater than 10."); // this statement will be executed
            }
            else
            {
                Console.WriteLine("The number is not greater than 5 and 10."); 
            }

            // switch case statement to check which day is it
            String day = "mon"; // feel free to change the value here for your own testing

            switch (day) // the switch case will check if the day match with any cases in the switch statements or not. If yes, the matched case will be executed
            {
                case "mon":
                    Console.WriteLine("Today is Monday."); // this case statement will be executed as the day is matched with this case
                    break;

                case "tue":
                    Console.WriteLine("Today is Tuesday.");
                    break;

                case "wed":
                    Console.WriteLine("Today is Wednesday.");
                    break;

                case "thu":
                    Console.WriteLine("Today is Thursday.");
                    break;

                case "fri":
                    Console.WriteLine("Today is Friday.");
                    break;

                case "sat":
                    Console.WriteLine("Today is Saturday.");
                    break;

                case "sun":
                    Console.WriteLine("Today is Sunday.");
                    break;
                default:
                    Console.WriteLine("Cannot determine the exact day. System Error!");
                    break;
            }

            Console.ReadLine();
        }
    }
}
