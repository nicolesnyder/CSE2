//(Find the highest score) Write a program that prompts the user to 
//enter the number of students and each student’s name and score, and 
//finally displays the name of the student with the highest score.


import java.util.Scanner;

public class student{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
System.out.print("Enter the number of students: ");
int num=myScanner.nextInt();
double highest=0.0;
double score;
String name;
String highestName=" "; 


for(int i=0; i<num; i++){
    System.out.print("Enter the students names: ");
    name= myScanner.next();
    
    System.out.print("Enter the students scores: ");
    score= myScanner.nextDouble();
    if(score>highest){
        highest=score;
        highestName=name;
    }
}
System.out.println(highestName+ " got a " +highest+ " and it is the highest!");



}
}
