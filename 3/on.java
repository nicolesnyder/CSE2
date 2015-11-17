import java.util.Scanner;

public class on{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
System.out.print("Enter the number of students: ");
int number=myScanner.nextInt();

int [] students = new int[number];

System.out.print("Enter " +number+ " scores: ");
int [] marks = new int[number];
String [] grade = new String [number];


int highest=0;
for(int i=0; i<number; i++){
    marks[i]=myScanner.nextInt();
    highest=Math.max(highest, marks[i]);
    }
    
for(int i=0; i<number; i++){
    if(marks[i]>= highest-10){
        grade[i]="A";
    }
    else if(marks[i]>=highest-20){
        grade[i]="B";
    }
    else if(marks[i]>=highest-30){
        grade[i]="C";
    }
    else if(marks[i]>=highest-30){
        grade[i]="D";
    }
    else{
        grade[i]="F";
    }
}
for(int i=0; i<number; i++){
System.out.println("Student " +i+ " score is " +marks[i]+ " and grade is " +grade[i]);
}
}
}
