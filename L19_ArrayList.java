// Learning 19 : Array List in Java
/*
    Array List in Java is a class that uses a dynamic array for storing the elements in the program.
    We are able to add or remove the elements at anytime so it is much more flexible to programmer
    compared to the usage of traditional array.

    Characteristics of Array List in Java :
        - Array List is a re-sizable array (dynamic array). The size will be changed whenever there
          is any element is being added or removed.
        - It is used to store a group of elements sames as the traditional arrays.
        - It allows duplicate and null values.
        - We can use the boxed types like "Integer", "Character", "Boolean" and etc. to create the array list.

    Pros of using Array List in Java :
        - Java ArrayList is an ordered collection. It maintains the insertion order of the elements.

    Cons of using Array List in Java :
        - Java ArrayList is not synchronized. If multiple threads try to
          modify an ArrayList at the same time, then the final outcome will be non-deterministic.
 */

import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;  // Import the Collections class (for sorting array list purpose)

public class L19_ArrayList {
    public static void main(String[] args){
        // create an array list that stores integer elements
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // add/initiate elements into the numbers's array list using add() method
        numbers.add(1); // add 1 into the array list
        numbers.add(2); // add 2 into the array list
        numbers.add(3); // add 3 into the array list
        numbers.add(4); // add 4 into the array list
        numbers.add(5); // add 5 into the array list

        // display the elements of the numbers array list
        System.out.println(numbers); // Output : [1, 2, 3, 4, 5]

        // if we want to access an element in the array list, use get() method
        System.out.println(numbers.get(0));
        /* the 0 that stated in the get() method is actually the index number of the array list
           Output : 1
        */

        /* we can also change the value of the element in array list by using set()
           if we want to use set() method, we need to state the index number and provide a new value to replace
         the existing value store in the stated index number.
        */
        numbers.set(2, 8); // we change the value of 2nd index position from 3 to 8
        System.out.println(numbers.get(2)); // Output : 8

        // we can remove the element from the array list using remove() method
        numbers.remove(4); // we need to state the index position of the element that we want to remove
        System.out.println(numbers); // Output : [1, 2, 8, 4] (latest array list)

        // let us check the size of the array list using size() method
        System.out.println(numbers.size()); // Output : 4 (as there is only 4 elements in the array list)

        // sorting the array list using sort() method (import the collection class from the package first)
        Collections.sort(numbers); // sorting occurs here
        System.out.println(numbers); // Output : [1, 2, 4, 8] (after sorting)

        // display the elements line by line using loops (for loop or for-each loop)
        // for loop
        for (int index = 0; index < numbers.size(); index++){
            System.out.println(numbers.get(index));
        }

        // for-each loop
        for ( int i : numbers){
            System.out.println(i);
        }

        /*Output for both loop :
                    1
                    2
                    4
                    8
        */

        // remove all the elements of an array list using clear() method
        numbers.clear();
        System.out.println(numbers); // Output : [] (null values because all elements are removed from the array list)
    }
}
