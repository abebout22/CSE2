// Alan Bebout
// CSE 02
// Lab 02 Cyclometer

// Program designed to calculate the elapsed time and distance traveled on a 
// bike trip of a given time period, and with a given number of wheel rotations

public class Cyclometer{
  public static void main(String [] args){
  
  // initializing stuff and providing trip info
	int secsTrip1 = 480;  // number of seconds in trip 1
	int secsTrip2 = 3220;  // number of seconds in trip 2
	int countsTrip1 = 1561;  // number of wheel rotations in trip 1
	int countsTrip2 = 9037; // number of wheel rotations in trip 2
	double wheelDiameter = 27.0,
	
	// constants and conversion factors
  	PI=3.14159, // pi
  	feetPerMile=5280,  // conversion factor
  	inchesPerFoot=12,   // conversion factor
  	secondsPerMinute=60;  // conversion factor
  	
	double distanceTrip1, distanceTrip2, totalDistance;
 
 // outputting the time elapsed for the trips (with the seconds to minute
 // conversion built in)
	System.out.println("Trip 1 took "+
       	(secsTrip1/secondsPerMinute)+" minutes and had "+
       	countsTrip1+" counts.");
	System.out.println("Trip 2 took "+
       	(secsTrip2/secondsPerMinute)+" minutes and had "+
       	countsTrip2+" counts.");
       	
       	
  // formula for trip distance, given wheel diameter and rotation count
	distanceTrip1=countsTrip1*wheelDiameter*PI;
 	
 	// convert that result to miles
	distanceTrip1/=inchesPerFoot*feetPerMile;
	
	// same thing, for the other trip and consolidated into a single formula
	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	
	// summing the two trips to a single distance
	totalDistance=distanceTrip1+distanceTrip2;
	
	// outputting the trip distances calculated using the rotations numbers
	System.out.println("Trip 1 was "+distanceTrip1+" miles");
	System.out.println("Trip 2 was "+distanceTrip2+" miles");
	System.out.println("The total distance was "+totalDistance+" miles");
	
  }
}