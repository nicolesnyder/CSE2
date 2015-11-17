import java.util.Scanner;

public class three{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);

int input=100;
int count[]= new int[101];

while (input !=0){
    System.out.print("Enter an integer between 1 and 100: ");
    input=myScanner.nextInt();
    for (int i=0; i<count.length; i++){
        if (input==i){
            count[i]++;
        }
    }
}

for (int i=0; i<count.length; i++){
    if (count[i] != 0){
        System.out.println("The number " +i+ " occurs " +count[i]+ " times");
    }
}

}
}

