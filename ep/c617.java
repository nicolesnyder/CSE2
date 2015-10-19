import java.util.Scanner;

public class c617{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
System.out.print("Enter an integer from 1 to 15: ");
int lines=myScanner.nextInt();

for (int i=1; i<=lines; i++){
    for (int j=i; j<lines; j++){ //prints spaces
        System.out.print(" ");
    }
    for (int k=i; k>=1; k--){ //prints number 1
        System.out.print(k);
    }
    for(int l=2; l<=i; l++){ //prints numbers 2 to lines
        System.out.print(l);
    } 
    System.out.println(" ");
    
}

}
}
