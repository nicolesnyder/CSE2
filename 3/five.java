import java.util.Scanner;

public class five{
    public static void main(String[] args){
        Scanner myScanner= new Scanner (System.in);
        


//Write a program that reads in ten numbers and displays distinct 
//numbers (i.e., if a number appears multiple times, it is displayed only once).
//(Hint: Read a number and store it to an array if it is new. If the number 
//is already in the array, ignore it.) After the input, the array contains 
//the distinct numbers.

int [] numbers = new int [10];
int num=0;

for (int i=0; i<numbers.length; i++){
    System.out.print("Enter number " +(i+1)+ ": ");
    int newNum=myScanner.nextInt();
    boolean notfound=true; //initialize that the number is not found at first
    for(int j=0;j<num; j++){ 
        if(newNum==numbers[j]){ //if the new number is already in the array
            notfound=false;//the number IS FOUND 
            break;//break out
        }
    }
    if(notfound){ //notfound is true 
        numbers[num]=newNum; //set the number in the array to new num
        num++; //amount of times the number is detected
    }
}

for(int i=0; i<num; i++){
    System.out.print(numbers[i]+ " ");
}
System.out.println(" ");
}
}