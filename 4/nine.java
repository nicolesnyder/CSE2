import java.util.Scanner;

public class nine{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        

//Write a method that finds the smallest element in an array of double values 
//using the following header:
//public static double min(double[] array)
//Write a test program that prompts the user to enter ten numbers, invokes 
//this method to return the minimum value, and displays the minimum value. 
//Here is a sample run of the program:

double [] list= new double [10];
System.out.print("Enter 10 numbers: ");
for(int i=0; i<list.length; i++){
    list[i]=myScanner.nextDouble();
}

System.out.println(min(list));
}

public static double min(double[] array){
    double min=array[0];
    for(int i=0; i<array.length; i++){
        if(min>array[i]){
            min=array[i];
        }
    }
    return min;
}
}