// Learning 8 : Decision Making in Java
/*
    In our daily life, we need to deal with a lot of decision making. It is the same in programming too!
    Methods of Decision Making in Java :
        1) if statement      = tell the program to execute a block of code if a specific condition is true
        2) else statement    = tell the program to execute another block of code if the same condition is false
        3) else if statement = tell the program to execute the code with new condition is the 1st condition is false
        4) switch statement  = to specify different alternative blocks of code to be executed
*/

public class L8_DecisionMaking {
    public static void main(String[] args){
        int x = 20, y = 25;

        //if statement
        if(x == y){
            System.out.println("True"); // only will print True if the condition is true (none output because the condition is false)
        }

        //with else statement
        if(x == y){
            System.out.println("True");
        } else {
            System.out.println("False"); // will execute this code if the first condition is wrong
        }

        //else if statement
        if(x == y){
            System.out.println("True");
        } else if (x < y){
            System.out.println("X is smaller than Y"); // will execute this line because 2nd condition is true
        } else {
            System.out.println("False");
        }

        //switch statement
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday"); // Outputs "Thursday" (day 4)
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
