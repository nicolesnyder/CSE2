import java.util.Scanner;

public class c6{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);

//(Repeat additions) Listing 4.4, SubtractionQuizLoop.java, generates 
//five ran- dom subtraction questions. Revise the program to generate 
//ten random addition questions for two integers between 1 and 15. 
//Display the correct count and test time

final int numOfQuestions=10;
int correct=0;
int count=0;
long startTime=System.currentTimeMillis();
String output= " ";

while (count<numOfQuestions){
    int num1=(int)(Math.random()*15) +1;
    int num2=(int)(Math.random()*15) +1;

System.out.print("What is " +num1+ "+" +num2+ "?");
int answer=myScanner.nextInt();

if(answer==(num1+num2)){
    System.out.println("Right!");
    correct++;
}
else
    System.out.println("Your answer is wrong. The correct answer is " +(num1+num2));
    count++;
    output+= "\n" +num1+ "+" +num2+ "=" +answer+ ((num1 - num2 == answer) ? " correct" : " wrong");

}
long endTime=System.currentTimeMillis();
long testTime=endTime-startTime;

System.out.println("Corret count is " +correct+ "\nTest time is " +testTime/1000+ "seconds\n" +output);

}
}


