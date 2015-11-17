//Write a program that reads student scores, gets the best score, 
//and then assigns grades based on the following scheme:
//GradeisAifscoreis7=best - 10 Grade is B if score is 7= best - 20; 
//Grade is C if score is 7= best - 30; Grade is D if score 
//is 7= best - 40; Grade is F otherwise.
//The program prompts the user to enter the total number of students, 
//then prompts the user to enter all of the scores, and concludes by 
//displaying the grades. Here is a sample run:

import java.util.Scanner;
    public class one {
        public static void main(String args[]) {
        Scanner myScanner= new Scanner(System.in);
        
        System.out.print("Enter the total number of students: ");
        int size=myScanner.nextInt();
        int [] totalStudents=new int[size];
        
        for(int i=0; i<size; i++){
            System.out.print("Enter " +(i+1)+ " score: ");
            totalStudents[i]=myScanner.nextInt();
        }
        
        int max=0;
        for(int i=0; i<size; i++){
            if(max<totalStudents[i]){
                max=totalStudents[i];
            }
        }
        
        for(int i=0; i<size; i++){
            if(max-10<=totalStudents[i]){
                System.out.println("Student " +i+ "is " +totalStudents[i]+ " and grade is A");
            }
            else if(max-20<=totalStudents[i]){
                System.out.println("Student " +i+ "is " +totalStudents[i]+ " and grade is B");
            }
            else if(max-30<=totalStudents[i]){
                System.out.println("Student " +i+ "is " +totalStudents[i]+ " and grade is C");
            }
            else if(max-40<=totalStudents[i]){
                System.out.println("Student " +i+ "is " +totalStudents[i]+ " and grade is D");
            }
            else{
                System.out.println("Student " +i+ "is " +totalStudents[i]+ " and grade is F");
            }
        }
        
        }
    }
        