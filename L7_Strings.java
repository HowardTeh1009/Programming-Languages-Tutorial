// Learning 7 : Strings in Java
/*
    Strings are used to store a collection of characters.
    In Java, there are a few string function that can be used to perform certain actions.
*/

public class L7_Strings {
    public static void main (String[] args){
        // Declaring a String variable
        String schoolName = "Methodist High School";

        // most common string function that will be used in Java
        System.out.println("The length of the school name is " + schoolName.length()); // calculate the length of a string
        System.out.println("The school name in capital letters :" + " " + schoolName.toUpperCase()); // convert all the alphabets to capital letters
        System.out.println("The school name in small letters :" + " " + schoolName.toLowerCase()); // convert all the alphabets to small letters
        System.out.println("The index location of High is :" + " " + schoolName.indexOf("High")); // finding the index of the string

        // There are a lot of string function out there, go and check it out if you have time.
    }
}
