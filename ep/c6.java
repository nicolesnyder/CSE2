import java.util.Scanner;

public class c6{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);

System.out.println("Enter an integer, the inpur ends it it is 0: ");
int positive=0;
int negative=0;
int total=0;
double average=0.0;
int value;
int numOfValues=0;

do{
    value=myScanner.nextInt();
    if (value>0){
        positive++;
        numOfValues++;
        total+=value;
    }
    else if(value<0){
        negative++;
        numOfValues++;
        total+=value;
    }
}

while(value!=0);
average=total/(numOfValues*1.0);

System.out.println("The number of positives is " +positive);
System.out.println("The number of negatives is " +negative);
System.out.println("The toal is "+ total);
System.out.println("The average is "+average);
    

}
}


