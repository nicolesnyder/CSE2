
import java.util.Scanner;

public class thirty{ //define the class
    public static void main(String[] args){ //create a main method
    Scanner myScanner= new Scanner (System.in);

int input;

do{
    System.out.print("Input a positive integer (0 to exit): ");
    input=myScanner.nextInt();
    if (input<0){
        System.out.println("Invald");
        System.out.println("Input a positive integer (0 to exit): ");
        input=myScanner.nextInt();
    }
    else if(input>0){
        if (isPrime(input)){
            System.out.println(" Prime!");
        }
        else{
            System.out.println(" Not prime");
        }
    }
}
while (input != 0);
System.out.println("Goodbye");
}

public static boolean isPrime (int input){
    boolean prime=true;
    double squareRoot=Math.sqrt(input);
    for (int i=2; i<(int)squareRoot; i++){
        if(input%i==0){
            prime=false;
            break;
        }
    }
    return prime;
}
}



	