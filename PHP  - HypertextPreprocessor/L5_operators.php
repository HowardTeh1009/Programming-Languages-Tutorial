<!DOCTYPE html>

<!--
    Learning 5 : Operators in PHP
    Note:
        1) Operators are the symbols that used to tell PHP to perform some actions.
        2) There are many types of operators that can be found in PHP.
            - Arithmetic, Assignment, Comparison, Increment/Decrement, String, Logical, Array & Spaceship) 
-->

<html>
    <head>
        <meta charset="UTF-8">
        <title>Operators in PHP</title>
    </head>

    <body>
        <img src="https://codebridgeplus.com/wp-content/uploads/php-operators.jpg" alt="Arithmetic Opetaros" width="500" height="300">
        <p>Examples : </p>

        <!--perform arithmetic operation in php -->
        <?php
        $x = 10;
        $y = 4;
        echo "x + y = " . ($x + $y) . "<br>"; // 0utputs: 14
        echo "x - y = " . ($x - $y) . "<br>"; // 0utputs: 6
        echo "x * y = " . ($x * $y) . "<br>"; // 0utputs: 40
        echo "x / y = " . ($x / $y) . "<br>"; // 0utputs: 2.5
        echo "x % y = " . ($x % $y) . "<br><br>"; // 0utputs: 2
        ?>

        <img src="https://1.bp.blogspot.com/-4oE4B2rb50w/X2YOY1FlesI/AAAAAAAAFpg/Rb7uF3glf8ghks5-tNXlmIMUHPGocjurACNcBGAsYHQ/s589/Webp.net-compress-image.jpg" 
             alt="Assignment Opetaros" width="500" height="300">
        <p>Examples : </p>

        <!--perform assignment operation in php -->
        <?php
        $x1 = 10;
        echo "x = " . $x1 . "<br>"; // Outputs: 10

        $x2 = 20;
        $x2 += 30;
        echo "x += 30 is " . $x2 . "<br>"; // Outputs: 50

        $x3 = 50;
        $x3 -= 20;
        echo "x -= 30 is " . $x3 . "<br>"; // Outputs: 30
        ?>
    </body>
</html>
