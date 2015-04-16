// Alan Bebout
// CSE2Linear
// HOMEWORK 11

// importing the Scanner utility
import java.util.Scanner;
import java.lang.reflect.Array;

// creating a class
public class CSE2Linear {
    // creating the main method
    public static void main(String[] args) {

        // declaring variables
        int[] intArray;
        int[] intArray2;
        int x = 0;
        int max = 0;
        double y = 0;
        double z = 0;
        boolean a;
        boolean b;
        boolean c;
        int inputNumberINT = 0;
        double inputNumber = 0;
        intArray = new int[15];
        intArray2 = new int[15];
        // initializing a scanner
        Scanner inputScanner = new Scanner(System.in);
        
        // the input gathering loop
        for (x = 0; x <= 14; x++) {
            // y is the variable to hold the previous value of inputNumber
            y = -1;
            if (x >= 1){
                y = intArray [x - 1];   
            }
            // setting each of the three keys to false
            a = false;
            b = false;
            c = false;
            // asking for input
            System.out.print("Please enter a grade: ");
            inputNumber = inputScanner.nextDouble();
            
            // while loop such that if any one of the three conditions is not met, the result will be setting all of the boolean keys to false
            // in order for the value to pass to being set as an array value, it has to change and keep changed all three conditional booleans
            while (a == false || b == false || c == false){
                if (inputNumber % 1 == 0){
                    a = true;
                }
                else{
                    System.out.print("ERROR: Not an integer! Enter a new grade: ");
                    inputNumber = inputScanner.nextDouble();
                    a = false;
                    b = false;
                    c = false;
                    continue;
                }
                if (inputNumber <= 100 && inputNumber >= 0){
                    b = true;
                }
                else{
                    System.out.print("ERROR: Not in the range! Enter a new grade: ");
                    inputNumber = inputScanner.nextDouble();
                    a = false;
                    b = false;
                    c = false;
                    continue;
                }
                if (inputNumber >= y){
                    c = true;
                }
                else{
                    System.out.print("ERROR: Not greater or equal to the previous value! Enter a new grade: ");
                    inputNumber = inputScanner.nextDouble();
                    a = false;
                    b = false;
                    c = false;
                    continue;
                }
            }
            // converting value to an integer (though if its gotten this far, its already a double with decimal of .0)
            inputNumberINT = (int) inputNumber; 
            intArray[x] = inputNumberINT;
        
            if (intArray[x] >= max){
                max = intArray[x];
            }
        }
        
        // printing the array
        System.out.println("");
        System.out.print("Array: ");
        for (x = 0; x <= 14; x++){
            System.out.print(intArray[x]);
            System.out.print(" ");
        }
        System.out.println("");
        System.out.println("");

        // calling the binary search method
        binarySearch(intArray, max);
        // calling the randomizer method
        intArray2 = randomizer(intArray);
        
        // printing out the randomized array
        System.out.println("");
        System.out.print("Array POST RANDOMIZER: ");
        for (x = 0; x <= 14; x++){
            System.out.print(intArray2[x]);
            System.out.print(" ");
        }
        System.out.println("");
        System.out.println("");
        
        // calling the linear search method
        linearSearch(intArray2);
    }
    
    // randomizer
    public static int[] randomizer(int[] randArray) {
        // for loop to switch each value with a randomly selected other position in the array
		for (int i = 0; i < 15; i++) {
			int target = (int)(15 * Math.random());
			int temp = randArray[target];
			randArray[target] = randArray[i];
			randArray[i] = temp;
		}
		// returning an array
    	return randArray;
	}
	
	// binary search
	public static void binarySearch(int[] intArray, int maximum) {
	    // declaring variables
		int position;
		int upperbound=15;
		int lowerbound=0;
		int key=0;
		int comparisonCount = 1;
		// scanner
		Scanner binaryScanner = new Scanner(System.in);
		
		// asking for a value to search for
		System.out.print("Enter value to find: ");
		key = binaryScanner.nextInt();
		
		// mechanism to keep searches in the range
		while (key > maximum){
		    System.out.print("You're way too high. Pick a smaller number: ");
		    key = binaryScanner.nextInt();
		}
		while (key <= 0){
		    System.out.print("No negatives or zeros. Pick a positive number: ");
		    key = binaryScanner.nextInt();
		}

        // setting the initial search location
		position = (lowerbound + upperbound) / 2;
		position = (int) position;
		
		// the search itself. continues to cut the upper and lower bounds until they are the same and have settled on a particular array position
		while ((intArray[position] != key) && (lowerbound <= upperbound)) {
			if (intArray[position] > key) {
				upperbound = position - 1;
			} 
			else {
				lowerbound = position + 1; 
			}
			position = (lowerbound + upperbound) / 2;
			position = (int) position;
			// meanwhile, incrementing the comparison count every time the while loop runs
			comparisonCount++;
		}
		
		// output for the 'number found' condition
		if (lowerbound <= upperbound) {
			System.out.println("The grade was found in array subscript " + (position + 1));
			System.out.println("The binary search found the grade after " + comparisonCount + " iterations.");
		} 
		// the failure condition response
    	else {
			System.out.println("Sorry, that grade is not in this array.  The binary search made " + comparisonCount + " iterations.");
		}
	}
	
	// linear search
	public static void linearSearch(int[] intArray) {
	    // initializing variables
		int c;
		int search;
		int iterations = 0;
		// scanner
		Scanner linearScanner = new Scanner(System.in);
		// asking for a grade
		System.out.print("Enter grade to find: ");
		search = linearScanner.nextInt();
		// methodically increasing the position in the array being checked with a for loop
		for (c = 0; c <= 14; c++) {
		    iterations++;
		    // if its found:
			if (intArray[c] == search){
				System.out.println("Your searched grade " + search + " is present at location " + (c + 1) + ".");
				System.out.println("The search required " + iterations + " iterations.");
				break;
			}
			// if you've reached the end and not found it yet
		    if (c == 14) {
		        System.out.println(search + " is not present in array.");
		    }
		}
	}
}