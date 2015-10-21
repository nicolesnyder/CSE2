//Write the methods with the following headers
// Return the reversal of an integer, i.e., reverse(456) returns 654
//public static int reverse(int number)
// Return true if number is a palindrome
//public static boolean isPalindrome(int number)
//Use the reverse method to implement isPalindrome. 
//A number is a palin- drome if its reversal is the same as itself. 
//Write a test program that prompts the user to enter an integer and 
//reports whether the integer is a palindrome.

import java.util.Scanner;

public class three{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);

int number;
boolean ispalindrome;


System.out.print("Enter an integer: ");
number=myScanner.nextInt();
ispalindrome=(isPalindrome(number));

if(ispalindrome==true){
    System.out.println("The number you entered is a palindrome!");
}

else{
    System.out.println("The number you entered is not a palindrome :(");
}
}


        
public static int reverse(int number){
    int rem;
    int rev=0;
    while(number>0){
        rem=number%10;
        rev=rev*10 + rem;
        number=number/10;
    }
    return rev;
}

public static boolean isPalindrome(int number){
    int rev= (reverse(number));
    if (rev==number){
        return true;
    }
    else{
        return false;
    }
}

}




 