import java.util.Scanner;
    public class three {
        public static void main(String args[]) {
        Scanner myScanner= new Scanner(System.in);
        
//Write a program that reads the integers between 1 and 100 and counts the 
//occurrences of each. Assume the input ends with 0. 

int input=100;
int [] count = new int [101];

while (input != 0){
    System.out.print("Enter a number between 1 and 100: ");
    input=myScanner.nextInt();
    for(int i=0; i<count.length; i++){
        if(input==i){
            count[i]++;
        }
    }
}

for(int i=0; i<count.length; i++){
    if(count[i]==1){
        System.out.println(i+ " occurs one time.");
    }
    else if(count[i]==0){
        break;
    }
    else{
        System.out.println(i+ " occurs " +count[i]+ " times");
    }
}
}
}

