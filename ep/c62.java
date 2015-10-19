import java.util.Scanner;

public class c62{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
System.out.println("Miles       Kilometers");
int miles=0;

while(miles<10){
    miles++;
    System.out.print(miles);
    double kilometers=miles*1.609;
    System.out.println("\t\t" + kilometers);
}
}
}