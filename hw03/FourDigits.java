// Alan Bebout
// CSE 02
// HW 03 FourDigits

// initialize scanner utility
import java.util.Scanner;

// create class
public class FourDigits{
  public static void main(String [] args){
      
    // initialize scanner
    Scanner myScanner;  
    myScanner = new Scanner( System.in );
  
    // ask for double input
    System.out.print("Provide a double: ");
    double inputNumber = myScanner.nextDouble();
    
    // create a new variable, which will be casted into an integer
    double inputNumberInteger = inputNumber;
    // cast the new variable as an integer
    inputNumberInteger = (int) inputNumberInteger;
    // subtract the two variables, leaving behind only the decimal places in a new variable
    double decimalconverted = inputNumber - inputNumberInteger;
    // multiply the resulting variable by 10000 so that the first four decimal places are now to the left of the decimal
    decimalconverted = decimalconverted * 10000;
    // cast the result as an integer, removing the decimal places (EXCEPT ITS UNEXPLAINABLY LEAVING ONE DECIMAL PLACE IN MY INTEGER)
    decimalconverted = (int) decimalconverted;
    
    // output resulting digits
    System.out.println("The first four decimal digits are: " +decimalconverted);
    
  }
}
