//A pentagonal number is defined as n(3n–1)/2 for n = 1, 2, . . ., and so 
//on. Therefore, the first few numbers are 1, 5, 12, 22, . . .. 
//Write a method with the following header that returns a pentagonal number:

//Write a test program that uses this method to display the first 100 pentagonal 
//numbers with 10 numbers on each line.

import java.util.Scanner;

public class one{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
int n=100;        
int count=0;

for (int i=1; i<=n; i++){
    if(count<10){
        System.out.print(getPentagonalNumber(i)+ " ");
        count++;
    }
    if(count==10){
        System.out.println();
        count=0;
    }
}
}


public static int getPentagonalNumber(int n){
    return (n*(3*n-1))/2;
}
}