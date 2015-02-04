// Alan Bebout
// HW02 Arithmetic Calculations

// creating a class
public class Arithmetic{
  public static void main(String [] args){
      
    //Number of pairs of socks
    int nSocks=3;
    //Cost per pair of socks
    //(‘$’ is part of the variable name)
    double costSocks$=2.58;

    //Number of drinking glasses
    int nGlasses=6;
    //Cost per glass
    double costGlasses$=2.29;

    //Number of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double costEnvelopes$=3.25;

    //tax percentage
    double taxPercent=0.06;

    // calculating the tax amount on each item purchase
    double taxSocks$ = taxPercent * nSocks * costSocks$;
    double taxGlasses$ = taxPercent * nGlasses * costGlasses$;
    double taxEnvelopes$ = taxPercent * nEnvelopes * costEnvelopes$;
    
    // mult by 100
    taxSocks$ = taxSocks$ * 100;
    taxGlasses$ = taxGlasses$ * 100;
    taxEnvelopes$ = taxEnvelopes$ * 100;
    // convert to integer
    taxSocks$ = (int) taxSocks$;
    taxGlasses$ = (int) taxGlasses$;
    taxEnvelopes$ = (int) taxEnvelopes$;
    //divide by 100, for the purpose of having two decimal places like money
    taxSocks$ = taxSocks$ / 100.00;
    taxGlasses$ = taxGlasses$ / 100.00;
    taxEnvelopes$ = taxEnvelopes$ / 100.00;

    // outputting tax amounts
    System.out.println("The tax on the socks was $" + taxSocks$);
    System.out.println("The tax on the glasses was $" + taxGlasses$);
    System.out.println("The tax on the envelopes was $" + taxEnvelopes$);
    System.out.println("");
    
    // adding up the tax
    double totalTax$ = taxSocks$ + taxGlasses$ + taxEnvelopes$;
    
    // two decimal place process
    totalTax$ = totalTax$ * 100;
    totalTax$ = (int) totalTax$;
    totalTax$ = totalTax$ / 100.00;
    
    // outputting total tax amounts
    System.out.println("The total tax on all items was $" + totalTax$);
    System.out.println("");

    // calculating the pre-tax cost of each item
    double totalSocksCostBT$ = nSocks * costSocks$;
    double totalGlassesCostBT$ = nGlasses * costGlasses$;
    double totalEnvelopeCostBT$ = nEnvelopes * costEnvelopes$;
    
    // two decimal place process
    totalSocksCostBT$ = totalSocksCostBT$ * 100;
    totalGlassesCostBT$ = totalGlassesCostBT$ * 100;
    totalEnvelopeCostBT$ = totalEnvelopeCostBT$ * 100;
    totalSocksCostBT$ = (int) totalSocksCostBT$;
    totalGlassesCostBT$ = (int) totalGlassesCostBT$;
    totalEnvelopeCostBT$ = (int) totalEnvelopeCostBT$;
    totalSocksCostBT$ = totalSocksCostBT$ / 100;
    totalGlassesCostBT$ = totalGlassesCostBT$ / 100;
    totalEnvelopeCostBT$ = totalEnvelopeCostBT$ / 100;

    // outputting pre-tax costs
    System.out.println("The total cost of the socks before tax was $" + totalSocksCostBT$);
    System.out.println("The total cost of the glasses before tax was $" + totalGlassesCostBT$);
    System.out.println("The total cost of the envelopes before tax was $" + totalEnvelopeCostBT$);
    System.out.println("");

    // calculating post-tax costs of each item
    double totalSocksCostAT$ = nSocks * costSocks$ * (1 + taxPercent);
    double totalGlassesCostAT$ = nGlasses * costGlasses$ * (1 + taxPercent);
    double totalEnvelopeCostAT$ = nEnvelopes * costEnvelopes$ * (1 + taxPercent);
    
    // two decimal place process
    totalSocksCostAT$ = totalSocksCostAT$ * 100;
    totalGlassesCostAT$ = totalGlassesCostAT$ * 100;
    totalEnvelopeCostAT$ = totalEnvelopeCostAT$ * 100;
    totalSocksCostAT$ = (int) totalSocksCostAT$;
    totalGlassesCostAT$ = (int) totalGlassesCostAT$;
    totalEnvelopeCostAT$ = (int) totalEnvelopeCostAT$;
    totalSocksCostAT$ = totalSocksCostAT$ / 100;
    totalGlassesCostAT$ = totalGlassesCostAT$ / 100;
    totalEnvelopeCostAT$ = totalEnvelopeCostAT$ / 100;
    
    // outputting post-tax costs
    System.out.println("The total cost of the socks after tax was $" + totalSocksCostAT$ + "0");
    System.out.println("The total cost of the glasses after tax was $" + totalGlassesCostAT$);
    System.out.println("The total cost of the envelopes after tax was $" + totalEnvelopeCostAT$);
    System.out.println("");
    
    // totalling the costs
    double totalCostBT$ = totalSocksCostBT$ + totalGlassesCostBT$ + totalEnvelopeCostBT$;
    double totalCostAT$ = totalSocksCostAT$ + totalGlassesCostAT$ + totalEnvelopeCostAT$;
    
    // outputting the pre- and post- tax costs
    System.out.println("The total cost of the WalMart trip before tax was $" + totalCostBT$);
    System.out.println("The total cost of the WalMart trip after tax was $" + totalCostAT$ + "0");
  }
}
