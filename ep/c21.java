import java.util.Scanner;

public class c21{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
System.out.print("Enter the year: ");
int year= myScanner.nextInt();
System.out.print("Enter the first day of the year: ");
int day=myScanner.nextInt();
int num=0;

for (int month=1; month<=12; month++){
    switch(month){
    case 1:
        System.out.print("January 1, " + year+ " is");
        num=31;
        break;
    case 2:
        System.out.print("February 1, " + year+ " is");
        num=28;
        break;
    case 3:
        System.out.print("March 1, " + year+ " is");
        num=31;
        break;
    case 4:
        System.out.print("April 1, " + year+ " is");
        num=30;
        break;
    case 5:
        System.out.print("May 1, " + year+ " is");
        num=31;
        break;
    case 6:
        System.out.print("June 1, " + year+ " is");
        num=30;
        break;
    case 7:
        System.out.print("July 1, " + year+ " is");
        num=31;
        break;
    case 8:
        System.out.print("August 1, " + year+ " is");
        num=30;
        break;
    case 9:
        System.out.print("September 1, " + year+ " is");
        num=31;
        break;
    case 10:
        System.out.print("October 1, " + year+ " is");
        num=30;
        break;
    case 11:
        System.out.print("November 1, " + year+ " is");
        num=31;
        break;
    case 12:
        System.out.print("December 1, " + year+ " is");
        num=30;
        break;
    }
    
    switch(day){
        case 0:
            System.out.println(" Sunday");
            break;
        case 1: 
            System.out.println(" Monday");
            break;
        case 2:
            System.out.println(" Tuesday");
            break;
        case 3: 
            System.out.println(" Wednesday");
            break;
        case 4:
            System.out.println(" Thursday");
            break;
        case 5: 
            System.out.println(" Friday");
            break;
        case 6:
            System.out.println(" Saturday");
            break;
     }
     day= (day+num)%7;
}

}
}

