import java.util.Scanner;

public class kilo{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
System.out.println("Kilograms \t Pounds");



for (int kilo=1; kilo<=199; kilo+=2){
    double pound=Math.round((kilo*2.2)*10)/10.0;
    System.out.println(kilo+ "\t" +pound);
}
        
        
    }
}