import java.util.Scanner;

public class j{ //define the class
    public static void main(String[] args){ 
        Scanner myScanner=new Scanner (System.in);
        
boolean arg=false; 
for (int i=0; i<10; i++){
    if(i%2==0||arg){
        continue;
    }
    for(int j=0; j<i+1; j++){
        if(j>4){
            arg=true;
            break;
        }
        System.out.print(j);
    }
    System.out.println();
}
}
}