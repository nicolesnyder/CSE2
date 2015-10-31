import java.util.Scanner;

public class c{ //define the class
    public static void main(String[] args){ 
        Scanner myScanner=new Scanner (System.in);
        
System.out.print("Enter an integer: ");
int input=myScanner.nextInt();
twoTri(input);
}

public static void twoTri(int input){
    for(int i=1; i<=input; i++){
        for(int j=1; j<=i; j++){
            System.out.print(input);
            }
        System.out.println();
    }
    for(int j=input; j>=1; j--){
        
        for(int x=input; x>=1; x--){
                System.out.print(" ");
            } 
        
        
        for(int i=1; i<=j; i++){
            System.out.print(input);
        }
        System.out.println();
    }

}
}

