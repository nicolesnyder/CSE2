import java.util.Scanner;

public class EP18{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
System.out.print("Enter an integer: ");
int integer= myScanner.nextInt();
int dollars= integer/100;
int remainingAmount= integer % 100;
System.out.println("Your integer " + integer + " consists of " + dollars + " dollars and " + remainingAmount + " cents");
    }
}