//Write a program that prompts the user to enter 10 integers and displays all 
//combinations of picking two numbers from the 10.

import java.util.Scanner;

public class twentyeight {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);    
    System.out.print("Enter ten integers: ");
    final int N = 10;
    int[] numbers = new int[N];
    for(int i=0; i<numbers.length; i++){
        numbers[i]=myScanner.nextInt();
    }
    for(int i=0; i<numbers.length; i++){
        for(int j=i+1; j<numbers.length; j++){
            System.out.println(numbers[i]+ " " +numbers[j]);
        }
    }
  }
}
