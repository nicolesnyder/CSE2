//Write a method with the following header to display an integer in 
//reverse order:

import java.util.Scanner;

public class four{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);


int number;
System.out.print("Enter an integer ");
number=myScanner.nextInt();
System.out.print(number+ " reversed is ");
reverse(number);
}

        
public static void reverse(int number){
    int rem;
    int rev=0;
    while(number>0){
        rem=number%10;
        rev= rev*10+rem;
        number=number/10;
    }
    System.out.println(rev);
}
}