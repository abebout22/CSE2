// Alan Bebout
// 3/2/15
// hw06 RunFactorial

// import scanner
import java.util.Scanner;
    
// create class
public class RunFactorial{
    public static void main (String [] args){
        // initialize scanner
        Scanner myScanner = new Scanner ( System.in );
        // ask for input
        System.out.println("Enter an integer between 9 and 16: ");
        int givenNumber= myScanner.nextInt();
        int factorial = 1;
        // keeps asking for input until you give it a number between 9 and 16
        while (givenNumber < 9 || givenNumber > 16){
            System.out.print("You done goofed. Enter a new integer: ");
            givenNumber = myScanner.nextInt();
        }
        
        // actually calculates the factorial by decrementing the givenNumber and multiplying
        while (givenNumber > 0){
                 factorial = factorial * givenNumber;
                 givenNumber--;
        }
        
        // outputs factorial
        System.out.println("The factorial is: " + factorial);
    }
}