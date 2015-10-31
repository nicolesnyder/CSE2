import java.util.Scanner;

public class sum{ //define the class
    public static void main(String[] args){ 
        Scanner myScanner=new Scanner(System.in);
        
        
System.out.print("Enter an int: ");
int x=myScanner.nextInt();
System.out.print("Enter an int greater than " +x+ ": ");
int y=myScanner.nextInt();

while(y<=x){
    System.out.println("Sorry you entered " +y+ "<=" +x+ ";try again");
    System.out.print("Enter an int greater than " +x+ ": ");
    y=myScanner.nextInt();
}

int answer= sum(x,y);
System.out.println(x+ "+...+" +y+ "=" +answer);
}

public static int sum(int x, int y){
    int sum=0;
    for (int j=x; j<=y; j++){
        sum=sum+j;
    }
    return sum;
}
}

