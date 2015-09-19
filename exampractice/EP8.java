import java.util.Scanner;

public class EP8{
    public static void main(String[] args){
        
Scanner myScanner = new Scanner ( System.in );        

System.out.print("Ener a number in pounds ");
double pounds = myScanner.nextDouble();
double kilograms = pounds*0.454;
System.out.print(pounds+ " pounds is " + kilograms + "kilograms");
        
    }
}