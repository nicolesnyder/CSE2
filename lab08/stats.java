//Write a program, Stats.java, whose main method asks the user to 
//input 5 doubles, from smallest to largest.  Assume that the user always
//types in doubles - you don’t need to worry about checking to make sure 
//that the input is a double.  However, you do need to check to make sure 
//that the doubles are increasing.  After recording the inputs, compute the 
//mean of the 5 doubles, the median of the 5 doubles, and then print out the
//mean and the median.

import java.util.Scanner;

public class stats{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
System.out.print("Enter your first double: ");
double num1= myScanner.nextDouble();
System.out.print("Enter your second double: ");
double num2=0;
boolean greater1=true;
while(greater1){
    num2=myScanner.nextDouble();
    if(num1<num2){
        greater1=true;
        break;
    }
    else{
         System.out.print("Please enter a double greater than the frist: ");
         greater1=true;
    }
}

System.out.print("Enter your third double: ");
double num3=0;
boolean greater2=true;
while(greater2){
    num3=myScanner.nextDouble();
    if(num2<num3){
        greater2=true;
        break;
    }
    else{
         System.out.print("Please enter a double greater than the second: ");
         greater2=true;
    }
}

System.out.print("Enter your fourth double: ");
double num4=0;
boolean greater3=true;
while(greater3){
    num4=myScanner.nextDouble();
    if(num3<num4){
        greater3=true;
        break;
    }
    else{
         System.out.print("Please enter a double greater than the third: ");
         greater3=true;
    }
}

System.out.print("Enter your fifth double: ");
double num5=0;
boolean greater4=true;
while(greater4){
    num5=myScanner.nextDouble();
    if(num4<num5){
        greater4=true;
        break;
    }
    else{
         System.out.print("Please enter a double greater than the fourth: ");
         greater4=true;
    }
}


double finalMean= mean(num1, num2, num3, num4, num5);
double finalMedian= median(num1, num2, num3, num4, num5);
print (finalMean, finalMedian);

}

public static double mean(double num1, double num2, double num3, double num4, double num5){
    return (num1+num2+num3+num4+num5)/5;
}

public static double median(double num1, double num2, double num3, double num4, double num5){
    return num3;
}

public static void print (double mean, double median){
    double meanResult=mean;
    double medianResult=median;
    System.out.println("The mean of the 5 numbers is " +meanResult);
    System.out.println("The median of the 5 numbers is " +medianResult);
}


}