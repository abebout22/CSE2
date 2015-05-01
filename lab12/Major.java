// Alan Bebout
// 5/01/15
// Lab 12

// initialize scanner and random utility
import java.util.Scanner;
import java.util.Random;


public class Major{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter an integer width: ");
        int width = scan.nextInt();
        
        System.out.print("Please enter an integer height: ");
        int height = scan.nextInt();
        
        boolean format = false;
        System.out.print("Please enter 1 or 0 to determine the value of format (1 for true, 0 for false): ");
        int inputNum = scan.nextInt();
        
        if (inputNum == 1){
            format = true;
        }
        if (inputNum == 0){
            format = false;
        }

        int[][] array;
        
        array = IncreasingMatrix(width, height, format);
        printMatrix(array, format);
        System.out.println("=================");
        translate(array);
        
    }
    
    
    public static int[][] IncreasingMatrix(int width, int height, boolean format){
        int z = 1;
        
        if (format == false){
            int [][] array = new int[height][width];
            for (int x = 0; x < height; x++){
                for (int y = 0; y < width; y++){
                    array[x][y] = z; //[height][width]
                    z = z + 1;
                }
            }
            return array;
        }
        
        else{
            int [][] array = new int[width][height];
            z = 1;
            int w = 0;
            for (int x = 0; x < width; x++){
                w = z;
                for (int y = 0; y < height; y++){
                    array[x][y] = z;
                    z = z + 1;
                }
                z = w + height;
            }
            return array;
        }
    }
        
    public static void printMatrix(int[][] array, boolean format){
        
        if (format == false){
            for (int a = 0; a < array.length; a++){
                for (int b = 0; b < array[a].length; b++){
                    System.out.print(array[a][b] + "  ");
                }
                System.out.println("");
            }
        }
        
        else{
            System.out.println("Width of array is: " + array[0].length);
            System.out.println("Height of array is: " + array.length);
            
            for (int b = 0; b < array.length; b++){
                for (int a = 0; a < array[0].length; a++){
                    System.out.print(array[b][a] + "  ");
                }
                System.out.println("");
            }
        }
    }
    
    public static void translate(int[][] array){
        // Implement translate(int[][] array).  This method should read the input matrix, 
        // assuming that it is in a column major format, then copy its values into a newly 
        // allocated array in row major format.  Output the new array.
        int[][] arrayTrans = new int[array.length][array[0].length];
        
        for (int x = 0; x < array[0].length; x++){
            for (int y = 0; y < array.length; y++){
                arrayTrans[x][y] = array[y][x];
            }
        }
        
        for (int b = 0; b < array.length; b++){
            for (int a = 0; a < array[0].length; a++){
                System.out.print(arrayTrans[a][b] + "  ");
            }
            System.out.println("");
        }
    }
}
        
        