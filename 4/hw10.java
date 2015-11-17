public class hw10{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
	//suits club, heart, spade or diamond
    String[] suitNames={"C","H","S","D"};   
    String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
    String[] cards = new String[52];
    String[] hand = new String[5];
    for (int i=0; i<52; i++){
        cards[i]=rankNames[i%13]+suitNames[i/13];
        System.out.print(cards[i]+" ");
    }
    printArray(cards);
    shuffle(cards);
    printArray(cards);
    hand = randomizeHand(cards);
    printArray(hand);
    }
    
    public static void printArray(String [] cards){
        int size=cards.length;
        int value;
        String cards= " ";
    
    public static void shuffle(String [] cards){
        for(int i=0; i<cards.length; i++){
            cards[i]=
        }
    }
