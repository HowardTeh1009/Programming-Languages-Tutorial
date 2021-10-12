// Learning 14 : Encapsulation in Java
/*
    Encapsulation in Java means that the attributes of a class will be hidden or private.
    The private attributes can only be accessed only through methods (getters & setters).
    You should make the attributes private if you want to keep those attributes confidential.

    Why we should use encapsulation?
        - Better control of class attributes and methods
        - Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
        - Flexible: the programmer can change one part of the code without affecting other parts
        - Increased security of data
*/

public class L14_Encapsulation { // lets take this as a main class
    public static void main (String[] args){
        // create a object of StudentInformation
        StudentInformation stud1 = new StudentInformation("John Doe", "2001245", "john123");

        // display the value of attributes in object stud1 using get method
        System.out.println(stud1.getStudentId()); //Output : 2001245
        System.out.println(stud1.getStudentPass()); //Output : john123

        // modify the value of existing studentPass to "john321"
        stud1.setStudentPass("John321");
        System.out.println(stud1.getStudentPass()); //Output : John321
    }
}

// create another class named StudentInformation
class StudentInformation {
    // declare private attributes with private keyword
    String name; // this is public as student name can be open for public
    private final String studentId; // student Id can be constant
    private String studentPass;

    // declare a constructor to set the value of the attributes
    public StudentInformation(String name, String studentId, String studentPass) {
        // this keyword are telling the Java to refer to the current object
        this.name = name;
        this.studentId = studentId;
        this.setStudentPass(studentPass); // this is the set method in the constructor to set the value of private attributes

    }

    /*
     if we want to access the private variables, we need to have set and get methods
     get method is used to return the private attributes
     set method is used to set the value of private attributes
    */

    // declare a get method so that we can display the value by calling them in main method
    public String getStudentId() {
        return studentId;
    }

    public String getStudentPass() {
        return studentPass;
    }

    /*
     declare a set method if you want to set the value of private attributes
     let's say if we want to change the value of studentPass
    */
    public void setStudentPass(String studentPass){
        this.studentPass = studentPass;
    }
}
