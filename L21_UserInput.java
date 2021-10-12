// Learning 21 : User Input in Java
/*
    User Input allows programmers or users to enter their input into the program to perform certain actions.
    In order to perform user input function in Java, we need to import the Scanner class.

    To use the Scanner class, create an object of the class and use any of the available
    methods found in the Scanner class documentation.
 */

import java.util.Scanner; // import the Scanner class
public class L21_UserInput {
    public static void main(String[] args) {
        String username, password;

        Scanner myObj = new Scanner(System.in); // Create a Scanner object to accept the input from users
        System.out.println("Enter your username > "); // Create a question or field to ask for input
        username = myObj.nextLine(); // Read the input from the users (nextLine() is used to accept string,
                                     //                                you can check out other method to accept different data types)
        System.out.println("Enter your password > ");
        password = myObj.nextLine();

        if(username.equals("user") && password.equals("user123")){
            System.out.println("Access granted.");
        }else{
            System.out.println("Access denied.");
        }

        /* Output :
            Enter your username >
            user
            Enter your password >
            user123
            Access granted.
         */
    }
}
