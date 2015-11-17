//1)Create an array of Strings named students of a randomized size from 5 to 10.    
//2)Ask the user to fill up the array with different Strings using a Scanner.
//3)Create a second array named midterm of the same size as students.
//4) Fill in the array midterm with randomized integers in the range 0 to 100, using math.random().
//5) Print out the members of the two array such that each line has a member of students and grades    

import java.util.Scanner;

public class lab10 {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in); 
    
    int size=(int)(Math.random()*11);
    String [] students = new String[size];
    System.out.print("Enter " +size+ " names: ");
    for(int i=0; i<students.length; i++){
        String name=myScanner.next();
        students[i]=name;
    }
    
    int [] midterm = new int [size];
    for(int i=0; i<midterm.length; i++){
        midterm[i]=(int)(Math.random()*101);
    }
    
    for(int i=0; i<midterm.length; i++){
        System.out.println(students[i]+ " got a: " +midterm[i]);
    }
    
  }
}
    