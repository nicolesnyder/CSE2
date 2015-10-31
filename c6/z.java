import java.util.Scanner;

public class z{ //define the class
    public static void main(String[] args){ 
        Scanner myScanner=new Scanner (System.in);
        


System.out.print("Enter an integer: ");
int size=(int)(Math.random()*5+6);

System.out.println("Enter " +size+ " student's names: ");
String [] students = new String [size];
for (int j=0; j<size; j++){
    sutdents[j]= myScanner.next();
}


int[] mGrade= new int[size];
for (int k=0; k<size; k++){
    mGrade[k]=(int)(Math.random()*100);
}
for (int i=0; i<size; i++){
    System.out.println(students[i] + ": " +mGrade[i]);
}
}
}
        
