//Write a program that reads an integer and displays all its smallest 
//factors in increasing order. For example, if the input integer is 120, 
//the output should be as follows: 2, 2, 2, 3, 5.

import java.util.Scanner;

public class factor{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
System.out.print("Enter an integer: ");
int num=myScanner.nextInt();
int factor=2;

System.out.print("The factors for " +num+ " are ");
while(factor<=num){
    if(num%factor==0){
        num=num/factor;
        System.out.print(factor+ ", " );
    }
    else{
        factor++;
    }
}
System.out.println(" ");    
}
}
