<?php

// Given.
$handle = fopen ("php://stdin","r");
$i = 4;
$d = 4.0;
$s = "HackerRank ";

// Declare second integer, double, and String variables.
$i2;
$d2;
$s2;

// Read and save an integer, double, and String to your variables.
$i2 = fgets($handle);
$d2 = fgets($handle);
$s2 = fgets($handle);

// Print the sum of both integer variables on a new line.
echo $i+$i2 . "\n";

// Print the sum of the double variables on a new line.
echo number_format($d+$d2,1) . "\n";

// Concatenate and print the String variables on a new line
// The 's' variable above should be printed first.
echo $s . $s2 . "\n";

fclose($handle);
?>
