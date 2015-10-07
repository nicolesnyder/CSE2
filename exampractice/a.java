//Nicole Snyder
//CSE2 
//hw6 CheckDigit
//prompt digit to enter ten digit isbn
//if number is not valid ISBN, determine a check digit that would make the number a valid ISBN
//use letter X to reprepsent check digit of 10
    

import java.util.Scanner;

public class CheckDigit{ //define a class
    public static void main(String[] args){ //add a main method
        Scanner myScanner = new Scanner (System.in);

//ask for user unput
System.out.print("Please enter a 10 digit barcode: ");
String ISBN= myScanner.nextInt();

//calculate each digit
int one=(int)(ISBN/1000000000);
int two=((int)(ISBN/100000000))%10;
int three=((int)(ISBN/10000000))%10;
int four=((int)(ISBN/1000000))%10;
int five=((int)(ISBN/100000))%10;
int six=((int)(ISBN/10000))%10;
int seven=((int)(ISBN/1000))%10;
int eight=((int)(ISBN/100))%10;
int nine=((int)(ISBN/10))%10;

//calculates
int remainder= ((10*one)+(9*two)+(8*three)+(7*four)+(6*five)+(5*six)+(4*seven)+(3*eight)+(2*nine)) %11;
//calculates check digit
int checkDigit= (ISBN%10);

//if statement determining whether ISBN is valid
if (remainder==checkDigit){
    System.out.println("The ISBN is vaild");
}

else if (checkDigit==0) {
    System.out.println("This is NOT a valid ISBN. Check digit should be X.");
}

//ISBN is not valid. Asks for a valid input
System.out.println("This is a valid NOT a valid ISBN. Please enter 10 digits: ");
//Tells what the check digit should be
System.out.println("This is not a valid ISBN. Check digit should be: ");

}
}



