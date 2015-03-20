// Alan Bebout
// 3/2/15
// lab07 Zigzag


import java.util.Scanner;


public class zigzag{
    public static void main (String [] args){
        
        int n = 1;
        int o = 1;
        int nStars = 10;
        for (n = 1; n <= nStars; n++){
            System.out.print("*");
        }
        System.out.println("");
        for (n = 1; n <= nStars; n++){
            for (o = 1; o <= n; o++){
                if (o > 1){
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
        for (n = 1; n <= nStars; n++){
            System.out.print("*");
        }
        System.out.println("");
        
        while (true){
            Scanner myScanner = new Scanner ( System.in );
            System.out.print("Enter an integer between 3 and 33: ");
        
            while (!myScanner.hasNextInt()){
                System.out.println("Enter an INTEGER: ");
                myScanner.next();
            }
            nStars = myScanner.nextInt();
            while (nStars < 3 || nStars > 33){
                System.out.println("Enter a new integer in the range [3,33]: ");
                while (!myScanner.hasNextInt()){
                    System.out.println("Enter an INTEGER in the range [3,33]: ");
                    myScanner.next();
                }
                nStars = myScanner.nextInt();
            }

            n = 1;
            o = 1;
            for (n = 1; n <= nStars; n++){
                System.out.print("*");
            }
            System.out.println("");
            for (n = 1; n < (nStars - 1); n++){
                for (o = 1; o <= n; o++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for (n = 1; n <= nStars; n++){
                System.out.print("*");
            }
            System.out.println("");
            String yes1 = "y";
            String yes2 = "Y";
            System.out.print("Run again? (Enter y or Y): ");
            String response = myScanner.next();
            if (response.equals(yes1) || response.equals(yes2)){
                System.out.print("");
            }
            else{
                break;
            }
        }
    }
}