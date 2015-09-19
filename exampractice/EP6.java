import java.util.Scanner;

public class EP6{
public static void main(String[] args){
    
Scanner myScanner = new Scanner ( System.in );   

System.out.print("Enter the radius of a cylinder ");
double radius = myScanner.nextDouble();
System.out.print("Enter the length of a cylinder ");
double length = myScanner.nextDouble();

double area = radius * radius * 3.14;
double volume = area * length;

System.out.println("The area is " + area);
System.out.println("The volume is " + volume);
}
}