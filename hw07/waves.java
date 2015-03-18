// Alan Bebout
// CSE 02
// hw07 Waves

// importing scanner utility
import java.util.Scanner;

// creating class
public class waves{
    public static void main (String [ ] aug){
        // initializing a scanner
        Scanner myScanner = new Scanner ( System.in );
        // asking for input
        System.out.print("Enter a number between 1 and 30: ");
        // assigning the input to a variable
        int inputNumber = myScanner.nextInt();
        
        // initializing all three counters
        int o = 1;
        int p = 1;
        int q = 1;
        
        // heading
        System.out.println("");
        System.out.println("FOR LOOPS:");
        
        // for loop structure
        // o is the value of the number currently being printed
        // increments by 2 on the outer loop level so that an increment and a decrement (or one pyramid thingy) can be printed
        for (o = 1; o <= inputNumber; o += 2){
            // p is the value of the number of indents necessary
            for (p = o; p >= 1; p--){
                // q is the value of the number of digits printed on the line
                for (q = 1; q <= p; q++){
                    System.out.print(o);
                }
                System.out.println("");
            }
            // if to ascertain whether the inputNumber had already been reached
            if ((o + 1) <= inputNumber){
                for (p = 1; p <= (o + 1); p++){
                    for (q = 1; q <= p; q++){
                        System.out.print((o + 1));
                    }
                    System.out.println("");
                }
            }
        }
        
        // setting the counters back to norms
        o = 1;
        p = 1;
        q = 1;
        
        // header
        System.out.println("");
        System.out.println("WHILE LOOPS:");
        
        // now same thing but with while loops
        while (o <= inputNumber){
            // while loops necessitate statements like the one below since theres no inherent opportunity to set the value of a variable in a while
            p = o;
            while (p >= 1){
                // same here
                q = 1;
                while (q <= p){
                    System.out.print(o);
                    // also the incrementation has to be done like this
                    q = q + 1;
                }
                System.out.println("");
                p = p - 1;
            }
            if ((o + 1) <= inputNumber){
                p = 1;
                while (p <= (o + 1)){
                    q = 1;
                    while (q <= p){
                        System.out.print((o + 1));
                        q = q + 1;
                    }
                    System.out.println("");
                    p = p + 1;
                }
            }
            o = o + 2;
        }
        
        // reset
        o = 1;
        p = 1;
        q = 1;
        
        // header
        System.out.println("");
        System.out.println("DO-WHILE LOOPS:");
        
        
        // same thing but with do-while loops (almost identical to the while loop version)
        do {
            p = o;
            do {
                q = 1;
                do{
                    System.out.print(o);
                    q = q + 1;
                } while (q <= p);
                System.out.println("");
                p = p - 1;
            } while (p >= 1);
            if ((o + 1) <= inputNumber){
                p = 1;
                do {
                    q = 1;
                    do {
                        System.out.print((o + 1));
                        q = q + 1;
                    } while (q <= p);
                    System.out.println("");
                    p = p + 1;
                } while (p <= (o + 1));
            }
            o = o + 2;
        } while (o <= inputNumber);
    }
}