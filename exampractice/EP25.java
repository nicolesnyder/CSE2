import java.util.Scanner;

public class EP25{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );

//computer randomly picks 0, 1, 2
int computer= (int)(Math.random()*3);  

//user picks 0, 1, 2
System.out.print("scissor(0), rock(1), paper(2): ");
int userInput= myScanner.nextInt();

if (computer==0){
    if (userInput==0){
        System.out.println("The computer is scissor. You are scissor too. It is a draw.");
    }
    else if (userInput==1){
            System.out.println("The computer is scissor. You are rock. You win");
    }
    else{
                System.out.println("The computer is scissor. You are paper. You lose.");
            }
}
else if (computer==1){
    if (userInput==0){
        System.out.println("The computer is rock. You are scissor. You lose");
    }
    else if (userInput==1){
        System.out.println("The compuer is rock. You are rock too. It is a draw");
    }
    else{
        System.out.println("The computer is rock. You are paper. You win.");
    }
}

else{
    if (userInput==0){
        System.out.println("The computer is paper. You are scissor. You win.");
    }
    else if (userInput==1){
        System.out.println("The computer is paper. You are rock. You lose.");
    }
    else {
        System.out.println("The computer is paper. You are paper. It is a draw.");
    }
}

}
}



