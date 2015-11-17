import java.util.Scanner; 

public class eleven{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        


double [] x= new double [10];
System.out.print("Enter 10 numbers: ");
for (int i=0; i<x.length; i++){
    x[i]= myScanner.nextDouble();
}
System.out.println("The mean is " +mean(x));
System.out.println("The standard deviation is " +deviation(x));
}


/** Compute the deviation of double values */
public static double deviation(double[] x){
    double mean= mean(x);
    double sum=0;
    double den=0;
    for (int i=0; i<x.length; i++){
        den=(x[i]-mean)*(x[i]-mean);
        sum+=den;
    }
    double deviation=Math.sqrt(sum/(x.length-1));
    return deviation;
}


/** Compute the mean of an array of double values */
public static double mean(double[] x){
    double sum=0;
    for(int i=0; i<x.length; i++){
        sum+=x[i];
    }
    double average= sum/x.length;
    return average;
}

}