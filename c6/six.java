//Write a method to display a pattern as follows:


import java.util.Scanner;

public class six{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        

int n;
System.out.print("Enter an integer: ");
n=myScanner.nextInt();
displayPattern(n);
}
        
        
public static void displayPattern(int n){
    int temp;
    temp=n;
    for(int i=1; i<=n; i++){
        for(int j=1; j<temp; j++)
            System.out.print(" ");
            for(int k=i; k>0; k--)
                System.out.print(k);
                System.out.println();
                temp=temp-1;
        
    
    }
    
}
}


