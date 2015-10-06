import java.util.Scanner;

public class E2{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );

char letter; 

System.out.print("Enter a letter: ");
letter=myScanner.next().charAt(0);

if(letter == 'a' || letter == 'A' || letter == 'e'
    || letter == 'E' || letter == 'i' || letter == 'I'
    || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U'){
    System.out.println(letter + " is a vowel");
}

else {
    System.out.println(letter + " is a consonant");
}

}
}