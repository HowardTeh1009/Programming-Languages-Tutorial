<!DOCTYPE html>

<!-- 
    Learning 1 : Basic Syntax in PHP
    
    Notes:
    Every codes that written in PHP must be enclosed within the php tag.

    Rules of the syntax in PHP:
    1) Every PHP statement must be ended with a semicolon (;).
    2) PHP is case sensitivity. Thus, the variables must be written consistently and correctly.
-->

<html>
    <head>
        <meta charset="UTF-8">
        <title>Basic Syntax of PHP Development</title>
    </head>

    <body>
        <?php
        //print out the statement using echo
        echo "Hello World! <br>";
        ECHO "Welcome to PHP Development! <br>";
        eChO "This is the first lesson. <br><br><br>"
        ?>

        <?php
        //variables declaration ($ is the symbol that used to declare the variable)
        $color = "red";
        $color1 = "blue";
        $color2 = "black";

        //print out the statement by including the variables
        echo "My car is " . $color . "<br>";
        echo "My car is " . $color1 . "<br>";
        echo "My car is " . $color2 . "<br>";
        ?>
        
        <!--we can also adding PHP script into the HTML element (embedded PHP)-->
        <p><?php echo "This is an embedded PHP!"; ?></p>
    </body>
</html>
