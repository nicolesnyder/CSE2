import java.util.Scanner;
public class C5{
    public static void main(String[] args){
       

Scanner myScanner = new Scanner (System.in);

int number1 = (int)(Math.random() * 10);
int number2 = (int)(Math.random() * 10);
int number3 = (int)(Math.random() * 10);

System.out.print("what is " + number1 + " + " + number2 + " + " + number3 + " ? ");

int answer = myScanner.nextInt();

System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + (number1+number2+number3==answer));

}
}