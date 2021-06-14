<!DOCTYPE html>

<!--
    Learning 6 : Decision Making in PHP
    Note:
        1) We are allow to perform different actions based on the logical and comparative test condition.
        2) We can create different test conditions using different form of expression.
        3) When the condition is true, the true statement's actions will be performed, if false, then perform the false statement's actions.
        4) Types of decision making expression/statement :
            - if, if-else, if...elseif...else, switch & ternary operator
-->

<html>
    <head>
        <meta charset="UTF-8">
        <title>Decision Making in PHP</title>
    </head>

    <body>
        <?php
        // perform the action by using the if statement
        // if statement will only execute the actions if the specified condition is true
        $day = date("D");
        if ($day == "Wed") {
            echo "Today is Wednesday. <br><br>";
        }

        // perform the action by using the if-else statement
        // if the first condition is not true, the program will then execute the other action.
        if ($day == "Mon") {
            echo "Today is Monday. <br><br>";
        } else {
            echo "The actual day of today is Wednesday <br><br>";
        }

        // perform the action by using the if...elseif..else statement
        /* if...elseif..else statement is used to combine multiple if-else statement,
          when one condition is wrong, it will then perform the actions based on the alternative condition.
         */
        if ($day == "Mon") {
            echo "Today is Monday. <br><br>";
        } elseif ($day == "Fri") {
            echo "Today is Monday. <br><br>";
        } else {
            echo "Wednesday!!! <br><br>";
        }

        // perform the action by using the switch...case statements
        /* switch-case statement tests a variable against a series of 
         * values until it finds a match, and then executes the block of code corresponding to that match.
         */
        $today = date("D");
        switch ($today) {
            case "Mon":
                echo "Today is Monday. Clean your house.";
                break;
            case "Tue":
                echo "Today is Tuesday. Buy some food.";
                break;
            case "Wed":
                echo "Today is Wednesday. Visit a doctor.";
                break;
            case "Thu":
                echo "Today is Thursday. Repair your car.";
                break;
            case "Fri":
                echo "Today is Friday. Party tonight.";
                break;
            case "Sat":
                echo "Today is Saturday. Its movie time.";
                break;
            case "Sun":
                echo "Today is Sunday. Do some rest.";
                break;
            default:
                echo "No information available for that day.";
                break;
        }

        //ternary operator : use a single line to perform if-else statement
        // represented by the question mark (?) symbol and it takes three operands: a condition to check, a result for true, and a result for false.
        $sales = 9000;
        $allowance = 0;
        ($sales > 10000) ? $allowance = 1000 : $allowance = 500;
        echo "<br>";
        echo $allowance;
        ?>
    </body>
</html>




