import java.util.Scanner;

public class EP21{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        
System.out.print("Enter the first 9 digits of an ISBN as integer: ");
 int d1, d2, d3, d4, d5, d6, d7, d8, d9;
 d1= myScanner.nextInt();
 d2= myScanner.nextInt();
 d3= myScanner.nextInt();
 d4= myScanner.nextInt();
 d5= myScanner.nextInt();
 d6= myScanner.nextInt();
 d7= myScanner.nextInt();
 d8= myScanner.nextInt();
 d9= myScanner.nextInt();

int checksum= (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;

if (checksum==10){
    System.out.println("The ISBN-10 is "+ d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
}

else{ 
    System.out.println("The ISBN-10 is "+ d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + checksum);
}

}
}