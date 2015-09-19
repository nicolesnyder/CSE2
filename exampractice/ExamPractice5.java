import java.util.Scanner; 

public class ExamPractice5{
public static void main(String[] args){
    
Scanner myScanner = new Scanner( System.in );

//enter degrees in celcius 
System.out.print("Enter a degree in celcius: ");
double celcius = myScanner.nextDouble();
double farenheit = ((9.0/5) * celcius) + 32;
System.out.print(celcius + " Celcius is " + farenheit + " farenheit");

}
}




    
