// Alan Bebout
// CSE 02
// hw04 Banking

// This program is designed to choose a random number to be the existing balance of a bank account, and then provide the
// user with the capability to add money to that account

// importing scanner and random utilities
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

// creating a class
public class Banking{
  public static void main(String [] args){
      
    // initializing two scanners, one for strings and one for integers
    Scanner myScanner;  
    Scanner myScanner2;
    myScanner = new Scanner( System.in );
    myScanner2 = new Scanner( System.in );
      
    // creating strings to compare user responses to for boolean truths or falses
    String deposit = "D";
    String withdraw = "W";
    String view = "V";
    
    // generating random decimal
    Random r = new Random();
    double randomNumber = r.nextDouble();
    // manipulating resulting decimal onto a range from 1000 to 5000
    double bankAmount = ((randomNumber + 1) * 4000) - 3000;
    // converting it to an integer
    bankAmount = (int) bankAmount;
    
    // declaring a couple variables in advance
    int amountInput;
    String response;
    
    // first input request
    System.out.println("Would you like to withdraw money, deposit money, or view your balance? (W, D, or V)");
    // response of which is recorded here
    response = myScanner.nextLine();
    
    // condition group for each of the possible results of the user input above
    if (response.equals(deposit)){
        // if deposit is requested, ask user how much?
        System.out.print("How much would you like to deposit? $");
        amountInput = myScanner2.nextInt();
        // old balance
        System.out.println("Your balance was: $" +bankAmount);
        bankAmount = bankAmount + amountInput;
        // new balance
        System.out.println("Your new balance is: $" +bankAmount);
    }
    else if (response.equals(withdraw)){
        // if withdrawl is requested, how much?
        System.out.print("How much would you like to withdraw? $");
        amountInput = myScanner2.nextInt();
        // old balance
        System.out.println("Your balance was: $" +bankAmount);
        bankAmount = bankAmount - amountInput;
        // new balance
        System.out.println("Your new balance is: $" +bankAmount);
    }
    else if (response.equals(view)){
        // if view is requested, show them their balance
        System.out.println("Your account currently contains: $" +bankAmount);
    }
    else{
        // the catch-all for nonsense responses
        System.out.println("This makes no sense. Go away.");
    }
  }
}