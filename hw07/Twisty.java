import java.util.Scanner;

public class Twisty{ //define the class
    public static void main(String[] args){ //create a main method
        Scanner myScanner = new Scanner (System.in); //create a scanner
        

double length=0.0; //defines length
boolean acceptLength= false;

System.out.print("Input your desired length: "); //asks user for length
//continues to ask for length until valid
while(!acceptLength){ //check if the input is an integer
    if(myScanner.hasNextDouble()) {
        length=myScanner.nextDouble();
        acceptLength=true; //accept the length
    }
    else{
        System.out.println("Error: please type in an integer"); //tells user the length they inputted will not be accepted
        System.out.print("Input your desired length: "); //asks user for length again
        myScanner.next();
        continue;
    }
    if(length>80){ //checks if length is greater than 80, which is not accepted
    System.out.println("Error: please input an integer less than 80");
    System.out.print("Input your desired length: ");//asks user for length again
    myScanner.next();
    }
}

System.out.print("Input your desired width: "); //asks user for width
boolean acceptWidth= false;
double width=0.0; //defines width

while(!acceptWidth){ //check if the input is an integer
    if(myScanner.hasNextDouble()) {
        width=myScanner.nextDouble();
        acceptWidth=true; //accept the width
    }
    else{
        System.out.println("Error: please type in an integer"); //tells user the width they inputted will not be accepted
        System.out.print("Input your desired width: "); //asks user for width again
        myScanner.next();
        continue;
    }
    if(width>length){ //checks if width is greater than length
    System.out.println("Error: please input an integer smaller than the length.");
    System.out.print("Input your desired width: ");//asks user for width again
    myScanner.next();
    }
}

//create loop for printing vertical
for (int a=0; a<width; a++){
//create loop for printing horizontal
for(int b=0; b<length; b++){
    if(a == b % width){ //loop for character in each line
        if ( (int) (b / width) % 2 == 0){ //checks to see the type of x
            System.out.print("#");
        }
        else{
            System.out.print("\\");
        }
    }
    else if((b % width) == width - a - 1){ //loop for character in each line
        if( (int) (b / width) % 2 == 0){ //checks to see the type of x
            System.out.print("/");
        }
        else {
            System.out.print("#");
        }
    }
    else{ 
        System.out.print(" "); //if none are trye, print a space
    }
    
}

System.out.println(""); //goes to next line
}

     
}
}
            
             


        
        
    

