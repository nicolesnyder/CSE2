import java.util.Scanner;
public class C4{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
System.out.print("Enter a, b, c, d, e, f: ");
double a= myScanner.nextDouble();
double b= myScanner.nextDouble();
double c= myScanner.nextDouble();
double d= myScanner.nextDouble();
double e= myScanner.nextDouble();
double f= myScanner.nextDouble();

double x= (((e*d)-(b*f))/((a*d)-(b*c)));
double y= (((a*f)-(e*c))/((a*d)-(b*c)));

if (((a*d)-(b*c))==0){
    System.out.println("The equation has so solution");
}
else{
    System.out.println("x is " + x + " and y is " + y);    
}
        
    }
}