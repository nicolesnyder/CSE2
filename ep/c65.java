import java.util.Scanner;

public class c65{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
System.out.println("Kilograms Pounds  |   Pounds  Kilograms");

for(int kilo=1, lb=20; kilo<=199; kilo+=2, lb+=5){
    int pounds= (int)(kilo*2.2*10);
    pounds= (int)Math.round(pounds);
    double p = pounds/10.0;
    int kilos= (int)(lb/2.2*10);
    kilos=(int)Math.round(kilos);
    double k= kilos/10.0;
    System.out.println(kilo+ "\t" + p + "\t|\t" + lb + "\t" + k);
}

}
}
