//Alan Bebout
//CSE 002

import java.util.Scanner;

public class BigMac {
   	public static void main(String[] args) {
   	    
   	    // initialize scanner
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        // output instructions for the user to enter a value
        System.out.print("Enter the number of Big Macs (an integer > 0): ");
        // input is entered
        int nBigMacs = myScanner.nextInt();
        // output instructions for a user to enter a value
        System.out.print("Enter the cost per Big Mac as a double (in the form xx.xx): ");
        // input is entered
        double bigMac$ = myScanner.nextDouble();
        // output instructions for a user to enter a value
    	System.out.print("Enter the percent tax as a whole number (xx): ");
    	// input is entered
    	double taxRate = myScanner.nextDouble();
    	// this input is divided by 100 so that it is in decimal form
        taxRate/=100;
        // initializes a variable to hold the cost of the order
        double cost$;
        // the total cost of the order
        cost$ = nBigMacs * bigMac$ * (1+taxRate);
        //get the whole amount, dropping decimal fraction
        
        // tangential calculations of dollar, dime, and penny amounts
        int dollars, dimes, pennies; 
        dollars=(int)cost$;
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        
        // final output of results
        System.out.println("The total cost of " +nBigMacs+" Big Macs, at $"+bigMac$+" per Big Mac, with a sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
        }   
    }