//Nicole Snyder
//CSE2 
//hw6 BarGraph
//part 1:
    //input expeces for each day of the week for one deek
    //print a simple bar graph/visualization representing your weekly expenses
    

import java.util.Scanner;

public class BarGraph{ //define a class
    public static void main(String[] args){ //add a main method
        Scanner myScanner = new Scanner (System.in);


       
System.out.print("Expenses for Monday: $"); //asks user for input
    double monday=0;
    while (!myScanner.hasNextDouble()){ //did not recieve a number, ask to try again
            System.out.print("Sorry, you did not enter a number. Please try again: $");
            myScanner.next();
        }
    if (myScanner.hasNextDouble()){
        monday=myScanner.nextDouble();
        while (monday<0){ //get a number less than 0, ask for a postivie number
            System.out.print("Pease enter a positive number! Please try again: $");
            myScanner.next();
        }
    }
    
System.out.print("Expenses for Tuesday: $"); //asks user for input
    double tuesday=0;
    while (!myScanner.hasNextDouble()){ //did not recieve a number, ask to try again
            System.out.print("Sorry, you did not enter a number. Please try again: $");
            myScanner.next();
        }
    if (myScanner.hasNextDouble()){
        tuesday=myScanner.nextDouble();
        while (tuesday<0){ //get a number less than 0, ask for a postivie number
            System.out.print("Pease enter a positive number! Please try again: $");
            myScanner.next();
        }
    }

System.out.print("Expenses for Wednesday: $"); //asks user for input
    double wednesday=0;
    while (!myScanner.hasNextDouble()){ //did not recieve a number, ask to try again
            System.out.print("Sorry, you did not enter a number. Please try again: $");
            myScanner.next();
        }
    if (myScanner.hasNextDouble()){
        wednesday=myScanner.nextDouble();
        while (wednesday<0){ //get a number less than 0, ask for a postivie number
            System.out.print("Pease enter a positive number! Please try again: $");
            myScanner.next();
        }
    }
System.out.print("Expenses for Thursday: $"); //asks user for input
    double thursday=0;
    while (!myScanner.hasNextDouble()){ //did not recieve a number, ask to try again
            System.out.print("Sorry, you did not enter a number. Please try again: $");
            myScanner.next();
        }
    if (myScanner.hasNextDouble()){
        thursday=myScanner.nextDouble();
        while (thursday<0){ //get a number less than 0, ask for a postivie number
            System.out.print("Pease enter a positive number! Please try again: $");
            myScanner.next();
        }
    }

System.out.print("Expenses for Friday: $"); //asks user for input
    double friday=0;
    while (!myScanner.hasNextDouble()){ //did not recieve a number, ask to try again
            System.out.print("Sorry, you did not enter a number. Please try again: $");
            myScanner.next();
        }
    if (myScanner.hasNextDouble()){
        friday=myScanner.nextDouble();
        while (friday<0){ //get a number less than 0, ask for a postivie number
            System.out.print("Pease enter a positive number! Please try again: $");
            myScanner.next();
        }
    }

System.out.print("Expenses for Saturday: $"); //asks user for input
    double saturday=0;
    while (!myScanner.hasNextDouble()){ //did not recieve a number, ask to try again
            System.out.print("Sorry, you did not enter a number. Please try again: $");
            myScanner.next();
        }
    if (myScanner.hasNextDouble()){
        saturday=myScanner.nextDouble();
        while (saturday<0){ //get a number less than 0, ask for a postivie number
            System.out.print("Pease enter a positive number! Please try again: $");
            myScanner.next();
        }
    }

System.out.print("Expenses for Sunday: $"); //asks user for input
    double sunday=0;
    while (!myScanner.hasNextDouble()){ //did not recieve a number, ask to try again
            System.out.print("Sorry, you did not enter a number. Please try again: $");
            myScanner.next();
        }
    if (myScanner.hasNextDouble()){
        sunday=myScanner.nextDouble();
        while (sunday<0){ //get a number less than 0, ask for a postivie number
            System.out.print("Pease enter a positive number! Please try again: $");
            myScanner.next();
        }
    }

//declare doubles
double mon= monday;
double tues= tuesday;
double wed= wednesday;
double thurs=thursday;
double fri= friday;
double sat= saturday;
double sun= sunday;

System.out.print("Mon: "); //this prints the title in the bar graph
while (mon>=.50){ //this while loops keeps adding "*" to the graph and subtracts 1 until mon becomes <0.5 and properly rounds
    System.out.print("*"); 
    mon--;
}

System.out.println(); //goes to next line
System.out.print("Tues: "); //this prints the title in the bar graph
while (tues>=.50){ //this while loops keeps adding "*" to the graph and subtracts 1 until tues becomes <0.5 and properly rounds
    System.out.print("*");
    tues--;
}

System.out.println(); //goes to next line
System.out.print("Wed: "); //this prints the title in the bar graph
while (wed>=.50){ //this while loops keeps adding "*" to the graph and subtracts 1 until wed becomes <0.5 and properly rounds
    System.out.print("*");
    wed--;
}

System.out.println(); //goes to next line
System.out.print("Thurs: "); //this prints the title in the bar graph
while (thurs>=.50){ //this while loops keeps adding "*" to the graph and subtracts 1 until thurs becomes <0.5 and properly rounds
    System.out.print("*");
    thurs--;
}

System.out.println(); //goes to next line
System.out.print("Fri: "); //this prints the title in the bar graph
while (fri>=.50){ //this while loops keeps adding "*" to the graph and subtracts 1 until fri becomes <0.5 and properly rounds
    System.out.print("*");
    fri--;
}

System.out.println(); //goes to next line
System.out.print("Sat: "); //this prints the title in the bar graph
while (sat>=.50){ //this while loops keeps adding "*" to the graph and subtracts 1 until sat becomes <0.5 and properly rounds
    System.out.print("*");
    sat--;
}

System.out.println(); //goes to next line
System.out.print("Sun: "); //this prints the title in the bar graph
while (sun>=.50){ //this while loops keeps adding "*" to the graph and subtracts 1 until sun becomes <0.5 and properly rounds
    System.out.print("*");
    sun--;
}

System.out.println("");
System.out.println("");
//calculate the average
double average= (monday+tuesday+wednesday+thursday+friday+saturday+sunday)/7 ;
//print the average
System.out.printf("Your average daily expenses are:  $ %3.2f\n", average);

int count=0; //adds 1 to it each loop it goes through
int ran=0; //creates a random variable
double percent=0; //creates percent
double sum=average; //sets sum equal to average

while (count<207){//208 weeks in 4 years, we want to calculate for all of college
    ran=(int)(Math.random()*41)-20; //we are ranging from -20 to +20
    percent=(ran/100.00); //calculating the percent and converting to a double
    sum+= (percent * average) +average; 
    count++; //continues to add 1 to the loop until the loop is done
}

//prints estimated expenses for four years
System.out.printf("Estimated expedentures for four years is: $ %4.2f\n", sum);

    }
}