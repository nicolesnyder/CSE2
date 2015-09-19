import java.util.Scanner;
public class C7{
    public static void main(String[] args){
       

Scanner myScanner = new Scanner (System.in);

System.out.print("Enter today's day: ");
int day= myScanner.nextInt();
System.out.print("Enter the number of days elsapsed since today: ");
int elapsed= myScanner.nextInt();

int daysAdd= day+elapsed;
int futureDay= daysAdd%7;

if (day==0){
    System.out.print("Today is Sunday");
}
else if (day==1){
    System.out.print("Today is Monday");
}
else if (day==2){
    System.out.print("Today is Tuesday");
}
else if (day==3){
    System.out.print("Today is Wednesday");
}
else if (day==4){
    System.out.print("Today is Thursday");
}
else if (day==5){
    System.out.print("Today is Friday");
}
else{
    System.out.print("Today is Saturday");
}

if (futureDay==0){
    System.out.print("and the future day is Sunday");
}
else if (futureDay==1){
    System.out.print("and the future day is Monday");
}
else if (futureDay==2){
    System.out.print("and the future day is Tuesday");
}
else if (futureDay==3){
    System.out.print("and the future day is Wednesday");
}
else if (futureDay==4){
    System.out.print("and the future day is Thursday");
}
else if (futureDay==5){
    System.out.print("and the future day is Friday");
}
else{
    System.out.print("and the future day is Saturday");
}

}
}
