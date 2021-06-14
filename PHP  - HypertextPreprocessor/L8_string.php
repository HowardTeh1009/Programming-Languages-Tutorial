<!DOCTYPE html>

<!--
    Learning 8 : String in PHP
    Note:
        1) String is a combination of letters, numbers and special characters.
        2) We can use single quote ('') or double ("") to create a string.
            i) single quote : only use for string characters (normal texts, numbers & special characters).
           ii) double quote : suitable to use for the string that contains escape character (\n, \t, \r and etc.)
        3) There are many kinds of string function such as :
            i) Strlen() - use to search the length of string
           ii) substr() - use to access the characters within a string
          iii) strstr() - use to search the word in a string
           iv) strpos() - use to locate the character in a string
            v) substr_count () - use to find the last match
-->

<html>
    <head>
        <meta charset="UTF-8">
        <title>String in PHP</title>
    </head>

    <body>
        <?php
        // string declarations
        $myFavouriteAnimal = "cat";
        // display string 
        echo "My favourite animal is {$myFavouriteAnimal} <br>";

        // string functions example
        $my_str = "Welcome to string tutorial<br>";

        //strlen() example
        echo strlen($my_str);
        echo $my_str;
        echo "<br>";

        //strreplace() example
        str_replace($my_str, "tutorial", "learning");
        echo $my_str;
        echo "<br>";
        ?>
        
        <!-- If you want to have a look on escape sequence, please read this -->
        <p>CLICK HERE - > <a href="https://phppot.com/php/php-escape-sequences/" style="color: red; text-decoration: none;">ESCAPE SEQUENCE</a></p>
    </body>
</html>
