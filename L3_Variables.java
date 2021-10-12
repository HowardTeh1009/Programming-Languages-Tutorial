// Learning 3 : Variables in Java
/*
    Notes :
    1) Variables are referring to the containers for storing the values of data inside the program.
    2) We can declare a variable by using any names that we prefer
    3) All the naming in variables must following the Camelcase Naming Convention.
        Rules of Camelcase Naming Convention :
            - Names can contain letters, digits, underscores, and dollar signs
            - Names must begin with a letter
            - Names should start with a lowercase letter and it cannot contain whitespace
            - Names can also begin with $ and _ (but we will not use it in this tutorial)
            - Names are case sensitive ("myVar" and "myvar" are different variables)
            - Reserved words (like Java keywords, such as int or boolean) cannot be used as names
*/

public class L3_Variables {
    public static void main(String[] args){
        // How to declare a variable? (type variableNames = value;)
        String studentName = "John"; /* We have created a variable called studentName of type String
                                        and assigned it with the value "John" */
        //try to display the studentName variable
        System.out.println(studentName);

        // We also can declare the variable and assign the value later
        int age; // A variable called age of type integer
        age = 25; // assign the value of 25 into the number

        // display the number variable
        //System.out.println(age);

        // Changing the age number of the student
        age = 16;

        // Display the latest age
        System.out.println(age);

        // Another display multiple variables at the same time
        System.out.println(studentName + age);
    }
}

