import java.util.Scanner;

public class EP20{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );

//enter weight and height
System.out.print("Enter weight in pounds: ");
double pounds= myScanner.nextDouble();
System.out.print("Enter feet: ");
double feet= myScanner.nextDouble();
System.out.print("Enter inches: ");
double inches= myScanner.nextDouble();

//convert
double kilograms= pounds*0.45359237;
double totalInches= (feet*12) + inches;
double meters= totalInches*0.0254;

//calculate bmi
double bmi= (kilograms)/(Math.pow(meters, 2));
System.out.println("BMI is " + bmi);

if (bmi<18.5){
    System.out.println("Underweight");
}
else if (bmi<25){
    System.out.println("Normal");
}
else if (bmi<30){
    System.out.println("Overweight");
}
else{
    System.out.println("Obese");
}
    }
}