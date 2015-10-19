import java.util.Scanner;

public class c619{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);

int i, j, k, l;
int num;
        
for (i=1; i<=8; i++){
    for(j=i; j<8; j=j+1){
        System.out.print(" " + "\t");
        System.out.print(1 + "\t");
    }
    num=2;
    for (k=2; k<=i; k+=1){
        System.out.print(num + "\t");
        num= num*2;
    }
        num=num/2;
    for (l=1; l<=i-1; l++){
        num= num-(num/2);
        System.out.print(num+ "\t");
    }
    System.out.println(" ");
}

}
}
