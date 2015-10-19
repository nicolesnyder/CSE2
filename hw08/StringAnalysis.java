//Nicole Snyder
//CSE002 
//hw8 StringAnalysis

import java.util.Scanner;

public class StringAnalysis{ //define the class

public static boolean Evaluate (String input){ //create a method for evaluating the input of the string
    boolean test = false; //boolean that tests the loop
    for(int j=0; j<input.length(); j++){ //checks the loop to see if all characters are letters
        test=Character.isLetter(input.charAt(j));
        if (test==false){
            break;
        }
    }
    return test;
} //end method

public static boolean Evaluate(String input, int number){//create a method for evaluating input that accepts characters and integer
    boolean test = false;
    for (int j=0; j<number; j++){
        test=Character.isLetter(input.charAt(j));
        if (test==false){
            break;
        }
    }
    return test;
}//end main method

public static void main(String[] args){ //create a main method
    Scanner myScanner= new Scanner (System.in); //create a scanner

//ask user for input
System.out.print("Enter a string: ");
String input= myScanner.nextLine();
System.out.print("Do you want to evaluate the whole string, please enter yes or no: ");
String answer=myScanner.nextLine();

while (true){ //while loop that checks to make sure user enters yes or no
    if(answer.equals("yes") || answer.equals("no")){ //if user entered yes or no exit
        break;
    }
    else{
        System.out.print("Pease enter a yes or no response: ");
        answer=myScanner.nextLine();
    }
}
        
int number=0; //define integer number

if(answer.equals("yes")){//if the user enters yes
    if(Evaluate(input)){//if the string only contains letters
        System.out.println("The string you entered only contains letters.");
    } 
    else{//if the string does not only contain letters
        System.out.println("The string you entered contains characters that are not letters");
    }
}

else if(answer.equals("no")){//if the user enters no
    System.out.print("Please enter the number of characters in the string you entered you wish to evaluate: ");//ask user for input
    while (true){//check to make sure user enters a number
        if(myScanner.hasNextInt()){ //if user entered a number
            number=myScanner.nextInt();
            break;
        }
        else{//if user did not enter a number
            System.out.print("You did not enter an integer. Please enter an integer: ");
            myScanner.nextLine();
        }
    }
    if(number>=input.length()){//checks to see if all characters are letters use evaluate method
        if (Evaluate(input)){
           System.out.println("The string you entered only contains letters.");
        } 
        else{//if the string does not only contain letters
            System.out.println("The string you entered contains characters that are not letters");
        } 
    }
    else{//use evaluate method to find evaluate integers and letters
        if(Evaluate(input,number)){
            System.out.println("The first " + number + " characters of the string you entered are letters.");
        }
        else{
            System.out.println("The first " + number + " charactesr of the string you entered are not all letters");
        }
    }
}

    
    
}//end of main method
}

        

      
            
         
      

  