// Learning 6 : Operators in Java
/*
    Operators are used to perform some operations on variables and values in Java.
    Operators in Java :
        1) Arithmetic Operators - perform common mathematical operations
        2) Assignment Operators - used to assign values to variables
        3) Comparison Operators - used to compare between variables
        4) Logical Operators    - used to determine the logic between variables
*/

public class L6_Operators {
    public static void main (String[] args){
        // Arithmetic Operators
        int x = 5;
        int y = 8;

        System.out.println(x+y); // Addition Output : 13
        System.out.println(x-y); // Subtraction Output : -3
        System.out.println(x*y); // Multiplication Output : 40
        System.out.println(x/y); // Division Output : 0
        System.out.println(x%y); // Modulus Output : 5
        System.out.println(x++); // Increment
        System.out.println(y--); // Decrement

        // Assignment Operators
        int num1 = 10; // assign 10 into num1
        num1 += 5; // num1 = num1 + 5 Output : 15
        System.out.println(num1);
        num1 *= 5; // num1 = num1 * 5 Output : 50
        System.out.println(num1);
        num1 /= 2; // num1 = num1 / 2 Output : 2
        System.out.println(num1);

        // Comparison Operators
        int x1 = 5;
        int x2 = 15;

        System.out.println(x1 == x2); // returns false because x1(5) is not equal to x2(15)
        System.out.println(x1 != x2); // returns true because x1(5) is not equal to x2(15)
        // There are a lot more examples of comparison operators, please try out yourself!

        // Logical Operators
        int y1 = 5;
        int y2 = 13;

        System.out.println(y1 == y2); // returns false because y1(5) is not equal to y2(13)
        System.out.println(y1 != y2); // returns true because y1(5) is not equal to y2(13)
        // There are a lot more examples of logical operators, please try out yourself!
    }
}

