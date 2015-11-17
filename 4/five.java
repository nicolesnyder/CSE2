import java.util.Scanner;
    public class five {
        public static void main(String args[]) {
        Scanner myScanner= new Scanner(System.in);
        
//Write a program that reads in ten numbers and displays distinct numbers 
//(i.e., if a number appears multiple times, it is displayed only once). 
//(Hint: Read a number and store it to an array if it is new. If the number 
//is already in the array, ignore it.) After the input, the array contains 
//the distinct numbers.

int [] list = new int [10];
int num=0;

for(int i=0; i<list.length; i++){
    System.out.print("Enter number " +(i+1)+ ": ");
    int newNum=myScanner.nextInt();
    boolean notFound=true;
    for(int j=0; j<num; j++){
        if(newNum==list[j]){
            notFound=false;
            break;
        }
    }
    if(notFound){
        list[num]=newNum;
        num++;
    }
}

for(int i=0; i<num; i++){
    System.out.print(list[i]+ " ");
}

System.out.println(" ");

}
}