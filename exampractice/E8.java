import java.util.Scanner;

public class E8{
      public static void main(String arg[]){
          Scanner myScanner=new Scanner (System.in);

System.out.println("Enter a 1-3 binary number: ");
int bit1, bit2, bit3, digits;
digits= myScanner.nextInt();

bit1=digits%10;
bit2=digits/10%10;
bit3=digits/100;

if (digits<0 || bit1>1 || bit2>1 || bit3>1 ){
    System.out.println("An inappropriate integer is entered");
    return;
}

System.out.println("The binary value is: " +(bit1+(2*bit2)+(4*bit3)));
    
}
}
         








