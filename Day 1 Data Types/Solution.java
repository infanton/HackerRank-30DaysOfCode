import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        
        // Given
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        // Scanner Object for System Input
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int i2; 
        double d2; 
        String s2 = "";
        
        /* Read and save an integer, double, and String to your variables.*/
        i2 = Integer.parseInt(scan.nextLine());
        d2 = Double.parseDouble(scan.nextLine());
        s2 = scan.nextLine();
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+i2);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d+d2);
		
        /* Concatenate and print the String variables on a new line - the 's' variable above should be printed first. */
            System.out.println(s+s2);

        // Close Scanner Object
        scan.close();
    }
}
