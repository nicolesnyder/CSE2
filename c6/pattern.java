import java.util.Scanner;

public class pattern{ //define the class
    public static void main(String[] args){ 
        Scanner myScanner=new Scanner(System.in);
        
for (int i=9; i>=1; i--){
    for(int j=1; j<i; j++){
        System.out.print(" ");
    }
    System.out.println(i);
}
}
}