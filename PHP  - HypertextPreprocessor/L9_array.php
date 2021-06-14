<!DOCTYPE html>

<!--
    Learning 9 : Arrays
    Notes :
            1) Arrays is a complex variables that used to store a group of values under a single variable name.
            2) There are 3 types of array :
                i) Indexed Array/Numeric Array - used to store the element with numeric index
               ii) Associative Array - used to store the element that has its own specific value
              iii) Multidimensional Array - an array that containing one or more array within itself
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Array In PHP</title> 
    </head>
    
    <body>
        <?php
        // Declaring index and associative array
        $colors = array("Red", "Blue", "Yellow"); //index array
        $carModel = array("car1" => "BMW", "car2" => "Mercedez", "car3" => "Volkswagen"); //associative array
        
        //display all the elements of both arrays using print_r() *only print_r() can used to display all
        print_r($colors); echo "<br>";
        print_r($carModel); echo "<br>";
        
        // display only one element of both arrays by using echo()
        echo ($colors[0]);
        
        // changing the value of the element inside an array
        $colors[2] = "Orange";
        print_r($colors); echo "<br>";
      
        
        // Multidimensional Arrays
        $blogs = [
		['title' => 'mario party', 'author' => 'mario', 'content' => 'lorem'],
		['title' => 'mariokart cheats', 'author' => 'toad', 'content' => 'lorem'],
		['title' => 'zelda hidden chests', 'author' => 'link', 'content' => 'lorem']
	];

	//print_r($blogs);
	//print_r($blogs[2]);
	//echo $blogs[1]['title'];
	//echo count($blogs);

	$blogs[] = ['title' => 'castle party', 'author' => 'peach', 'content' => 'lorem'];
	//print_r($blogs);

	$popped = array_pop($blogs);
	print_r($popped);
        
        ?>
        
        
    </body>
</html>
