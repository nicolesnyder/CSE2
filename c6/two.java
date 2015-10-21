//Write a method that computes the sum of the digits in an integer. 
//Use the following method header:
//For example, sumDigits(234) returns 9 (2 + 3 + 4). 
//(Hint: Use the % operator to extract digits, and the / operator to
//remove the extracted digit. For instance, to extract 4 from 234, 
//use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10 (= 23). 
//Use a loop to repeatedly extract and remove the digit until all the 
//digits are extracted. Write a test program that prompts the user to 
//enter an integer and dis- plays the sum of all its digits.


import java.util.Scanner;

public class two{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);

System.out.print("Enter an integer: ");
int input=myScanner.nextInt();
System.out.println("The sum of all the digits is " +sumDigits(input));
}

public static int sumDigits(int n){
    int sum=0;
    int rem;
    while (n>0){
        rem=n%10;
        sum+=rem;
        n=n/10;
    }
    return sum;
}
}