import java.util.Scanner;
    public class C3{
        public static void main(String[] args){
            Scanner myScanner = new Scanner (System.in);
            
            System.out.print("Enter a, b, c: ");
            double a = myScanner.nextDouble();
            double b = myScanner.nextDouble();
            double c = myScanner.nextDouble();
            double d = ((b * b) - (4 * a * c));
            double r1 = (-b + (Math.pow(d, 0.5)))/2*a;
            double r2 = (-b - (Math.pow(d, 0.5)))/2*a;
            
            if (d>0){
                System.out.println("The roots are " + r1 + " and " + r2);
            }    
            else if (d==0){
                System.out.println("The root is " + r1);
            }
            else {
                System.out.println("There are no real roots");
        }
        }
    }