import java.util.Scanner;

public class EP24{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        
System.out.println("Enter a three digit integer");
int number= myScanner.nextInt();
int copyOfNumber, digit, palindrome;

//reverse the number
copyOfNumber= number; //735
digit= copyOfNumber%10; //5
palindrome= digit; //5
copyOfNumber= copyOfNumber/10; //73
digit= copyOfNumber%10; //3
palindrome=(palindrome*10) + digit; //53
copyOfNumber= copyOfNumber/10; // 7
digit= copyOfNumber%10;// 7
palindrome= (palindrome*10) + digit; //537


 

if (number==palindrome){
    System.out.println(number+ " is a palindrome");
}

else{
    System.out.println(number+ " is not a palindrome");
}
}
}