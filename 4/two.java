import java.util.Scanner;
    public class two {
        public static void main(String args[]) {
        Scanner myScanner= new Scanner(System.in);
        
//reads in ten integers
//reverses them

int [] list= new int[10];
System.out.print("Enter ten numbers: ");
for(int i=0; i<10; i++){
    int number=myScanner.nextInt();
    list[i]=number;
}

//reverse

for(int i=9; i>=0; i--){
    System.out.print(list[i]+ " ");
}
System.out.println(" ");
    
}
}