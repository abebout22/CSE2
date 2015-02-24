// Alan Bebout
// CSE 02
// hw05 To Hex

// import scanner
import java.util.Scanner;

// declare class
public class ToHex{
    public static void main (String [ ] aug){
        // initialize scanner
        Scanner myScanner = new Scanner ( System.in );
        // ask for input
        System.out.println("Please provide three numbers representing RGB values: ");
        // sequentially ask for the red blue and green values and accept them using the scanner
        System.out.print("Red value: ");
        int redVal = myScanner.nextInt();
        System.out.print("Green value: ");
        int greenVal = myScanner.nextInt();
        System.out.print("Blue value: ");
        int blueVal = myScanner.nextInt();
        
        // find the remainder when each color value is divided by 16
        int redMod = redVal % 16;
        int greenMod = greenVal % 16;
        int blueMod = blueVal % 16;
        
        // find the number of times 16 goes into each color value
        int redDiv = redVal / 16;
        int greenDiv = greenVal / 16;
        int blueDiv = blueVal / 16;
        
        // truncate this number of times
        redDiv = (int) redDiv;
        greenDiv = (int) greenDiv;
        blueDiv = (int) blueDiv;
        
        // setup the strings which will hold the hexadecimal representations of the color values
        String redDiv2 = String.valueOf(redDiv);
        String redMod2 = String.valueOf(redMod);
        String greenDiv2 = String.valueOf(greenDiv);
        String greenMod2 = String.valueOf(greenMod);
        String blueDiv2 = String.valueOf(blueDiv);
        String blueMod2 = String.valueOf(blueMod);
        
        // switch statement for the first digit of the hexidecimal representation of red value
        switch(redDiv){
            // each case represents a different potential hexidecimal digit
            case 15:
                // making the conversion
                redDiv2= "F";
                break;
            case 14:
                redDiv2= "E";
                break;
            case 13:
                redDiv2= "D";
                break;
            case 12:
                redDiv2= "C";
                break;
            case 11:
                redDiv2= "B";
                break;
            case 10:
                redDiv2= "A";
                break;
            case 9:
                redDiv2= "9";
                break;  
            case 8:
                redDiv2= "8";
                break;
            case 7:
                redDiv2= "7";
                break;
            case 6:
                redDiv2= "6";
                break; 
            case 5:
                redDiv2= "5";
                break;
            case 4:
                redDiv2= "4";
                break;
            case 3:
                redDiv2= "3";
                break;
            case 2:
                redDiv2= "2";
                break;
            case 1:
                redDiv2= "1";
                break;
            case 0:
                redDiv2= "0";
                break;
            // default case
            default:
                break;
        }
        
        // switch statement for the second digit of the hexidecimal representation of red value
        switch(redMod){
            case 15:
                redMod2 = "F";
                break;
            case 14:
                redMod2 = "E";
                break;
            case 13:
                redMod2 = "D";
                break;
            case 12:
                redMod2 = "C";
                break;
            case 11:
                redMod2 = "B";
                break;
            case 10:
                redMod2 = "A";
                break;
            case 9:
                redMod2 = "9";
                break;  
            case 8:
                redMod2 = "8";
                break;
            case 7:
                redMod2 = "7";
                break;
            case 6:
                redMod2 = "6";
                break; 
            case 5:
                redMod2 = "5";
                break;
            case 4:
                redMod2 = "4";
                break;
            case 3:
                redMod2 = "3";
                break;
            case 2:
                redMod2 = "2";
                break;
            case 1:
                redMod2 = "1";
                break;
            case 0:
                redMod2 = "0";
                break;
            default:
                break;
        }
        
        // switch statement for the first digit of the hexidecimal representation of green value
        switch(greenDiv){
            case 15:
                greenDiv2 = "F";
                break;
            case 14:
                greenDiv2 = "E";
                break;
            case 13:
                greenDiv2 = "D";
                break;
            case 12:
                greenDiv2 = "C";
                break;
            case 11:
                greenDiv2 = "B";
                break;
            case 10:
                greenDiv2 = "A";
                break;
            case 9:
                greenDiv2 = "9";
                break;  
            case 8:
                greenDiv2 = "8";
                break;
            case 7:
                greenDiv2 = "7";
                break;
            case 6:
                greenDiv2 = "6";
                break; 
            case 5:
                greenDiv2 = "5";
                break;
            case 4:
                greenDiv2 = "4";
                break;
            case 3:
                greenDiv2 = "3";
                break;
            case 2:
                greenDiv2 = "2";
                break;
            case 1:
                greenDiv2 = "1";
                break;
            case 0:
                greenDiv2 = "0";
                break;
            default:
                break;
        }
        
        // switch statement for the second digit of the hexidecimal representation of green value
        switch(greenMod){
            case 15:
                greenMod2 = "F";
                break;
            case 14:
                greenMod2 = "E";
                break;
            case 13:
                greenMod2 = "D";
                break;
            case 12:
                greenMod2 = "C";
                break;
            case 11:
                greenMod2 = "B";
                break;
            case 10:
                greenMod2 = "A";
                break;
            case 9:
                greenMod2 = "9";
                break;  
            case 8:
                greenMod2 = "8";
                break;
            case 7:
                greenMod2 = "7";
                break;
            case 6:
                greenMod2 = "6";
                break; 
            case 5:
                greenMod2 = "5";
                break;
            case 4:
                greenMod2 = "4";
                break;
            case 3:
                greenMod2 = "3";
                break;
            case 2:
                greenMod2 = "2";
                break;
            case 1:
                greenMod2 = "1";
                break;
            case 0:
                greenMod2 = "0";
                break;
            default:
                break;
        }
        
        // switch statement for the first digit of the hexidecimal representation of blue value
        switch(blueDiv){
            case 15:
                blueDiv2 = "F";
                break;
            case 14:
                blueDiv2 = "E";
                break;
            case 13:
                blueDiv2 = "D";
                break;
            case 12:
                blueDiv2 = "C";
                break;
            case 11:
                blueDiv2 = "B";
                break;
            case 10:
                blueDiv2 = "A";
                break;
            case 9:
                blueDiv2 = "9";
                break;  
            case 8:
                blueDiv2 = "8";
                break;
            case 7:
                blueDiv2 = "7";
                break;
            case 6:
                blueDiv2 = "6";
                break; 
            case 5:
                blueDiv2 = "5";
                break;
            case 4:
                blueDiv2 = "4";
                break;
            case 3:
                blueDiv2 = "3";
                break;
            case 2:
                blueDiv2 = "2";
                break;
            case 1:
                blueDiv2 = "1";
                break;
            case 0:
                blueDiv2 = "0";
                break;
            default:
                break;
        }
        
        // switch statement for the second digit of the hexidecimal representation of blue value
        switch(blueMod){
            case 15:
                blueMod2 = "F";
                break;
            case 14:
                blueMod2 = "E";
                break;
            case 13:
                blueMod2 = "D";
                break;
            case 12:
                blueMod2 = "C";
                break;
            case 11:
                blueMod2 = "B";
                break;
            case 10:
                blueMod2 = "A";
                break;
            case 9:
                blueMod2 = "9";
                break;  
            case 8:
                blueMod2 = "8";
                break;
            case 7:
                blueMod2 = "7";
                break;
            case 6:
                blueMod2 = "6";
                break; 
            case 5:
                blueMod2 = "5";
                break;
            case 4:
                blueMod2 = "4";
                break;
            case 3:
                blueMod2 = "3";
                break;
            case 2:
                blueMod2 = "2";
                break;
            case 1:
                blueMod2 = "1";
                break;
            case 0:
                blueMod2 = "0";
                break;
            default:
                break;
        }
                
        // outputting the input numbers for reference
        System.out.print("The decimal numbers R: " +redVal+ ", G: " +greenVal+ ", B: " +blueVal+ ", is represented in hexadecimal as: ");
        // outputting the hexidecimal representation in the same line
        System.out.println(redDiv2 + redMod2 + greenDiv2 + greenMod2 + blueDiv2 + blueMod2);
    }
}