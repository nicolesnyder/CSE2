import java.util.Scanner;

public class CardGenerator{ //define the class
    public static void main(String[] args){ //create a main method

//generate a random card number   
int cardNumber = (int)(Math.random()*52) + 1;

String nameOfSuit="";
String identityOfCard="";

//finding suit
if (cardNumber<14){
    nameOfSuit="diamond";
}

else if (cardNumber>13 && cardNumber<27){
      nameOfSuit="club";
}
else if (cardNumber>26 && cardNumber<40){
    nameOfSuit="heart";
}
else{
    nameOfSuit="spade";
}

//finding card number
switch (cardNumber) {
    case 1:
        identityOfCard = "ace";
        break;
    case 2:
        identityOfCard = "2";
        break;
    case 3:
        identityOfCard = "3";
        break;
    case 4:
        identityOfCard = "4";
        break;
    case 5: 
        identityOfCard = "5";
        break;
    case 6:
        identityOfCard = "6";
        break;
    case 7:
        identityOfCard = "7";
        break;
    case 8:
        identityOfCard = "8";
        break;
    case 9:
        identityOfCard = "9";
        break;
    case 10:
        identityOfCard = "10";
        break;
    case 11:
        identityOfCard = "jack";
        break;
    case 12:
        identityOfCard = "queen";
        break;
    case 13:
        identityOfCard = "king";
        break;
    case 14:
        identityOfCard = "ace";
        break;
    case 15:
        identityOfCard = "2";
        break;
    case 16:
        identityOfCard = "3";
        break;
    case 17:
        identityOfCard = "4";
        break;
    case 18: 
        identityOfCard = "5";
        break;
    case 19:
        identityOfCard = "6";
        break;
    case 20:
        identityOfCard = "7";
        break;
    case 21:
        identityOfCard = "8";
        break;
    case 22:
        identityOfCard = "9";
        break;
    case 23:
        identityOfCard = "10";
        break;
    case 24:
        identityOfCard = "jack";
        break;
    case 25:
        identityOfCard = "queen";
        break;
    case 26:
        identityOfCard = "king"; 
        break;
    case 27:
        identityOfCard = "ace";
        break;
    case 28:
        identityOfCard = "2";
        break;
    case 29:
        identityOfCard = "3";
        break;
    case 30:
        identityOfCard = "4";
        break;
    case 31: 
        identityOfCard = "5";
        break;
    case 32:
        identityOfCard = "6";
        break;
    case 33:
        identityOfCard = "7";
        break;
    case 34:
        identityOfCard = "8";
        break;
    case 35:
        identityOfCard = "9";
        break;
    case 36:
        identityOfCard = "10";
        break;
    case 37:
        identityOfCard = "jack";
        break;
    case 38:
        identityOfCard = "queen";
        break;
    case 39:
        identityOfCard = "king";   
        break;
    case 40:
        identityOfCard = "ace";
        break;
    case 41:
        identityOfCard = "2";
        break;
    case 42:
        identityOfCard = "3";
        break;
    case 43:
        identityOfCard = "4";
        break;
    case 44: 
        identityOfCard = "5";
        break;
    case 45:
        identityOfCard = "6";
        break;
    case 46:
        identityOfCard = "7";
        break;
    case 47:
        identityOfCard = "8";
        break;
    case 48:
        identityOfCard = "9";
        break;
    case 49:
        identityOfCard = "10";
        break;
    case 50:
        identityOfCard = "jack";
        break;
    case 51:
        identityOfCard = "queen";
        break;
    case 52:
        identityOfCard = "king"; 
    default: identityOfCard = "Invalid number";
        break;
}

//generating output
System.out.println("You picked the " + identityOfCard + " of " + nameOfSuit);
    }
}