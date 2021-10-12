// Learning 5 : Type Casting in Java
/*
    Notes :
    Type Casting is used when you want to convert a current data type to another type.
    There are 2 ways of type casting :
        1) Widening Casting  (Automatically) = converting a smaller type to a larger type size
        2) Narrowing Casting (Manually)      = converting a larger type to a smaller size type
*/

public class L5_TypeCasting {
    public static void main (String[] args){
        int myInt = 9;

        System.out.println(myInt);      // Outputs : 9
        System.out.println((double) myInt);   // Outputs : 9.0

        double decimals = 5.56;
        decimals = (int) decimals; // Manually casting : double to int

        System.out.println(decimals); // Outputs : 5.0
    }
}
