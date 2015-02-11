// Alan Bebout
// CSE 02
// HW 03 Cyclometer

// initializing the scanner utility
import java.util.Scanner;

// creating a class
public class Bicycle{
    public static void main(String [] args){
    
    // initializing the scanner
    Scanner myScanner;  
    myScanner = new Scanner( System.in );
  
    // asking for and receiving input
    System.out.print("Timer reading (seconds): ");
    int elapsedTime = myScanner.nextInt();
  
    // asking for and receiving input
    System.out.print("Cyclometer counter reading (rotations): ");
    int nCounter = myScanner.nextInt();
    
    // initializing conversion factors
	  double wheelDiameter = 27.0;
	  double PI=3.14159;
  	double inchesPerMile=63360; 
  	double secondsPerHour=3600;
  	
  	// the math
  	double elapsedTimeMinutes = (elapsedTime / 60);
  	double elapsedTimeHours = (elapsedTime / secondsPerHour);
  	double distanceTravelled = ( (nCounter * PI * wheelDiameter) / (inchesPerMile));
  	double averageMPH = ( (distanceTravelled) / (elapsedTimeHours) );
  	
  	// integer conversion method
  	elapsedTimeHours = elapsedTimeHours * 100;
  	elapsedTimeHours = (int) elapsedTimeHours;
  	elapsedTimeHours = elapsedTimeHours / 100;
  	
  	// integer conversion method
  	distanceTravelled = distanceTravelled * 100;
  	distanceTravelled = (int) distanceTravelled;
  	distanceTravelled = distanceTravelled / 100;
  	
  	// integer conversion method
  	averageMPH = averageMPH * 100;
  	averageMPH = (int) averageMPH;
  	averageMPH = averageMPH / 100;
	
	  // output
	  System.out.println("The distance travelled was " +distanceTravelled+ " and took " +elapsedTimeMinutes+ " minutes");
	  System.out.println("The average MPH was: " +averageMPH);
       	
  }
}