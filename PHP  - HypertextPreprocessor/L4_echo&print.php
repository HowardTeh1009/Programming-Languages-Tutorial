<!DOCTYPE html>

<!--
    Learning 4 : echo & print
    Note:
        1) echo and print are both used to display the output to the screen.
        2) echo will not return any value after display while print will return 1 after display the output.
        3) echo can accept multiple parameters but print only can accept one. (echo is much more faster than print) 
-->

<html>
    <head>
        <meta charset="UTF-8">
        <title>Echo & Print statement</title>
    </head>

    <body>
        <?php
        // use echo to display the output
        echo "<h1>PHP is Fun!</h1>";
        echo "Hello world!<br>";
        echo "I'm about to learn PHP!<br>";
        echo "This ", "string ", "was ", "made ", "with multiple parameters.<br><br>"; //take multiple parameters in echo
        
        // display using variables
        $text1 = "Learn PHP";
        $text2 = "W3Schools.com";
        $x = 5;
        $y = 4;

        echo "<h2>" . $text1 . "</h2>";
        echo "Study PHP at " . $text2 . "<br>";
        echo "X + Y = " . $x + $y . "<br><br>";

        // use print to display the output with variables
        $txt1 = "Learn PHP";
        $txt2 = "W3Schools.com";
        $x1 = 5;
        $y1 = 4;

        print "<h2>" . $txt1 . "</h2>";
        print "Study PHP at " . $txt2 . "<br>";
        print $x1 + $y1;
        ?>
    </body>
</html>
