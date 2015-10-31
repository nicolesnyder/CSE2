import java.util.Scanner;

public class b{ //define the class
    public static void main(String[] args){ 
        Scanner myScanner=new Scanner (System.in);
        
System.out.print("Enter a positive int and I computer the factorial: ");
int input=myScanner.nextInt();
while(input<=0){
    System.out.println("Input must be a positive int.");
    System.out.print("Enter a positive int and I computer the factorial: ");
    input=myScanner.nextInt();
}

int answer=factorial(input);
System.out.println("The factorial of " +input+ " is " +answer);
}

public static int factorial (int input){
    int sum=0;
    for(int i=input; i>=1; i--){
        sum=sum+i;
    }
    return sum;
}
}