// Alan Bebout
// CSE 02
// hw04 Which Number

// The purpose of this program is to deduce the identity of a number between 1 and 10 which the user chooses, without directly asking the user
// for the number. Therefore, it is necessary to use a series of questions about the user's secret number to determine which it is.

// importing scanner utility
import java.util.Scanner;

// creating a class
public class WhichNumber{
  public static void main(String [] args){
    
    // initializing scanner
    Scanner myScanner;  
    myScanner = new Scanner( System.in );
    
    // initializing strings by which to compare the y, Y, n, and N user response inputs
    String yesString1 = "y";
    String yesString2 = "Y";
    String noString1 = "n";
    String noString2 = "N";
    
    // first instruction to user
    System.out.println("Think of a number from 1 to 10 inclusive");
    
    
    // first information-seeking question
    System.out.println("Is the number even?");
    // storing the resulting response in variable "response"
    String response = myScanner.nextLine();
    // if statement checking whether response is equal to either of the possible "yes" strings
    if (response.equals(yesString1) || response.equals(yesString2)){
        
        // the following lines of code repeatedly use nested variants of the above process to further narrow down the potential numbers
        // eventually, after repeated promt/response combinations, the options for the number have been narrowed down to one
        
        // more specifically, the code is organized into nested triplets of conditions (if for "yes", else if for "no", and else for nonsense responses)
        
        
        System.out.println("Is the number divisible by 3?");
        response = myScanner.nextLine();
        if (response.equals(yesString1) || response.equals(yesString2)){
            //RESULT IS 6
            System.out.println("Is your number 6?");
            response = myScanner.nextLine();
            if (response.equals(yesString1) || response.equals(yesString2)){
                System.out.println("YAY!!");
                }
            else if (response.equals(noString1) || response.equals(noString2)){
                System.out.println("You lied!");
                }
            else{
                System.out.println("Sorry, that is not a valid input");
            }
        }
        else if (response.equals(noString1) || response.equals(noString2)){
            System.out.println("Is the number divisible by 4?");
            response = myScanner.nextLine();
            if (response.equals(yesString1) || response.equals(yesString2)){
                System.out.println("Is the number divided by 4 greater than 1?");
                response = myScanner.nextLine();  
                if (response.equals(yesString1) || response.equals(yesString2)){
                    //RESULT IS 8
                    System.out.println("Is your number 8?");
                    response = myScanner.nextLine();
                    if (response.equals(yesString1) || response.equals(yesString2)){
                        System.out.println("YAY!!");
                    }
                    else if (response.equals(noString1) || response.equals(noString2)){
                        System.out.println("You lied!");
                    }
                    else{
                        System.out.println("Sorry, that is not a valid input");
                    }
                }
                else if (response.equals(noString1) || response.equals(noString2)){
                    //RESULT IS 4
                    System.out.println("Is your number 4?");
                    response = myScanner.nextLine();
                    if (response.equals(yesString1) || response.equals(yesString2)){
                        System.out.println("YAY!!");
                    }
                    else if (response.equals(noString1) || response.equals(noString2)){
                        System.out.println("You lied!");
                    }
                    else{
                        System.out.println("Sorry, that is not a valid input");
                    }
                }
                else{
                    System.out.println("Sorry, that is not a valid input");
                }
            }
            else if (response.equals(noString1) || response.equals(noString2)){
                System.out.println("Is the number divisible by 5?");
                response = myScanner.nextLine(); 
                if (response.equals(yesString1) || response.equals(yesString2)){
                    //RESULT IS 10
                    System.out.println("Is your number 10?");
                    response = myScanner.nextLine();
                    if (response.equals(yesString1) || response.equals(yesString2)){
                        System.out.println("YAY!!");
                    }
                    else if (response.equals(noString1) || response.equals(noString2)){
                        System.out.println("You lied!");
                    }
                    else{
                        System.out.println("Sorry, that is not a valid input");
                    }
                }
                else if (response.equals(noString1) || response.equals(noString2)){
                    //RESULT IS 2
                    System.out.println("Is your number 2?");
                    response = myScanner.nextLine();
                    if (response.equals(yesString1) || response.equals(yesString2)){
                        System.out.println("YAY!!");
                    }
                    else if (response.equals(noString1) || response.equals(noString2)){
                        System.out.println("You lied!");
                    }
                    else{
                        System.out.println("Sorry, that is not a valid input");
                    }
                }
                else{
                    System.out.println("Sorry, that is not a valid input");
                }
            }
            else{
                System.out.println("Sorry, that is not a valid input");
            }
        }
        else{
            System.out.println("Sorry, that is not a valid input");
        }
    }
    
    else if (response.equals(noString1) || response.equals(noString2)){
        System.out.println("Is the number divisible by 3?");
        response = myScanner.nextLine();
        if (response.equals(yesString1) || response.equals(yesString2)){
            System.out.println("When the number is divided by 3, is the result greater than 1?");
            response = myScanner.nextLine();
            if (response.equals(yesString1) || response.equals(yesString2)){
                //RESULT IS 9
                System.out.println("Is your number 9?");
                    response = myScanner.nextLine();
                    if (response.equals(yesString1) || response.equals(yesString2)){
                        System.out.println("YAY!!");
                    }
                    else if (response.equals(noString1) || response.equals(noString2)){
                        System.out.println("You lied!");
                    }
                    else{
                        System.out.println("Sorry, that is not a valid input");
                    }
            }
            else if (response.equals(noString1) || response.equals(noString2)){
                //RESULT IS 3
                System.out.println("Is your number 3?");
                    response = myScanner.nextLine();
                    if (response.equals(yesString1) || response.equals(yesString2)){
                        System.out.println("YAY!!");
                    }
                    else if (response.equals(noString1) || response.equals(noString2)){
                        System.out.println("You lied!");
                    }
                    else{
                        System.out.println("Sorry, that is not a valid input");
                    }
            }
            else{
                System.out.println("Sorry, that is not a valid input");
            }
        }
        else if (response.equals(noString1) || response.equals(noString2)){
            System.out.println("Is it greater than 6?");
            response = myScanner.nextLine();  
            if (response.equals(yesString1) || response.equals(yesString2)){
                //RESULT IS 7
                System.out.println("Is your number 7?");
                    response = myScanner.nextLine();
                    if (response.equals(yesString1) || response.equals(yesString2)){
                        System.out.println("YAY!!");
                    }
                    else if (response.equals(noString1) || response.equals(noString2)){
                        System.out.println("You lied!");
                    }
                    else{
                        System.out.println("Sorry, that is not a valid input");
                    }
            }
            else if (response.equals(noString1) || response.equals(noString2)){
                System.out.println("Is it less than 3?");
                response = myScanner.nextLine();
                if (response.equals(yesString1) || response.equals(yesString2)){
                    //RESULT IS 1
                    System.out.println("Is your number 1?");
                    response = myScanner.nextLine();
                    if (response.equals(yesString1) || response.equals(yesString2)){
                        System.out.println("YAY!!");
                    }
                    else if (response.equals(noString1) || response.equals(noString2)){
                        System.out.println("You lied!");
                    }
                    else{
                        System.out.println("Sorry, that is not a valid input");
                    }
                }
                else if (response.equals(noString1) || response.equals(noString2)){
                    //RESULT IS 5
                    System.out.println("Is your number 5?");
                    response = myScanner.nextLine();
                    if (response.equals(yesString1) || response.equals(yesString2)){
                        System.out.println("YAY!!");
                    }
                    else if (response.equals(noString1) || response.equals(noString2)){
                        System.out.println("You lied!");
                    }
                    else{
                        System.out.println("Sorry, that is not a valid input");
                    }
                }
                else{
                    System.out.println("Sorry, that is not a valid input");
                }
            }
            else{
                System.out.println("Sorry, that is not a valid input");
            }
        }
        else{
            System.out.println("Sorry, that is not a valid input");
        }
    }
    else{
        System.out.println("Sorry, that is not a valid input");
    }
 }
}

