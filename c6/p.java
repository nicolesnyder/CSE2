import java.util.Scanner;

public class p{ //define the class
    public static void main(String[] args){ //create a main method
    Scanner myScanner= new Scanner (System.in);

public static int sumPow (int n){
    int answer;
    if(n<=0){
        answer=0;
    }
    else if (n==1){
        System.out.print("1+")
    }
    else if (n>2){
        for(int i=n-1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i "*" );
            }
            System.out.print("+")
        }
    }
}
}