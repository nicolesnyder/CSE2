import java.util.Scanner;

public class EP27{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        
System.out.print("Enter three porints for p0, p1, and p2: ");
double x0= myScanner.nextDouble();
double y0= myScanner.nextDouble();
double x1= myScanner.nextDouble();
double y1= myScanner.nextDouble();
double x2= myScanner.nextDouble();
double y2= myScanner.nextDouble();
double distance= ((x1-x0)*(y2-y0))-((x2-x0)*(y1-y0));

if (distance>0){
    System.out.println("(" +x2 + ", " + y2 + ") is on the left side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
}

else if (distance==0){
    System.out.println("(" + x2 + ", " + y2 + ") is on the same line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
}

else {
    System.out.println("(" + x2 + ", " + y2 + ") is on the right side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
}
}
}