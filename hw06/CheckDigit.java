//Nicole Snyder
//CSE2 
//hw6 CheckDigit
//prompt digit to enter ten digit isbn
//if number is not valid ISBN, determine a check digit that would make the number a valid ISBN
//use letter X to reprepsent check digit of 10
    

import java.util.Scanner; //import a Scanner
public class CheckDigit{ //define the class
    public static void main(String[] args){ //ad a main method
        Scanner input = new Scanner (System.in); //create a scanner
        System.out.print("Please enter a 10 digit barcode: ");  //asks user for 10 digit barcode
        String isbn=input.next();                               //makes input a string because we accept X
        boolean correctLength = false;                          //checks to see if the input is the correct 10 digits
        if(isbn.length() == 10){                                
            correctLength = true;
        }
        while(isbn.length() != 10){                             //while input is not ten digits long, keep repeating loop until a ten digit input is entered
            System.out.print("This is NOT a valid ISBN. Please enter 10 digits: ");
            isbn = " ";
            isbn = input.next();
            if(isbn.length() == 10){
                correctLength = true;
            }
        }
        boolean wrongDigits = false;                //assumes input is right
        if (correctLength){                         //follows this if the input is correct
            int place = 0;                          //creates integer place, used to label the places of the ISBN
            int sum =0;
            while(place<=isbn.length()-1){      //place starts at 0   
                char ch = isbn.charAt(place);   //determines which char is a certain place
                int d =0;                       //d will be the place of the number
                int m =0;                       //m will be the multiplier
                switch(place){  //creates switchstatement for place
                    case 0:                        
                        m = 10;
                        break;
                    case 1:
                        m = 9;
                        break;
                    case 2:
                        m = 8;
                        break;
                    case 3:
                        m = 7;
                        break;
                    case 4:
                        m = 6;
                        break;
                    case 5:
                        m = 5;
                        break;
                    case 6:
                        m = 4;
                        break;
                    case 7:
                        m = 3;
                        break;
                    case 8:
                        m = 2;
                        break;
                    case 9:     //this case is the check digit so we do not multiply it by a multiplier
                        break;
                }
                switch(ch){                     //creates a switch statement for ch
                    case '0':
                        d = 0;
                        break;
                    case '1':
                        d = 1;
                        break;
                    case '2':
                        d = 2;
                        break;
                    case '3':
                        d = 3;
                        break;
                    case '4':
                        d = 4;
                        break;
                    case '5':
                        d = 5;
                        break;
                    case '6':
                        d = 6;
                        break;
                    case '7':
                        d = 7;
                        break;
                    case '8':
                        d = 8;
                        break;
                    case '9':
                        d = 9;
                        break;
                    case 'X':
                        d =10;
                        break;
                    default:    //digits aren't matching up, so the input is invalid
                        wrongDigits = true;
                }
                place++;    //keeps adding one place in the loop
                if(wrongDigits){ //if input is invalid program comes to here
                    System.out.println("This is not a valid ISBN. You did not enter the correct digits.");
                    break;
                }
                if(!wrongDigits){       //digits were valid, sum up all the digits
                    sum+= d * m;
                }
            }
           
            int place1 = 9;         //this is the check digit       
            int c = 0;              //the inputted value for the check digit
                if(place1==9 && !wrongDigits){  
                char chr = isbn.charAt(place1); //value for ninth digit
                switch(chr){    //create switch statment for chr
                    case '0':
                        c = 0;
                        break;
                    case '1':
                        c = 1;
                        break;
                    case '2':
                        c = 2;
                        break;
                    case '3':
                        c = 3;
                        break;
                    case '4':
                        c = 4;
                        break;
                    case '5':
                        c = 5;
                        break;
                    case '6':
                        c = 6;
                        break;
                    case '7':
                        c = 7;
                        break;
                    case '8':
                        c = 8;
                        break;
                    case '9':
                        c = 9;
                        break;
                    case 'X':
                        c =10;
                        break;
                }
            }
            //determines valid or invalid, calculates the correct check digit
            if(c == 11- (sum % 11) && !wrongDigits){          
                System.out.println("This is a valid ISBN.");
            }
            else if (c != 11 - (sum % 11) && !wrongDigits){       
                if (11 - (sum%11) == 10){                         
                    System.out.println("This is NOT a valid ISBN. The check digit should be X.");
                }
                else{                                          
                    System.out.println("This is NOT a valid ISBN. The check digit should be " + (11 - (sum%11)) + ".");
                }
            }
            
            
        }
        
        
        
    }
}
