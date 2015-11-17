//Write two overloaded methods that return the average of an array with the 
//following headers:

//Write a test program that prompts the user to enter ten double values, 
//invokes this method, and displays the average value.

import java.util.Scanner;

public class eight{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);

double [] array = new double [10];
System.out.print("Enter 10 numbers: ");
for(int i=0; i<array.length; i++){
    double num=myScanner.nextDouble();
    array[i]=num;
}

System.out.println(average(array));
}


public static int average(int[] array){
    int sum=0;
    for(int i=0; i<array.length; i++){
        sum=array[i]+sum;
    }
    int average=sum/array.length;
    return average;
}

public static double average(double[] array){
    double sum=0;
    for(int i=0; i<array.length;i++){
        sum=array[i]+sum;
    }
    double average=sum/array.length;
    return average;
}
}