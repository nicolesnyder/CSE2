import java.util.Scanner;

public class EP22{
    public static void main(String[] args){
         Scanner myScanner = new Scanner( System.in );
       
        
int number1=(int)(Math.random()*100);
int number2=(int)(Math.random()*100);

System.out.println("What is " + number1 + "+" + number2 + "?");
int sum= number1+number2;
int userAnswer=myScanner.nextInt();

if (sum==userAnswer){
    System.out.println("You are correct!");
}

else{
    System.out.println("You are incorrect :(");
    System.out.println(number1 + "+" + number2 + " is " + sum);
}
}
}