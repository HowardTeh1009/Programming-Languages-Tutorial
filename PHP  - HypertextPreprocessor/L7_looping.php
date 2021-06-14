<!DOCTYPE html>

<!--
    Learning 6 : Looping in PHP
    Note:
        1) Loop is one of the function that is used to execute the same block of code again & again 
           as long as the condition is met.
        2) Basically, the purpose of looping is to automate the repetitive task within a prorgam which help
           to save the time and effor of the programmer.
        3) There are 4 types of looping in PHP :
            i) while loop
               - is used to loop the program when the specified condition is met.

           ii) do...while loop
               - the program will be executed first before the starting the loop. The condition
                 will be evaluated after 1st execution and start the loop once the condition is true.

          iii) for loop
               - this type of loop will evaluate the condition and loop the program until the counter reaches a specified number.

           iv) foreach loop
               - is used together with array. To loop through every single element consists inside the array.
-->

<html>
    <head>
        <meta charset="UTF-8">
        <title>Looping in PHP Development</title>
    </head>

    <body>
        <?php
        // execute the program using while loop
        $number = 0;

        printf("While Loop <br>");
        while ($number < 5) {
            printf("The number that is executed in %d round is %d. <br>", $number + 1, $number + 1);
            $number++;
        }
        /*
            Output:
                The number that is executed in 1 round is 1.
                The number that is executed in 2 round is 2.
                The number that is executed in 3 round is 3.
                The number that is executed in 4 round is 4.
                The number that is executed in 5 round is 5.
        */

        // execute the program using do...while loop
        $x = 1;

        echo "<br><br>";
        printf("Do...While Loop <br>");
        do {
            printf("The number is %d. Every single loop the number will increased by 1. <br>", $x);
            $x++;
        } while ($x < 5);
        /*
            Output:
                The number is 1. Every single loop the number will increased by 1.
                The number is 2. Every single loop the number will increased by 1.
                The number is 3. Every single loop the number will increased by 1.
                The number is 4. Every single loop the number will increased by 1.
        */

        // execute the program using for loop
        echo "<br><br>";
        printf("For Loop <br>");
        for ($y = 10; $y >= 0; $y--) {
            printf("Counting down from...... %d<br>", $y);

            if ($y == 0) {
                printf("Welcome to Looping chapter in PHP!");
            }
        }
        /*
            Output:
                Counting down from...... 10
                Counting down from...... 9
                Counting down from...... 8
                Counting down from...... 7
                Counting down from...... 6
                Counting down from...... 5
                Counting down from...... 4
                Counting down from...... 3
                Counting down from...... 2
                Counting down from...... 1
                Counting down from...... 0
                Welcome to Looping chapter in PHP!
        */
        
        
        
        // execute the program using foreach loop
        $name = array("Howard Teh", "Wong Zhi Hern", "Kang Nickee");
        
        echo "<br><br>";
        printf("Foreach Loop <br>");
        foreach($name as $key => $value){ //using key to indicate the extension of the elements
            echo $key . ":" . $value . "<br>";
        }
        /*
            Output:
                0:Howard Teh
                1:Wong Zhi Hern
                2:Kang Nickee
        */
        
        echo "<br>";
        foreach($name as $value){
            printf("%s <br>", $value);
        }
        /*
            Output:
                Howard Teh
                Wong Zhi Hern
                Kang Nickee
        */
        ?>
    </body>
</html>
