import java.util.Scanner;

public class E1{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        
System.out.print("Enter the length from the center to a vertex: ");
double r= myScanner.nextDouble();
double side= 2*r*(Math.sin(Math.PI / 5));
double area= ((5*(Math.pow(side, 2)))/(4*(Math.tan(Math.PI / 5))));

System.out.printf("The area of the pentagon is %4.2f\n.", area);
}
}
