//Nicole Snyder
//CSE2 hw02 Welcome Class

public class Arithmetic{ //define the class
	public static void main(String [] args){ //add a main method
// begin printing desired output

//Number of pairs of socks
int nSocks=3;
//Cost per pair of socks
//(‘$’ is part of the variable name)
double sockCost$=2.58;
double totalSockCost$=nSocks*sockCost$; //total cost of three pairs of socks
double taxPercent=0.06; 
double taxOfSockCost$=(int)((taxPercent*totalSockCost$)*100);
double finalTaxOfSock$=taxOfSockCost$/100;
double totalCostOfSocksWithTax$=finalTaxOfSock$+totalSockCost$;



//Number of drinking glasses
int nGlasses=6;
//Cost per glass
double glassesCost$=2.29;
double totalGlassesCost$=nGlasses*glassesCost$; //total cost of 6 glasses
double taxOfGlassesCost$=(int)((taxPercent*totalGlassesCost$)*100);
double finalTaxOfGlasses$=taxOfGlassesCost$/100;
double totalCostOfGlassesWithTax$=finalTaxOfGlasses$+totalGlassesCost$;


//Number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopesCost$=3.25;
double totalEnvelopesCost$=nEnvelopes*envelopesCost$; //total cost of 1 Envelope
double taxOfEnvelopesCost$=(int)((taxPercent*totalEnvelopesCost$)*100);
double finalTaxOfEnvelopes$=taxOfEnvelopesCost$/100;
double totalCostOfEnvelopesWithTax$=finalTaxOfEnvelopes$+totalEnvelopesCost$;

System.out.println("Total cost of socks "+totalSockCost$);
System.out.println("Sales tax of socks "+finalTaxOfSock$);
System.out.println("Total cost of glasses "+totalGlassesCost$);
System.out.println("Sales tax of glasses "+finalTaxOfGlasses$);
System.out.println("Total cost of envelopes "+totalEnvelopesCost$);
System.out.println("Sales tax of envelopes "+finalTaxOfEnvelopes$);
double transactionTotal=totalSockCost$+totalGlassesCost$+totalEnvelopesCost$;
double totalTax=finalTaxOfSock$+finalTaxOfGlasses$+finalTaxOfEnvelopes$;
System.out.println("Purchase total (before tax) "+transactionTotal);
System.out.println("Tax total "+(finalTaxOfSock$+finalTaxOfGlasses$+finalTaxOfEnvelopes$));
System.out.println("Final price "+(transactionTotal+totalTax));



	}//closes main method
}//closes class