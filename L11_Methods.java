// Learning 11 : Methods
/*
    Notes : Methods is known as function in C programming. We usually use methods to perform certain action
            once the method is being called.
            Tips : Write the function that perform only one action!
    Benefits of using methods in Java :
    - you only have to define/code once and use it as many times as you want
    - save time as we do not need to write different block of codes that perform the same action
    - reduce the error while writing the codes
*/

public class L11_Methods {
    public static void main(String[] args){
        printStatement(); // call the printStatement method at here
        System.out.println(areaCalculator(25,30)); // we passed the length 25 and width 30 into this method
        // Output : 750 because area = length * width at the end of the method

        studentInformation("John Doe", 2020); // call the studentInformation()
                                                            // pass the John Doe into studName and 2020 into year
        // Output : Student Info : John Doe2020

        /*
        In Java methods, got a thing called Recursion.
        Recursion is a technique of declaring a function and let the function call by itself
        Refer to the above method declaration
        */
        printHi(10);
        // Recursion is not encouraged because it may cause the memory overflow and it is not efficient to perform the same cases again and again

        // call the overloaded methods here
        System.out.println(plusMethod(14,15));
        System.out.println(plusMethod(1.5, 1.5));
    }

    // declare the method outside of main method
    static void printStatement(){
        System.out.println("Welcome to Methods lesson. This function is used to print statement.");
    }

    // declare a area calculator method with the parameter
    static int areaCalculator(int length, int width){ // the parameter inside this method are length & width
        int area;
        return area = length * width; // we gonna return the area at the end of the method
    }

    // declare a method that display the student name with parameter
    static void studentInformation(String studName, int year){ // the studName and year are the parameter for this method
        System.out.println("Student Info : " + studName + year); // we use this method to display the student info
    }

    // Recursion methods
    static int printHi(int counter) {
        System.out.println("Hi");
        // the recursion will break once the counter reach 0
        if ((counter-1) > 0) { // every loop start from 0. 0 index will be the 1st loop
            // I only want exact 10 times of recursion, therefore i minus the condition beforehand
            // else it will loop from 0 1 2 3 4 5 6 7 8 9 10 which is 11 times
            printHi(counter-1); // recursion occurs here if the counter in greater than 0
        } else{
            return 0;
        }
        return 0;
    }

    // Method Overloading : Multiple methods that have the same name but different type of parameters
    // We do not need to declare 2 methods that should do the same thing, we just just overload them.
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }
}
