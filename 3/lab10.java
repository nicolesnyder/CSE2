import java.util.Scanner;

public class lab10{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
//1)  Create an array of Strings named students of a randomized size from 5 to 10.    
//2)    Ask the user to fill up the array with different Strings using a Scanner.
//3)    Create a second array named midterm of the same size as students.
//4)  Fill in the array midterm with randomized integers in the range 0 to 100, using math.random().
//5)  Print out the members of the two array such that each line has a member of students and grades  

int size= (int)(Math.random()*10+1);
System.out.println("Please enter " +size+ " students names: ");
String [] students = new String [size];

for (int i=0; i<size; i++){
    students[i]= myScanner.next();
}

int [] midtermGrade = new int [size];
for (int i=0; i<size; i++){
    midtermGrade[i]= (int)(Math.random()*100);
}
for(int i=0; i<size; i++){
    System.out.println(students[i] + " " + midtermGrade[i]);
}

}
}





