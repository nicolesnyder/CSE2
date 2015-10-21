//Write a program that prompts the user to enter the year and first day 
//of the year and displays the calendar table for the year on the console. 
//For example, if the user entered the year 2013, and 2 for Tuesday, 
//January 1, 2013, your program should display the calendar for each 
//month in the year

import java.util.Scanner;

public class calender{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
System.out.print("Enter the year: ");
int year=myScanner.nextInt();
System.out.print("Enter the first day of the year: ");
int firstDay=myScanner.nextInt();

for(int month=1; month<=12; month++){
    System.out.print("\t\t" month+ " " + year);
    
}