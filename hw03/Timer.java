//Nicole Snyder
//9-15-15
//CSE2 hw03 Timer

import java.util.Scanner;
public class Timer{ //define the class
	public static void main(String [] args){ //add a main method
	
//asks user for current time and what time they are going to dinner
//tells the user how long until dinner time
Scanner myScanner = new Scanner( System.in );
//asks user for the current time and the time they will be eating
System.out.print("Enter the current time (in the form of HHMM): ");
int currentTime = myScanner.nextInt();
System.out.print("Enter the time you will be eating dinner (in the form HHM): " );
int dinnerTime = myScanner.nextInt();

//find out time until dinner 
int timeUntilDinner = dinnerTime - currentTime;
int hours, //hours
        minutes; //minutes

System.out.println("You have " +(timeUntilDinner/100)+ " hours and " + (timeUntilDinner-((timeUntilDinner/100)*100))+ " minutes until dinner");


    }  //end of main method   
} //end of class

