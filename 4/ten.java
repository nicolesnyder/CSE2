import java.util.Scanner;

public class ten{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
    //Write a test program that prompts the user to enter ten numbers, 
    //invokes this method to return the index of the smallest element, and 
    //displays the index.        
    
    double [] array = new double[10];
    System.out.print("Enter 10 numbers: ");
    for (int i=0; i<array.length; i++){
        array[i]= myScanner.nextDouble();
    }
    
    System.out.println(indexOfSmallestElement(array));
    }
    
    //Write a method that returns the index of the smallest element in an 
    //array of integers. If the number of such elements is greater than 1, 
    //return the smallest index. 
    
    public static int indexOfSmallestElement(double[] array){
        double min=array[0];
        int minIndex=0;
        for(int i=0; i<array.length; i++){
            if(min>array[i]){
                min=array[i];
                minIndex=i;
            }
        }
        return minIndex;
    }
    }
    