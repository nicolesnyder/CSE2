import java.util.Scanner;
public class EP12{
    public static void main(String[] args){
        
Scanner myScanner = new Scanner (System.in);

System.out.print("Enter the starting velocity v0 in meters/second, the ending velocity v1 in meters/second, and the time span t in seconds");
double v0= myScanner.nextDouble();
double v1= myScanner.nextDouble();
double time = myScanner.nextDouble();
double acceleration= (((v1-v0)/time));
System.out.print("The averagle acceleration is " + acceleration);

    }
}