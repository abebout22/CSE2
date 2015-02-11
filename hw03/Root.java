// Alan Bebout
// CSE 02
// HW 03 Root

// initialize scanner utility
import java.util.Scanner;
// initialize math function utility
import java.lang.Math;

// create class
public class Root{
  public static void main(String [] args){
      
    // initialize scanner
    Scanner myScanner;  
    myScanner = new Scanner( System.in );
  
    // ask for double input
    System.out.print("Provide a double: ");
    double inputNumber = myScanner.nextDouble();
    
    // use a java math function to approximate the cube root
    double cubeRoot = Math.pow(inputNumber, .33333333333);
    
    // print root
    System.out.println("The cube root is: " +cubeRoot);
  }
}
