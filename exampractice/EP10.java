import java.util.Scanner;

public class EP10{
    public static void main(String[] args){
        
Scanner myScanner = new Scanner (System.in);

System.out.print("Enter a number between 0 and 1000 ");
int number = myScanner.nextInt();

int lastDigit = number % 10;
int remainingNumber = number / 10;
int secondLastDigit = remainingNumber % 10;
remainingNumber = number / 10;
int thirdLastDigit = remainingNumber % 10;

int sum= lastDigit + secondLastDigit + thirdLastDigit;
System.out.print("The sum of the digits is " + sum );
    }
}