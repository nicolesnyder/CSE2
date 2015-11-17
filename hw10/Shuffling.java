//Nicole Snyder
//CSE002 
//hw10 Shuffling
//Basically, you will be given a deck of 52 cards, represented by the 
//array cards of Strings. You will have to print out all the cards in 
//the deck, shuffle the whole deck of cards, then print out the cards
//in the deck, all shuffled, then pick out a hand (pick randomly 5 cards 
// of deck) and print them out. This is not complicated at all.



import java.util.Scanner;

public class Shuffling{ //define the class
    public static void main(String[] args){ 
        Scanner myScanner=new Scanner (System.in);
        
	    //suits club, heart, spade or diamond
        String[] suitNames={"C","H","S","D"}; //suits
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"}; //card number
        String[] cards = new String[52]; //52 cards in a deck
        String[] hand = new String[5]; //5 cards in a hand
        for (int i=0; i<52; i++){ //for loop for the 52 cards in the deck
            cards[i]=rankNames[i%13]+suitNames[i/13]; 
            System.out.print(cards[i]+" ");
        }
        System.out.println();
        
        System.out.println("Shuffled");
        shuffle(cards); //shuffles the cards
        printArray(cards); //prints the order of the deck after shuffled
        hand = randomizeHand(cards); //draws a random hand
        System.out.println("Random hand");
        printArray(hand); //prints the hand
    }//end of main method
    
    public static void printArray(String[] array){//create method for printing each element
        int size=array.length; //measures the size of the array
        for(int i=0; i<size; i++){ //for loop for printing the elements
            System.out.print(array[i]+ " "); //prints element with a space
        }
        System.out.println();
    }
    
    public static void shuffle(String[] array){ //this method shuffles the cards
        int size=array.length; //measures the size of the array
        int value;
        String cards="";
        for(int j=0; j<size; j++){
            value=(int)(Math.random()*52); //randomly generates the cards
            cards=array[j%52];
            array[j%52]=array[value];
            array[value]=cards;
        }
    }//end shuffle method
    
    public static String []randomizeHand(String[] array){//this method picks out 5 cards for a hand
        String [] pick= new String [5]; //strings 5 picks
        int value;
        for(int k=0; k<5; k++){ //for loop to pick 5 cards
            value=(int)(Math.random()*(52-k)); //randomly picks 5 cards
            pick[k]=array[value];
            array[value]=array[51-k];
        }
        return pick;
    }//end method randomizeHand
}


