import java.util.Scanner;

public class pattern{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
System.out.println("Pattern A");



for(int i=1; i<=6; i++){
    for(int j=1;j<=i;j++){
        System.out.print(j+ " ");
    }
    System.out.println(" ");
}

System.out.println("Pattern B");
for(int a=6; a>=1; a--){
    for (int b=1; b<=a; b++){
        System.out.print(b+ " ");
    }
    System.out.println(" ");
}

System.out.println("Pattern C");
for(int c=6; c>=1; c--){
    for(int d=1; d<c; d++){
        System.out.print(" " + " ");
    }
    for (int e=7-c;e>0;e--){
        System.out.print(e+" ");
    }
    System.out.println(" ");
}

System.out.println("Pattern D");
for (int x=6; x>=1; x--){
    for (int y=6; y>x; y--){
        System.out.print(" " + " ");
    }
    for (int z= 1; z<=x; z++){
        System.out.print(" " +z);    
    }
    System.out.println(" ");
}



}
}




