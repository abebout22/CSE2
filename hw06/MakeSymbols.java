// Alan Bebout
// 3/2/15
// hw06 - MakeSymbols

// importing the scanner and random utilities
import java.util.Scanner;
import java.lang.Math;

// creating a class
public class MakeSymbols{
    public static void main (String [] args){
        
        // creating a random value
        double randomNumber1 = Math.random();
        // changing the range of value of the created random number
        randomNumber1 = ((randomNumber1 + 1) * 100) - 100;
        // removing the decimals
        int randomNumber2 = (int) randomNumber1;
        
        // outputting the value itself
        System.out.println("Generated number is: " +randomNumber2);
        // initializing the counter variable
        int n = 1;
        // text before outputting the pattern
        System.out.print("Generated pattern: ");
        // checking if even or odd
        if (randomNumber2 % 2 == 0){
            // if even, asterisks
            do {
                System.out.print("*");
                n++;
            } while (n < randomNumber2);
        }
        if (randomNumber2 % 2 == 1){
            // if odd, ampersands
            do {
                System.out.print("&");  
                n++;
            } while (n < randomNumber2);
        }
        System.out.println(" ");
    }
}