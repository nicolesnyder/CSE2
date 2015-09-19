import java.util.Scanner;
public class C8{
    public static void main(String[] args){
       

Scanner myScanner = new Scanner (System.in);

System.out.print("Enter three integers: ");
int number1= myScanner.nextInt();
int number2= myScanner.nextInt();
int number3= myScanner.nextInt();

if (number1>number2 && number1>number3){
    if (number2>number3){
    System.out.print(number1 + ", " + number2 + ", " +number3);
    }
    else{ 
        System.out.print(number1 + ", " + number3 + ", " +number2);
}
}

else if (number2>number3&&number2>number1){
    if (number3>number2){
     System.out.print(number2 + ", " + number3 + ", " +number1);
    }
    else{System.out.print(number2 + ", " + number1 + ", " +number3);
    }
    }

else if (number3>number1&&number3>number2){
    if(number1>number2){
     System.out.print(number3 + ", " + number1 + ", " +number2);
    }
    else{
        System.out.print(number3 + ", " + number2 + ", " +number1);
    }
    }

}
}