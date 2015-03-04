// Alan Bebout
// 3/2/15
// hw06 - Get Integer

// import scanner utility
import java.util.Scanner;
  
// create class  
public class GetInteger{
    public static void main (String [] args){
        // initialize scanner
        Scanner myScanner = new Scanner ( System.in );
        // ask for integers
        System.out.println("Please provide 5 non-negative integers: ");
        // initialize variables
        int total = 0;
        int n = 1;
        // while loop to accumulate and sum 5 integers
        while (n < 6){ 
            // getting the integers with the scanner
            int number = myScanner.nextInt();
            // the safety net for incorrect inputs
            if (number < 0){
                System.out.print("You didn't follow directions. Please enter a new number: ");
            }
            // aggregating the values into a total
            else{
                total = total + number;
                n = n + 1;
            }
        }
        // outputting the sum
        System.out.println("The sum is: " +total);
    }
}