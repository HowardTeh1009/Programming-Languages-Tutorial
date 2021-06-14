<!DOCTYPE html>

<!--
    Learning 3 : Data types 
    Note:
        1) Data types are refering to the type of the values that stored inside a variable.
        2) Different types of data type can be used to perform different things.
        3) Types of data types - (scalar)  integer, float, string, boolean
                               - (compound) array, object
                               - (special) resourse, null 
        4) Data types in PHP is loosely-typed.
            - because PHP determine the type of data type depending on the value of the variable.
        5) There are several ways to test or work with the data types.
-->

<html>
    <head>
        <meta charset="UTF-8">
        <title>Data Types in PHP</title>
    </head>
    
    <body>
        <!-- Data Type Testing Function ((gettype(variable) or is_type(variable)) -->
        <?php
        // variables declarations
        $string = "Hello world!"; //string
        $number = 5985; //integer (must be whole number, positive/negative is acceptable)
        $decimal = 10.365; //float because has decimal point
        $flag = true; //boolean
        
        // use gettype() to get the data type of the variable
        echo "$flag is " . gettype($flag) . ". <br>";
        echo "$string is " . gettype($string) . ". <br><br>";
        
        //use is_type(value) to check the data type (return true or 1 if is the correct data type)
        echo "$number is " . is_int($number) . ". <br>";
        echo "$string is " . is_string($string) . ". <br>";
        echo "$decimal is " . is_bool($decimal) . ". <br><br><br>"; //try with a false statement
        ?>
        
        <!-- Data Type Casting Function ((setttype(variable) or (<type>(variable)) -->
        <?php
        // use settype(variable) to set the data type for each variable
        $name = "Howard Teh"; 
        $stud_id = 2001724; 
        settype($name, "integer");
        settype($stud_id, "string");
       
        // display the new data type info of each variables
        echo "$name is " . gettype($name) . ". <br>";
        echo "$stud_id is " . gettype($stud_id) . ". <br><br>";

        // use (<type>(variable) to set & display the data type of each variable
        echo (int)$name . "<br>";
        echo (boolean)$stud_id . "<br>";
        ?>
    </body>
</html>
