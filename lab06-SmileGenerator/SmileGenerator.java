// Alan Bebout
// CSE 02
// lab06 SmileGenerator

// import scanner
import java.util.Scanner;
import java.lang.Math;

// declare class
public class SmileGenerator{
    public static void main (String [ ] aug){
        
    for (int n = 1; n < 6; n++){
        System.out.print(":)");
    }
    
    System.out.println(" ");
    
    int m = 1;
    while (m < 6){
        System.out.print(":)");
        m++;
    }
    
    System.out.println(" ");
    
    int o = 1;
    do{
        System.out.print(":)");
        o = o + 1;
    } while (o < 6);
    
    System.out.println(" ");
    System.out.println(" ");
    
    double random = Math.random();
    double upperlimit = ((random + 1) * 100) - 100;
    upperlimit = (int) upperlimit;
    
    for (int p = 1; p < upperlimit; p++){
        System.out.print(":)");
    }
    
    System.out.println(" ");
    System.out.println(" ");
    
    for (int q = 1; q <5; q++){
        if (q == 1){
            System.out.println(":)");
        }
        if (q == 2){
            System.out.println(":):)");
        }
        if (q == 3){
            System.out.println(":):):)");
        }
        if (q == 4){
            System.out.println(":):):):)");
        }
    }
    }
}

    
    
    
        