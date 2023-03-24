import java.util.Scanner;
public class Deck {
	Scanner sc= new Scanner(System.in);
	Card[] cardArray = new Card[52];
	 int suits;
	 int cardType;
	 int cardCount;
	Deck(){ //constructor
	  suits = 4;
	  cardType = 13;
	  cardCount = 0;
	 for(int i = 1; i <= suits; i++)
	 for(int j = 1; j <= cardType; j++){
	 cardArray[cardCount] = new Card(i,j);
	 cardCount++;
	 }
	 }
	public void print(){
		for(int i = 0; i < cardArray.length; i++)
		System.out.println(cardArray[i]);
		System.out.println("");
		}
	
}
