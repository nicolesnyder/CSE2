import java.util.Scanner; 

public class ten{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
        
double [] array= new double [10];
System.out.print("Enter 10 numbers: ");
for(int i=0; i<array.length; i++){
    array[i]= myScanner.nextDouble();
}

System.out.println("The index of the smallest number is: " +indexOfSmallestElement(array));

    }
    
public static int indexOfSmallestElement(double[] array){
    double min=array[0];
    int minIndex=0;
    for(int i=0; i<array.length; i++){
        if(array[i]<min){
            min=array[i];
            minIndex=i;
        }
    }
    return minIndex;
}
}
