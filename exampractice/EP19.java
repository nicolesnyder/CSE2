import java.util.Scanner;

public class EP19{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);

//entering in user input        
System.out.print("Enter the driving distance: ");
double drivingDistance= myScanner.nextDouble();
System.out.print("Enter miles per gallon: ");
double mpg= myScanner.nextDouble();
System.out.print("Enter price per gallon: ");
double ppg= myScanner.nextDouble();

//caluclations
double gallonsNeeded= drivingDistance/mpg;
double totalPrice= gallonsNeeded*ppg;
int dollars, dimes, pennies;
dollars= (int)totalPrice;
dimes= (int)(totalPrice *10)%10;
pennies= (int)(totalPrice*100)%10;

System.out.println("The cost of driving is " + dollars + "." + dimes + pennies);
    }
}