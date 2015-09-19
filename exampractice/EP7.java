import java.util.Scanner;

public class EP7{
public static void main(String [] args){
    
Scanner myScanner = new Scanner ( System.in );

System.out.print("Enter a number in feet ");
double feet = myScanner.nextDouble();
double meters = feet * 0.305;
System.out.print(feet + " feet is " + meters + " meters");


}
} 
