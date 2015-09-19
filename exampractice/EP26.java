import java.util.Scanner;

public class EP26{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        
System.out.print("Enter year: ");
int year= myScanner.nextInt();
System.out.print("Enter month: ");
int month= myScanner.nextInt();
System.out.print("Enter the day of the month: ");
int dayOfMonth= myScanner.nextInt();

if (month<3){
    month+=12;
    year-=1;
}

int h, q, m, j, k;
q=dayOfMonth;
m=month;
j=year/100;
k=year%100;
String dayOfWeek= "";


h=(q+(26*(m+1)/10)+k+(k/4)+(j/4)+(5*j)) % 7;

switch (h){
    case 0: dayOfWeek= "Saturday"; break;
    case 1: dayOfWeek= "Sunday"; break;
    case 2: dayOfWeek= "Monday"; break;
    case 3: dayOfWeek= "Tuesday"; break;
    case 4: dayOfWeek= "Wednesday"; break;
    case 5: dayOfWeek= "Thursday"; break;
    case 6: dayOfWeek= "Friday"; break;
}

System.out.println("Day of the week is " + dayOfWeek);
}
}
