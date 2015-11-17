//Write a program that generates 100 random integers between 0 and 9 and 
//displays the count for each number. (Hint: Use (int)(Math.random() * 10)
//to generate  a random integer between 0 and 9. Use an array of ten integers, say 
//counts, to store the counts for the number of 0s, 1s, ..., 9s.)

import java.util.Scanner;

public class seven{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
int count [] = new int[10];
int rNum;

for(int i=0; i<100; i++){
    rNum=(int)(Math.random()*10);
    count[rNum]++;
}

for(int i=0; i<count.length; i++){
    System.out.println(+i+ " occurs " +count[i]+ " times");
}

}
}


