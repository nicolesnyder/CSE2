import java.util.Scanner;

public class E4{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        
System.out.print("Enter the first city: ");
String s1= myScanner.nextLine();
System.out.print("Enter the second city: ");
String s2= myScanner.nextLine();
System.out.print("Enter the third city: ");
String s3= myScanner.nextLine();

if (s1.compareTo(s2) > 0){
    String temp = s1;
    s1=s2;
    s2=temp;
}

if (s2.compareTo(s3)>0){
    String temp= s2;
    s2=s3;
    s3=temp;
}
if(s1.compareTo(s2)>0){
    String temp=s1;
    s1=s2;
    s2=temp;
}
    
System.out.println("The three cities in alphabetical order are " + s1 + " " + s2 + " " + s3);
}
}



