// Alan Bebout
// CSE 02
// lab05 Space Exploration

import java.lang.Math;

public class SpaceExploration{
    public static void main (String [ ] aug){

        double randomNumber = Math.random();
        randomNumber = (randomNumber * 10) + 2000;
        int startYear = (int) randomNumber;
        
        System.out.println(startYear);

        switch(startYear){
            case 2000:
                System.out.println("2000: First spacecraft orbits an asteroid");
                break;
            case 2001:
                System.out.println("2000: First spacecraft orbits an asteroid");
                System.out.println("2001: First spacecraft lands on an asteroid");
                break;
            case 2002:
                System.out.println("2000: First spacecraft orbits an asteroid");
                System.out.println("2001: First spacecraft lands on an asteroid");
                break;
            case 2003:
                System.out.println("2000: First spacecraft orbits an asteroid");
                System.out.println("2001: First spacecraft lands on an asteroid");
                System.out.println("2003: Largest infrared telescope released");
                break;
            case 2004:
                System.out.println("2000: First spacecraft orbits an asteroid");
                System.out.println("2001: First spacecraft lands on an asteroid");
                System.out.println("2003: Largest infrared telescope released");
                break;
            case 2005:
                System.out.println("2000: First spacecraft orbits an asteroid");
                System.out.println("2001: First spacecraft lands on an asteroid");
                System.out.println("2003: Largest infrared telescope released");
                System.out.println("Spacecraft collides with a comet");
                break;
            case 2006:
                System.out.println("2000: First spacecraft orbits an asteroid");
                System.out.println("2001: First spacecraft lands on an asteroid");
                System.out.println("2003: Largest infrared telescope released");
                System.out.println("2005: Spacecraft collides with a comet");
                System.out.println("2006: Spacecraft returns with collections from a comet");
                break;
            case 2007:
                System.out.println("2000: First spacecraft orbits an asteroid");
                System.out.println("2001: First spacecraft lands on an asteroid");
                System.out.println("2003: Largest infrared telescope released");
                System.out.println("2005: Spacecraft collides with a comet");
                System.out.println("2006: Spacecraft returns with collections from a comet");
                break;
            case 2008:
                System.out.println("2000: First spacecraft orbits an asteroid");
                System.out.println("2001: First spacecraft lands on an asteroid");
                System.out.println("2003: Largest infrared telescope released");
                System.out.println("2005: Spacecraft collides with a comet");
                System.out.println("2006: Spacecraft returns with collections from a comet");
                System.out.println("2008: Kepler launched to study deep space");
                break;
            case 2009:
                System.out.println("2000: First spacecraft orbits an asteroid");
                System.out.println("2001: First spacecraft lands on an asteroid");
                System.out.println("2003: Largest infrared telescope released");
                System.out.println("2005: Spacecraft collides with a comet");
                System.out.println("2006: Spacecraft returns with collections from a comet");
                System.out.println("2008: Kepler launched to study deep space");
                break;
            case 2010:
                System.out.println("2000: First spacecraft orbits an asteroid");
                System.out.println("2001: First spacecraft lands on an asteroid");
                System.out.println("2003: Largest infrared telescope released");
                System.out.println("2005: Spacecraft collides with a comet");
                System.out.println("2006: Spacecraft returns with collections from a comet");
                System.out.println("2008: Kepler launched to study deep space");
                System.out.println("2010: Space X successfully sends spacecraft to orbit and back");
                break;
        }
    }
}