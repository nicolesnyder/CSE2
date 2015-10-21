//Write a method with the following header to display three 
//numbers in increasing order:
//public static void displaySortedNumbers( double num1, double num2, double num3)
//Write a test program that prompts the user to enter three numbers 
//and invokes the method to display them in increasing order.


import java.util.Scanner;

public class five{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);

double num1;
double num2;
double num3;
System.out.print("Enter three numbers: ");
num1=myScanner.nextDouble();
num2=myScanner.nextDouble();
num3=myScanner.nextDouble();

displaySortedNumbers(num1, num2, num3);
}

public static void displaySortedNumbers ( double num1, double num2, double num3){
    if(num1>num2 && num1>num3 && num2>num3){
        System.out.println(num1+ "," +num2+ "," +num3);
    }
    if(num1>num2 && num1>num3 && num3>num2){
        System.out.println(num1+ "," +num3+ "," +num2);
    }
    if(num2>num1 && num2>num3 && num1>num3){
        System.out.println(num2+ "," +num1+ "," +num3);
    }
    if(num2>num1 && num2>num3 && num3>num1){
        System.out.println(num2+ "," +num3+ "," +num1);
    }
    if(num3>num2 && num3>num1 && num1>num2){
        System.out.println(num3+ "," +num1+ "," +num2);
    }
    if(num3>num2 && num3>num1 && num2>num1){
        System.out.println(num3+ "," +num2+ "," +num1);
    }
}

}