// Learning 20 : Exceptions in Java
/*
    When executing Java code, different errors can occur: coding errors made by the programmer,
    errors due to wrong input, or other unforeseeable things.

    When an error occurs, Java will normally stop and generate an error message.
    The technical term for this is: Java will throw an exception (throw an error).

    Why we use exception handling in Java?
        - Exception handling ensures that the flow of the program doesn't break when an exception occurs.

    There is 3 blocks in exception handling :
        - try     : allows you to define a block of code to be tested for errors while it is being executed.
        - catch   : allows you to define a block of code to be executed, if an error occurs in the try block.
        - finally : allows you execute code, after try...catch, regardless of the result.
        - throw   : allows you to create custom exception to handling the errors
 */

public class L20_Exceptions {
    public static void main (String[] args){
        // lets use exception handling to deal with the program exceptions
        try{ // Block of code to try
            int[] numbers1 = {1, 2, 3, 4, 5};
            System.out.println(numbers1[8]);
        } catch (ArrayIndexOutOfBoundsException e){ //  Block of code to handle error exception
            System.out.println("The array index is out of bounds");
        } finally{
            System.out.println("The exception handling is finished");
        }

        /*Output :
            The array index is out of bounds
            The exception handling is finished
        */

        // call the ageValidation method at here
        //ageValidation(15); // will generate error (remove the comment to try it out)
        ageValidation(25); // Output : Access granted - You are old enough!
    }

    // let's try with throw statement using method
    static void ageValidation(int age){
        if(age < 18){
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else{
            System.out.println("Access granted - You are old enough!");
        }
    }
}
