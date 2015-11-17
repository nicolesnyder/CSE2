import java.util.Scanner;
    public class four {
        public static void main(String args[]) {
        Scanner myScanner= new Scanner(System.in);
        
//Write a program that reads an unspecified number of scores and determines 
//how many scores are above or equal to the average and how many scores are 
//below the average. Enter a negative number to signify the end of the input. 
//Assume that the maximum number of scores is 100.

double [] scores= new double [100];
double sum=0;
int count=0;
double input;

do{
    System.out.print("Enter the score: ");
    input=myScanner.nextDouble();
    
    if (input>=0){
        scores[count]=input;
        sum=sum+input;
        count++;
    }
}
while (input>=0);

double average=sum/count;
int indexAbove=0;
int indexBelow=0;

for(int i=0; i<count; i++){
    if(scores[i]>=average){
        indexAbove++;
    }
    else{
        indexBelow++;
    }
}

System.out.println("The average is: " +average);
System.out.println("Above: " +indexAbove);
System.out.println("Below: " +indexBelow);

}
}




