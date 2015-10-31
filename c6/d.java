import java.util.Scanner;

public class d{ //define the class
    public static void main(String[] args){ //create a main method
    Scanner myScanner= new Scanner (System.in);
    
    
System.out.println("Pattern A: ");
for (int i=1; i<=6; i++){
    for(int j=1; j<=i; j++){
        System.out.print(j+ " ");
        }
    System.out.println();
}



System.out.println("Pattern B: ");
for(int i=6; i>=1; i--){
    for(int j=1; j<=i; j++){
        System.out.print(j+ " ");
    }
    System.out.println();
}



}
}