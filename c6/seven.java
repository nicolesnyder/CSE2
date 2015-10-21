import java.util.Scanner;

public class seven{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        

double celsius=40.0;
double fahrenheit=120.0;

System.out.println("Celcius \t Fahrenheit \t|\t Fahrenheit \t Celcius");
for(celsius=40.0, fahrenheit=120.0; celsius>=31.0; celsius--, fahrenheit-=10){
    System.out.println(celsius+ "\t" +celsiusToFahrenheit(celsius)+ "\t|\t" +fahrenheit+ "\t" +fahrenheitToCelsius(fahrenheit));
}
}


        

public static double celsiusToFahrenheit(double celsius){
    return (9.0 / 5) * celsius + 32;
}

public static double fahrenheitToCelsius(double fahrenheit){
     return (5.0 / 9) * (fahrenheit - 32);
}

}
     