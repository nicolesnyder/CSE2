import java.util.Scanner;

public class EP23{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        
System.out.println("Enter the month and year: ");
int month = myScanner.nextInt();
int year = myScanner.nextInt();
int days = 0;
String monthName="";
boolean isLeapYear= (year % 4 == 0 && year % 100 != 0) || (year % 100 == 0);


switch (month){
    case 1: days=31;
            monthName= "january"; break;
    case 2: if (isLeapYear){
        days=29; }
        else{
            days=28;}
            monthName= "febuary"; break;
    case 3: days=31;
            monthName= "march"; break;
    case 4: days=30; 
            monthName= "april"; break;
    case 5: days=31; 
            monthName= "may"; break;
    case 6: days=30; 
            monthName= "june"; break;
    case 7: days=31; 
            monthName= "july"; break;
    case 8: days=30; 
            monthName= "august"; break;
    case 9: days=31; 
            monthName= "september"; break;
    case 10: days=30;
            monthName= "october"; break;
    case 11: days=31; 
            monthName= "november"; break;
    case 12: days=30; 
            monthName= "december"; break;
}

System.out.println(monthName + " " + year + " had " + days + " days.");
}
}

