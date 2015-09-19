import java.util.Scanner;
public class EP13{
    public static void main(String[] args){
        Scanner myScanner=new Scanner (System.in);
        
System.out.print("Enter the amount of water in kilograms: ");
double water = myScanner.nextDouble();
System.out.print("Enter the initial temperature: ");
double initialTemperature = myScanner.nextDouble();
System.out.print("Enter the final temperature: ");
double finalTemperature = myScanner.nextDouble();
double energy = ((water * (finalTemperature-initialTemperature)) * 4184);
System.out.print("The energy needed is " + energy);
    }
}