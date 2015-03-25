// Alan Bebout
// 3/20/15
// hw08 Adventure World


//importing utilities
import java.util.Scanner;
import java.lang.Math;

// creating a class
public class HW8{
    // the main method
    public static void main(String[] args) {
        char option;
        // iniializing a scanner
        Scanner scan = new Scanner(System.in);
        // starting game and asking for input
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit:");
        // input analysis method
        getInput(scan, "Cc");
        // more storyline
        System.out.println("You are in a dead valley.");
        // input request
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit:");
        // input analysis method again
        getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        // method to print out the cave picture
        cave();
        // input request
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit: ");
        // same as above
        getInput(scan, "Cc");
        // storyline
        System.out.println("You entered a cave!");
        // input request
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit:");
        // method again
        getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        // giant picture
        giant();
        // asking for different type of input
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
        // method gets overloaded here
        getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 treasure box in front of you! Enter the box number you want to open!");
        // box pictures
        box();
        // overloaded again
        getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    
    public static void giant() {
        // text to create picture
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ         ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ         ");
        System.out.println("                           H    HHHHHHHHHHH    H              ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ         ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                  ");
    }

    public static void cave() {
        // text to create picture
        System.out.println("                              *****   * * * * * * * *         ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){
        // text to create picture
        System.out.println("                     *********************     *********************    *********************              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************              "); 
    }
    
    // first version of the getInput method
    public static void getInput(Scanner scan, String string){
        // create new string to hold the result of the scan
        String scanString = scan.next();
        // if to find out of c or C was entered
        if (scanString.charAt(0) == 'c' || scanString.charAt(0) == 'C'){
            System.out.println("");
        }
        else{
            System.out.println("Yea right LOSER!");
            System.exit(0);
        }
    }
    
    // the fight scene version of the getInput method
    public static void getInput(Scanner scan, String string, int trial){
        // creating the randomnumber
        double randomNumber;
        // assigning a limit to the amount the giant's health (trial) can decrease
        while (trial > 0){
            // scanning for the value of scanString
            String scanString = scan.next();
            // checking for the attack commands
            if (scanString.charAt(0) == 'A' || scanString.charAt(0) == 'a'){
                // creating a random number
                randomNumber = Math.random();
                // checking if the number is greater than or less than .5, effectively giving a 50% chance of a hit
                if (randomNumber < 0.5){
                    randomNumber = 0;
                    System.out.println("You Miss!");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
                }
                else {
                    randomNumber = 1;
                    System.out.println("Critical Hit!");
                    trial = trial - 1;
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
                }
            }
            // the escape condition check
            else if (scanString.charAt(0) == 'E' || scanString.charAt(0) == 'e'){
                // again creating a random number
                randomNumber = Math.random();
                // this time checking if the number is greater than 0.9, which is a 10% chance
                if (randomNumber >= 0.9){
                    // if so, you escape
                    System.out.println("You've successfully escaped!");
                    return;
                }
                else{
                    // otherwise, the cycle continues and you're back to input about your intended action
                    System.out.println("YOU DIDN'T ESCAPE!!!!!!");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD"); 
                }
            }
            else{
                System.out.println("Executed by the giant! GAME OVER");
                System.exit(0);
            }
        }
    }
    // treasure chest version of getInput
    public static void getInput(Scanner scan){
        // creating an integer from the scanner
        int scanString = scan.nextInt();
        // switch statement for possible values of scanString
        switch(scanString) {
            // various rewards
            case 1:
                System.out.println("Congrats! You have won the right to have your cake and eat it too!");
                break;
            case 2:
                System.out.println("Congrats! You have won eternal happiness!");
                break;
            case 3:
                System.out.println("Congrats! You get a canned koala!");
                break;
            default:
            System.out.println("Wrong number! You get nothing!");
        }
    }
}