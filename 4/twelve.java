//The reverse method in Section 6.7 reverses an array by copying it to a new 
//array. Rewrite the method that reverses the array passed in the argument and 
//returns this array. Write a test program that prompts the user to enter ten 
//numbers, invokes the method to reverse the numbers, and displays the numbers.

import java.util.Scanner;

public class twelve{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
        int [] array = new int [10];
        System.out.print("Enter 10 numbers: ");
        for(int i=0; i<array.length; i++){
            array[i]=myScanner.nextInt();
        }
        
        reverse(array);
        
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println(" ");
    }
        
        
        
    public static int [] reverse(int [] array){
        for(int i=0, j=array.length-1; i<array.length/2; i++, j--){
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        return array;
    }
}

