// Alan Bebout
// 4/21/15
// HW12


import java.util.Scanner;
import java.util.Random;

public class Multiply{

    public static void main(String[] args){
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
        
        System.out.print("Enter an integer width: ");
        width = dimensionScanner.nextDouble();
        
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
        
        System.out.print("Enter an integer height: ");
        height = dimensionScanner.nextDouble();
        
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

        widthInt = (int) width;
        heightInt = (int) height;
        System.out.println("Width: " + widthInt + " Height: " + heightInt);
        
        array1 = randomMatrix(widthInt, heightInt);
        array2 = randomMatrix(widthInt, heightInt);
        arrayMult = multiplyMatrix(array1, array2);
        printResult2(arrayMult, heightInt, widthInt);
    }
    
    public static int[][] randomMatrix(int width, int height){

        int x = 1;
        int y = 1;
        double doubleVal;
        int intVal;
    
        int[][] array = new int[height][width];

        for (x = 0; x < height; x++){
            for (y = 0; y < width; y++){
                doubleVal = Math.random();
                doubleVal = doubleVal * 20;
                doubleVal = doubleVal - 10;
                intVal = (int) doubleVal;
                array[x][y] = intVal;
            }
        }
        return array;
    }
    
    public static int[][] multiplyMatrix(int[][] array1, int[][] array2) {
        int e;
        int f;
        int g;
		int[][] result = new int[array1.length][array2[0].length];
		for (e = 0; e < array1.length; e++)
			for (f = 0; f < result.length; f++)
				for (g = 0; g < result[0].length; g++)
					result[e][f] += array1[e][g] * array2[f][g];
		
		return result;
	}
	
	
	
	public static void printResult(	int[][] array1, int[][] array2, int[][] arrayMult, char op) 
	{
		for (int i = 0; i < array1.length; i++) 
		{
			for (int j = 0; j < array1[0].length; j++)
				System.out.print(" " + array1[i][j]);
	
			if (i == array1.length / 2)
				System.out.print( "  " + op + "  " );
			else
				System.out.print( "     " );
			
			for (int j = 0; j < array2[0].length; j++)
				System.out.print(" " + array2[i][j]);
			
			if (i == array1.length / 2)
				System.out.print( "  =  " );
			else
				System.out.print( "     " );
			
			for (int j = 0; j < arrayMult[0].length; j++)
				System.out.print(" " + arrayMult[i][j]);
			
			System.out.println();
		}
	}
	
	public static void printResult2 (int[][] arrayMult, int height, int width) {
	    int i;
	    int j;
	    System.out.println("Here comes the matrix!");
		for (i = 0; i < width; i++){
			for (j = 0; j < height; j++){
				System.out.print(" " + arrayMult[i][j]);
		    }
		    System.out.println();
	    }
	}
}