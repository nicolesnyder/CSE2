import java.util.Scanner;

public class encrypted_x { //define the class
    public static void main(String[] args) { //create a main method
        Scanner myScanner = new Scanner(System.in); //create a scanner

System.out.print("Enter an integer number from 0-100: ");
      
int input;
while (true) {
    if (!myScanner.hasNextInt()) {
        System.out.println("Sorry, you did not enter an integer number from 0-100.");
        System.out.print("Input an integer between 0 - 100: ");
        myScanner.next();
    }
    else{
        input= myScanner.nextInt();
        if (input>100 || input<0){
        System.out.println("Please input an integer less than 100 and greater than 0.");
        System.out.print("Input an integer between 0 - 100: ");
        }
        else{
            break;
        }
    }
        
}

//draw the design
for(int i = 0; i < input; i++){
    for (int j = 0; j < input; j++) {
                if ( i + 1 == (input - j) || j == i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
        System.out.println();
}

        
    }
}


      
  








        