import java.util.Scanner;
public class E3
{
public static void main(String[] args)
{
  Scanner input = new Scanner(System.in);
  char ch;
  
  System.out.print("Enter a letter: ");
  ch = input.next().charAt(0);
  
  if(ch == 'a' || ch == 'A' || ch == 'e'
    || ch == 'E' || ch == 'i' || ch == 'I'
    || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
  {
   System.out.println(ch + " is a vowel");
  }
  else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
  {
   System.out.println(ch + " is a consonant");
  }
  else
  {
   System.out.println(ch + " is an invalid input");
  }
}
}