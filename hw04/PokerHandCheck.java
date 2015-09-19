import java.util.Scanner;
public class PokerHandCheck{ //define the class
    public static void main(String[] args){ //add a main method
    
//prints the cards we get
System.out.println("Your random cards were: ");
    
//randomly picks the first card
int cardNumber= (int)(Math.random()*13) + 1;
int suitNumber= (int)(Math.random()*4) + 1;

//creates string
String number = ""; //tells the number of the card, 1-king
String suit = ""; //tells which suit the card is

//finds the suit of the card
if (suitNumber==1){
    suit= "diamonds";
}
else if (suitNumber==2){
    suit= "hearts";
}
else if (suitNumber==3){
    suit= "clubs";
}
else{
    suit="spades";
}

//finds the real number of the card
switch (cardNumber){
    case 11: 
        number= "jack";
        break;
    case 12: 
        number= "queen";
        break;
    case 13: 
        number= "king";
        break;
    case 14: 
        number= "ace";
        break;
    default:
        number= Integer.toString(cardNumber);
        break;
}
//prints information for the first card 
System.out.println("You picked " + number + " of " + suit);

//randomly picks a second card
int cardNumber1= (int)(Math.random()*13) + 1;
int suitNumber1= (int)(Math.random()*4) + 1;

//creates string
String number1 = ""; //tells the number of the card, 1-king
String suit1 = ""; //tells which suit the card is

//finds the suit of second card
if (suitNumber1==1){
    suit1= "diamonds";
}
else if (suitNumber1==2){
    suit1= "hearts";
}
else if (suitNumber1==3){
    suit1= "clubs";
}
else{
    suit1="spades";
}

//finds the real number of the second card
switch (cardNumber1){
    case 11: 
        number1= "jack";
        break;
    case 12: 
        number1= "queen";
        break;
    case 13: 
        number1= "king";
        break;
    case 14: 
        number1= "ace";
        break;
    default:
        number1= Integer.toString(cardNumber1);
        break;
}
//prints information of the second card
System.out.println("You picked " + number1 + " of " + suit1);

//randomly picks a third card
int cardNumber2= (int)(Math.random()*13) + 1;
int suitNumber2= (int)(Math.random()*4) + 1;

//creates string
String number2 = ""; //tells the number of the card, 1-king
String suit2 = ""; //tells which suit the card is

//finds the suit of the third card
if (suitNumber2==1){
    suit2= "diamonds";
}
else if (suitNumber==2){
    suit2= "hearts";
}
else if (suitNumber==3){
    suit2= "clubs";
}
else{
    suit2="spades";
}

//finds the real number of the third card
switch (cardNumber2){
    case 11: 
        number2= "jack";
        break;
    case 12: 
        number2= "queen";
        break;
    case 13: 
        number2= "king";
        break;
    case 14: 
        number2= "ace";
        break;
    default:
        number2= Integer.toString(cardNumber2);
        break;
}
//prints information of the third card
System.out.println("You picked " + number2 + " of " + suit2);

//randomly picks the fourth card
int cardNumber3= (int)(Math.random()*13) + 1;
int suitNumber3= (int)(Math.random()*4) + 1;

//creates string for fourth card
String number3 = ""; //tells the number of the card, 1-king
String suit3 = ""; //tells which suit the card is

//finds the suit of the fourth card
if (suitNumber3==1){
    suit3= "diamonds";
}
else if (suitNumber3==2){
    suit3= "hearts";
}
else if (suitNumber3==3){
    suit3= "clubs";
}
else{
    suit3="spades";
}

//finds the real number of the fourth card
switch (cardNumber3){
    case 11: 
        number3= "jack";
        break;
    case 12: 
        number3= "queen";
        break;
    case 13: 
        number3= "king";
        break;
    case 14: 
        number3= "ace";
        break;
    default:
        number3= Integer.toString(cardNumber3);
        break;
}

//prints the fourth's card information
System.out.println("You picked " + number3 + " of " + suit3);

//randomly picks a fifth card
int cardNumber4= (int)(Math.random()*13) + 1;
int suitNumber4= (int)(Math.random()*4) + 1;

//creates string
String number4 = ""; //tells the number of the card, 1-king
String suit4 = ""; //tells which suit the card is

//finds the suit of the fifth card
if (suitNumber4==1){
    suit4= "diamonds";
}
else if (suitNumber4==2){
    suit4= "hearts";
}
else if (suitNumber4==3){
    suit4= "clubs";
}
else{
    suit4="spades";
}

//finds the real number of the fifth card
switch (cardNumber4){
    case 11: 
        number4= "jack";
        break;
    case 12: 
        number4= "queen";
        break;
    case 13: 
        number4= "king";
        break;
    case 14: 
        number4= "ace";
        break;
    default:
        number4= Integer.toString(cardNumber4);
        break;
}
//prints infortmation of the fifth card
System.out.println("You picked " + number4 + " of " + suit4);

//integer for number of pairs we have
int pair=0;

if (cardNumber==cardNumber1){
    pair=pair+1;
}
 if (cardNumber==cardNumber2){
    pair=pair+1;
} 
if (cardNumber==cardNumber3){
     pair=pair+1;
}  
if (cardNumber==cardNumber4){
     pair=pair+1;
} 
 if (cardNumber1==cardNumber2){
     pair=pair+1;
} 
 if (cardNumber1==cardNumber3){
     pair=pair+1;
} 
if (cardNumber1==cardNumber4){
     pair=pair+1;
}  
if (cardNumber2==cardNumber3){
     pair=pair+1;
} 
 if (cardNumber2==cardNumber4){
     pair=pair+1;
}  
 if (cardNumber3==cardNumber4){
        pair= pair+1;
}

if(pair==0){
    System.out.println("You have a high card hand!");
}
else if (pair==1){
    System.out.println("You have a pair!");
}
else if (pair==2){
    System.out.println("You have two pairs!");
}
else if (pair==3){
    System.out.println("You have a triple!");
}
else if (pair==4){
    System.out.println("You have four of a kind!");
}
else if (pair==5){
    System.out.println("You have five of a kind!!!!!");
}
    }
}