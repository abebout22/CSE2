// Alan Bebout
// 4/21/15
// HW12

// initialize scanner and random utility
import java.util.Scanner;
import java.util.Random;

// class
public class Multiply{
    // main method
    public static void main(String[] args){
        // initializing scanner and vars
        Scanner dimensionScanner = new Scanner ( System.in );
        int[][] array1;
        int[][] array2;
        int[][] arrayMult;
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;
        double width;
        double height;
        int widthInt;
        int heightInt;
        
        // asking for input
        System.out.print("Enter an integer width: ");
        width = dimensionScanner.nextDouble();
        
        // checking input viability
        while (a == false || b == false){
            if (width % 1 == 0){
                a = true;
            }
            else {
                a = false;
                b = false;
                System.out.print("ERROR: Not an integer. Enter an integer width: ");
                width = dimensionScanner.nextDouble();
            }
            if (width > 0){
                b = true;
            }
            else{
                a = false;
                b = false;
                System.out.print("ERROR: Less than or equal to zero. Enter a positive width: ");
                width = dimensionScanner.nextDouble();
            }
        }
        
        // asking for input
        System.out.print("Enter an integer height: ");
        height = dimensionScanner.nextDouble();
        
        // checking input viability
        while (c == false || d == false){
            if (height % 1 == 0){
                c = true;
            }
            else {
                c = false;
                d = false;
                System.out.print("ERROR: Not an integer. Enter an integer height: ");
                height = dimensionScanner.nextDouble();
            }
            if (height > 0){
                d = true;
            }
            else{
                c = false;
                d = false;
                System.out.print("ERROR: Less than or equal to zero. Enter a positive height: ");
                height = dimensionScanner.nextDouble();
            }
        }

        // converting input to ints
        widthInt = (int) width;
        heightInt = (int) height;
        // outputting input, just for reference
        System.out.println("Width: " + widthInt + " Height: " + heightInt);
        
        // calling random method to create random array
        array1 = randomMatrix(widthInt, heightInt);
        //twice
        array2 = randomMatrix(widthInt, heightInt);
        // multiplying the two arrays in the given way
        arrayMult = multiplyMatrix(array1, array2);
        // printing the resulting array
        printResult2(arrayMult, heightInt, widthInt);
    }
    
    // the random method
    public static int[][] randomMatrix(int width, int height){
        // counter variables etc
        int x = 1;
        int y = 1;
        double doubleVal;
        int intVal;
        // creating an array
        int[][] array = new int[height][width];
        // creating an array of height x width size full of random numbers between -10 and 10
        for (x = 0; x < height; x++){
            for (y = 0; y < width; y++){
                doubleVal = Math.random();
                doubleVal = doubleVal * 20;
                doubleVal = doubleVal - 10;
                intVal = (int) doubleVal;
                array[x][y] = intVal;
            }
        }
        // returning this array
        return array;
    }
    
    // completing the multiplication step
    public static int[][] multiplyMatrix(int[][] array1, int[][] array2) {
        // counter variables
        int e;
        int f;
        int g;
        // creating a new array by completing the multiplication process described in the assignment
		int[][] result = new int[array1.length][array2[0].length];
		for (e = 0; e < array1.length; e++)
			for (f = 0; f < result.length; f++)
				for (g = 0; g < result[0].length; g++)
					result[e][f] += array1[e][g] * array2[f][g];
		// returning the resulting array
		return result;
	}
	
	// print method
	public static void printResult2 (int[][] arrayMult, int height, int width) {
	    // counters
	    int i;
	    int j;
	    // nested for loops to print
		for (i = 0; i < width; i++){
			for (j = 0; j < height; j++){
				System.out.print(" " + arrayMult[i][j]);
		    }
		    System.out.println();
	    }
	}
}