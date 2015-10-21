import java.util.Scanner;

public class divisible{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
//Write a program that displays all the numbers from 100 to 1,000, 
//ten per line, that are divisible by 5 and 6. Numbers are separated 
//by exactly one space.

int count=10;

for (int i=100; i<=1000; i++){
     if(i%6==0 && i%5==0){
        if (count<10){
            System.out.print(i+ " ");
            count++;
        }
        if (count==10){
            System.out.println();
            count=0;
        }    
    }
}    


}
}