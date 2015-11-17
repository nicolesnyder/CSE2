import java.util.Scanner;

public class four{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
double [] scores = new double [100];
double sum = 0;
int count = 0;
double input;

do{
    System.out.print("Enter the score: ");
    input=myScanner.nextDouble();
    
    if (input>=0){
        scores[count]= input;
        sum+= input;
        count++;
    }
}
while (input>=0);


double average = sum/count;
int above= 0;
int below= 0;

for (int i=0; i<count; i++){
    if (scores[i] >= average){
        above++;
    }
    else{
        below++;
    }
}

System.out.println("The average is: " +average);
System.out.println("The amount above is: " +above);
System.out.println("The amount below is: " +below);

}
}


