import java.util.Scanner;

public class tw{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
int input []= new int [10];        
System.out.print("Enter 10 integers: ");
for(int i=0; i<10; i++){
    input[i]= myScanner.nextInt();
}
for(int i=9; i>=0; i--){
    System.out.print(input[i]+ " ");
}
System.out.println(" ");
}
}
