import java.util.Scanner;

public class EP9{
    public static void main(String[] args){
        
Scanner myScanner = new Scanner (System.in);

System.out.print("Enter the subtotal and gratuity rate: ");
double subtotal = myScanner.nextDouble();
double gratuityPercent = myScanner.nextDouble();
double gratuityFinal = ((gratuityPercent/100) * subtotal);
double subtotalFinal = gratuityFinal + subtotal;

System.out.print("The gratuity is $" + gratuityFinal + " and total is $" + subtotalFinal);


    }
}