import java.util.Scanner;

public class EP11{
    public static void main(String[] args){

Scanner myScanner = new Scanner (System.in);
        
System.out.print("Enter the number of minutes: ");
int minutes = myScanner.nextInt();
int years= (minutes/(365*24*60));
int days = ((minutes % (365*24*60))/(24*60)); 
System.out.print(minutes + " minutes is approxiametely " + years + " years and " + days + " days");
        
    }
}
