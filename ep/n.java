//Use a while loop to find the smallest integer n such that n2 is 
//greater than 12,000.

import java.util.Scanner;

public class n{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);

int smallest=0;
int count=1;

while((count*count)<=12000){
    if (count>smallest){
        smallest=count;
        count++;
    }
}    
System.out.println("The samellest integer is " + smallest);
    
}
}
        

        
