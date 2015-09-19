import java.util.Scanner;
public class EP14{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
System.out.print("Enter the monthly saving amount: ");
double savings = myScanner.nextDouble();
double interestRate = 0.00417;
double firstMonth = (savings * (1+ interestRate));
double secondMonth = ((firstMonth + savings) * (1 + interestRate));
double thirdMonth = ((secondMonth + savings) * (1 + interestRate));
double fourthMonth = ((thirdMonth + savings) * (1 + interestRate));
double fifthMonth = ((fourthMonth + savings) * (1 + interestRate));
double sixthMonth = ((fifthMonth + savings) * (1 + interestRate));
int dollars, dimes, pennies;
dollars = (int)(sixthMonth);
dimes=(int)(sixthMonth * 10) % 10;
pennies=(int)(sixthMonth * 100) % 10;
System.out.print("After the sixth month the account value is $" + dollars + "." + dimes + pennies);
    }
}