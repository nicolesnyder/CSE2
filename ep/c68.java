import java.util.Scanner;

public class c68{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        
int numStudents;
double score;
double highestScore=0.0;
String name;
String highestName= " ";

System.out.println("Enter the number of students");
numStudents=myScanner.nextInt();

for (int i=0; i<numStudents; i++){
    System.out.print("Enter the students names: ");
    name= myScanner.next();
    
    System.out.print("Enter the students scores: ");
    score= myScanner.nextDouble();
    
    if(score>highestScore){
        highestScore=score;
        highestName=name;
    }
}

System.out.println("The student with the highest score is " +highestName);
}
}





