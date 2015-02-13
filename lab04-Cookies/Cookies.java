// Alan Bebout
// CSE 02
// Lab 04 Cookies

import java.util.Scanner;

// create class
public class Cookies{
  public static void main(String [] args){
      
    int nPeople;
    int nCookiesPer;
    int nCookies;
    
    
    // initializing a scanner  
    Scanner myScanner;  
    myScanner = new Scanner( System.in );
    
    // asking for an integer number of people
    System.out.print("How many people?: ");
    // if statement to determine if the given number is an integer
    if (myScanner.hasNextInt()){
        // if it is an integer, setting it as the nPeople variable
        nPeople = myScanner.nextInt();
        // checking if the variable is positive
        if (nPeople <= 0){
            // if it isnt, error message and ending program
            System.out.println("ERROR, you don't have people to give cookies to");
            return;
        }
    }
    // but if the input was not an integer...
    else{
        // error message and end code
        System.out.println("You did not enter an int");
        return;
    } 
    
    // asking for an integer number of cookies per person
    System.out.print("How many cookies per person?: ");
    // if statement to determine if the given number is an integer
    if (myScanner.hasNextInt()){
        // if it is an integer, setting it as the nCookiesPer variable
        nCookiesPer = myScanner.nextInt();
        // checking if the variable is positive
        if (nCookiesPer <= 0){
            // if it isnt, error message and end program
            System.out.println("ERROR, you can't give your guests negative cookies");
            return;
         }
    }
    // if the input was not an integer...
    else{
        // error message and end program
        System.out.println("You did not enter an int");
        return;
    } 
    
    // asking for an integer number of cookies per person
    System.out.print("How many cookies?: ");
    // if statement to determine if the given number is an integer
    if (myScanner.hasNextInt()){
        // if it is an integer, setting it as the nCookies variable
        nCookies = myScanner.nextInt();
        // checking if the variable is positive 
        if (nCookies <= 0){
            // if it isnt, error message and end program
            System.out.println("ERROR, you can't have negative cookies");
            return;
         }
    }
    // if the input was not an integer...
    else{
        // error message and end program
        System.out.println("You did not enter an int");
        return;
    } 
    
    // if the program reaches this point, all variables are positive integers
    
    // calculating the difference between the cookies supplied and demanded
    int areThereEnough = ((nCookies) - (nPeople * nCookiesPer));
    // if the remainder is positive...
    if (areThereEnough >= 0){
        // outputting that you have enough cookies
        System.out.print("You have enough cookies, and ");
        // checking if the remaining extraneous cookies can be evenly distributed among the guests
        double evenlyOrNot = ((-1 * areThereEnough) / nPeople);
        if (evenlyOrNot%nPeople == 0){
            // the case in which the cookeis do not divide evenly
            System.out.println("the cookies DO NOT divide evenly");
        }
        else{
            // if the remainder is 1 or 0, there were either no extra cookies or the remaining cookies could be distributed evenly
            System.out.println("the cookies divide evenly");
        }
    }
    // the case of needing more cookies in the first place
    else{
        System.out.println("You DO NOT have enough cookies, and you need at least " +(-1 * areThereEnough)+ " more cookies");
    }
    
    }
  }
  