// Learning 10 : Arrays in Java
/*
    In programming, we usually use arrays to store multiple values in one single variable.
    We do not need to declare all the variable one by one. This helps us to save a lot of time.
*/

public class L10_Arrays {
    public static void main (String[] args){

        // Way to declare an array
        String[] carBrands = {"BMW", "Mercedes", "Proton", "Toyota"}; // put a square brackets at the end of the data type
                                                                      // initialise the value of the array inside the curly brackets. you can separate the value by using comma

        // We can use for-each loop to display all the element inside he array
        // You can use normal for loop as well. Just for-each method is easier to write and do not require a counter
        for (String index : carBrands){
            System.out.println(index);
        }
        /*Output:
            BMW
            Mercedes
            Proton
            Toyota
        */

        /*
         How to access your specific element of an array
         Same as C, the element always start from index 0
         Here we are going to display the 1st element inside the carBrands array
        */
        System.out.println(carBrands[1]); // Output : Mercedes

        // If you want to change the value of an element, you just need to state the exact index number and initialise with the new value
        carBrands[3] = "Mustang";
        System.out.println(carBrands[3]); // Output : Mustang (the previous value of the 3rd element was Toyota

        // Getting the length or the numbers element of an array
        // use length()
        System.out.println(carBrands.length); // Output : 4 because there is 4 elements inside carBrands array

        // Multidimensional arrays - to create an array that containing 1 or more arrays
        // How to declare multidimensional arrays?
        int[][] numberList = {{1, 2, 3, 4}, {7, 9, 15}}; // numberList consist of 2 arrays with own set of curly braces
        System.out.println(numberList[0][3]); // Output : 4 because index 0 array and 3rd elements of 0 array is 4

        // If you want to loop all the elements of multidimensional arrays, use for loop
        for (int i = 0; i < numberList.length; ++i) {
            for(int j = 0; j < numberList[i].length; ++j) {
                System.out.println(numberList[i][j]);
            }
        }
    }
}

