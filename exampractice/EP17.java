import java.util.Scanner;
public class EP17{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
//enter investment amount, annual interest rate, number of years        
System.out.print("Enter invesment amount: ");
double investment= myScanner.nextDouble();
System.out.print("Enter annual interest rate in percentage: ");
double annualPercentage= myScanner.nextDouble();
System.out.print("Enter number of years: ");
double years= myScanner.nextDouble();

//caculate
double annual= annualPercentage/100;
double monthly= annual/12;
double futureInvestmentValue= investment * (Math.pow ((1+monthly), (years*12)));
int dollars, dimes, pennies;
dollars = (int)(futureInvestmentValue);
dimes= (int)(futureInvestmentValue*10)%10;
pennies= (int)(futureInvestmentValue*100)%10;

System.out.println("Accumulated value is $" + dollars + "." + dimes + pennies);
    }
}
