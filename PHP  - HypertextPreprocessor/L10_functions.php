<!DOCTYPE html>

<!--
    Learning 510 : Functions in PHP
    Note:
        1) Functions reduces the repetition of code within a program.
        2) Functions makes the code much easier to maintain.
        3) Functions makes it easier to eliminate the errors.
        4) Functions can be reused in other application.
-->

<html>
    <head>
        <meta charset="UTF-8">
        <title>Functions in PHP</title>
    </head>
    <body> 
        <?php
        // functions

	function sayHello($name = 'shaun', $time = 'morning'){
		echo "Good $time, $name <br>";
	} 
 
	//sayHello();
	//sayHello('mario');
	sayHello('yoshi', 'night');

	function formatProduct($product){
		// echo "{$product['name']} costs £{$product['price']} to buy <br />";
		return "The {$product['name']} costs £{$product['price']} to buy <br />";
	}
	
	formatProduct(['name' => 'gold star', 'price' => 20]);

	$formatted = formatProduct(['name' => 'gold star', 'price' => 20]);
	echo $formatted;
        ?>
    </body>
</html>
