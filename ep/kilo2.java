import java.util.Scanner;

public class kilo2{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
System.out.println("Kilograms   Pounds  |   Pounds  Kilograms");



for(int kilo=1, lb=20; kilo<=199; kilo+=2, lb+=5){
    double pound=Math.round((kilo*2.2)*10)/10.0;
    double kg=Math.round((lb/2.2)*10)/10.0;
    System.out.println(kilo+ "\t" +pound+ "\t|\t" +lb+ "\t" +kg);
}

//for(int lb=20; lb<=515; lb+=5){
    //double kg=Math.round((lb/2.2)*10)/10.0;
    //System.out.println("|\t" +lb+ "\t" +kg);

        
        
    }
}
