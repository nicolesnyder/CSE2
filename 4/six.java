import java.util.Scanner;
    public class six {
        public static void main(String args[]) {
        Scanner myScanner= new Scanner(System.in);
        
//Write a program that generates 100 random integers between 0 and 9 and 
//displays the count for each number

int [] count= new int[10];
int number;

for(int i=0; i<100; i++){
    number=(int)(Math.random()*10);
    count[number]++;
}


for(int i=0; i<count.length; i++){
    System.out.println("The count for " +i+ " is: " +count[i]);
}
   
}
}