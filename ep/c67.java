import java.util.Scanner;

public class c67{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);

double tuition=10000;
double sum=0.0;

for (int year=1; year<=10; year+=1){
    tuition+=(tuition*0.05);
    
}
System.out.printf("The tuition in ten years is $ %.2f\n" +tuition);

    }
}
