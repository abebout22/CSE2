// Alan Bebout
// CSE 02
// lab06 SmileGenerator

// import scanner
import java.util.Scanner;
import java.lang.Math;

// declare class
public class SmileGenerator{
    public static void main (String [ ] aug){
    
    // printing 5 smileys via a for loop
    for (int n = 1; n < 6; n++){
        System.out.print(":)");
    }
    
    System.out.println(" ");
    
    // printing 5 smileys via a while loop
    int m = 1;
    while (m < 6){
        System.out.print(":)");
        m++;
    }
    
    System.out.println(" ");
    
    // printing 5 smileys via a do while loop
    int o = 1;
    do{
        System.out.print(":)");
        o = o + 1;
    } while (o < 6);
    
    System.out.println(" ");
    System.out.println(" ");
    
    // creating a random number between 1 and 100
    double random = Math.random();
    double upperlimit = ((random + 1) * 100) - 100;
    upperlimit = (int) upperlimit;
    
    // outputting the cooresponding number of smileys
    if (upperlimit < 30){
        for (int p = 0; p < upperlimit; p++){
            System.out.print(":)");
        }
    }
    // the following if statements and for loops use subtraction to guarantee that the line length never exceeds 30 smileys
    if (upperlimit > 30 && upperlimit < 60){
        System.out.println(":):):):):):):):):):):):):):):):):):):):):):):):):):):):):):)");
        upperlimit = upperlimit - 30;
        for (int p = 0; p < upperlimit; p++){
            System.out.print(":)");
        }
    }
    if (upperlimit > 60 && upperlimit < 90){
        System.out.println(":):):):):):):):):):):):):):):):):):):):):):):):):):):):):):)");
        System.out.println(":):):):):):):):):):):):):):):):):):):):):):):):):):):):):):)");
        upperlimit = upperlimit - 60;
        for (int p = 0; p < upperlimit; p++){
            System.out.print(":)");
        }
    }
    if (upperlimit > 90){
        System.out.println(":):):):):):):):):):):):):):):):):):):):):):):):):):):):):):)");
        System.out.println(":):):):):):):):):):):):):):):):):):):):):):):):):):):):):):)");
        System.out.println(":):):):):):):):):):):):):):):):):):):):):):):):):):):):):):)");
        upperlimit = upperlimit - 90;
        for (int p = 0; p < upperlimit; p++){
            System.out.print(":)");
        }
    }
    
    System.out.println(" ");
    System.out.println(" ");
    
    // printing a smiley triangle using a single for loop with ifs inside
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

    
    
    
        