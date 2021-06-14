<!DOCTYPE html>

<!--
    Learning 2 : Variables in PHP
    Note:
        1) Variable is a container that use to hold the value of a data (normal/constant).

        2) A variable doest not need to declared before adding any value into the variable. PHP can automaticallly
           convert the variable to the correct data type based on its value.

        3) Rules of declaring variables in PHP :
            - need to start with dollor sign ($) and followed by the name of the variable
            - 1st letter of the variable name must be a letter or an underscore (_)
            - only can contain alpha-numeric characters and underscores only (A/a - Z/z, 0-9 & _)
            - the variable names are case-sensitive (&name != &Name)
            
        Example of declaring the variables :
            i)  $x = 15;
            ii) $name = "Adam";
           iii) $_color1 = "Green";
            iv) &value; (if the variable do not initialise with any value, it 
                         is defaulted to the NULL value)
-->

<html>
    <head>
        <meta charset="UTF-8">
        <title>Variables</title>
    </head>
 
    <body>
        <?php
        // declare the variables at this section
        $name = "Howard Teh";
        $age = 19;
        $_school = "TARUC Penang";

        // display the output with the variable declared at above
        echo "My name is " . $name . "<br>"; //1st way to display statement with variable
        echo "I am $age years old. <br>"; //2nd way to display statement with variable (easier way)
        echo "I am studying in $_school. <br>";

        // extra : how to declare constant variable? use define() function
        // define(varName, value);
        define("DOB", "09/10/2002");
        echo "I born in " . DOB . ".<br>";
        ?>
    </body>
</html>
