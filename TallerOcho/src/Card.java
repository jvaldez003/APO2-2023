import java.util.Scanner;
public class Card {
	int totalPoints = 0;
     static int numCards = 2;
    int limitPuntos = 21;
    int limitCartas = 5;
    String opcionAgregarCarta = "s";
    Card[] mano = new Card[numCards];
    
    Scanner sc= new Scanner (System.in);
	String suit,name;
	int points;
	Card(int n1, int n2){
	suit = getSuit(n1);
	name = getName(n2);
	points = getPoints(name);
	
	}
	public String toString(){
	 return "The " + name + " of " + suit;
	}
	public String getName(int i){
	if(i == 1) return "Ace";
	if(i == 2) return "Two";
	if(i == 3) return "Three";
	if(i == 4) return "Four";
	if(i == 5) return "Five";
	if(i == 6) return "Six";
	if(i == 7) return "Seven";
	if(i == 8) return "Eight";
	if(i == 9) return "Nine";
	if(i == 10) return "Ten";
	if(i == 11) return "Jack";
	if(i == 12) return "Queen";
	if(i == 13) return "King";
	return "error";
	}
	public int getPoints(String n){
	if(n == "Jack" ||n == "Queen" ||n == "King"||n == "Ten")
	 return 10;
	if(n == "Two")
	 return 2;
	if(n == "Three")
	 return 3;
	if(n == "Four")
	 return 4;
	if(n == "Five")
	 return 5;
	if(n == "Six")
	 return 6;
	if(n == "Seven")
	 return 7;
	if(n == "Eight")
	 return 8;
	if(n == "Nine")
	 return 9;
	if(n == "Ace")
	return 1;
	return -1;
		}
		public String getSuit(int i){
		if(i == 1) return "Diamonds";
		if(i == 2) return "Clubs";
		if(i == 3) return "Spades";
		if(i == 4) return "Hearts";
		return "error";
		}
		
 public void puntoSieteOcho() {
	
	 Card[] mano = new Card[numCards];

     // Obtener las dos primeras cartas
     for (int i = 0; i < numCards; i++) {
         int suitNumber = (int)(Math.random()*4.0+1);
         int faceNumber = (int)(Math.random()*13.0+1);
         Card newCard = new Card(suitNumber,faceNumber);
         mano[i] = newCard;
         totalPoints += newCard.points;
         System.out.println("Tu carta " + (i+1) + " es: " + newCard);
     }
     System.out.println("Total de puntos en la mano: " + totalPoints);
     
     int limitPuntos = 21;
     int limitCartas = 5;
      String opcionAgregarCarta = "s";
      while (opcionAgregarCarta.equals("s") && totalPoints < limitPuntos && numCards < limitCartas) {
         System.out.println("¿Quieres otra carta? (s/n)");
          opcionAgregarCarta = sc.nextLine();
          if (opcionAgregarCarta.equals("s")) {
              int suitNumber = (int)(Math.random()*4.0+1);
              int faceNumber = (int)(Math.random()*13.0+1);
              Card newCard = new Card(suitNumber,faceNumber);
              mano = agregarCarta(mano, newCard, numCards);
              totalPoints += newCard.points;
              System.out.println("Tu nueva carta es: " + newCard);
              System.out.println("Total de puntos en la mano: " + totalPoints);
              numCards++;
          }
      }
}
 
 public static Card[] agregarCarta(Card[] mano, Card cartaNueva,int numcards) {
     Card[] nuevaMano = new Card[numCards + 1];
     for (int i = 0; i < numCards; i++) {
         nuevaMano[i] = mano[i];
     }
     nuevaMano[numCards] = cartaNueva;
     return nuevaMano;
 }
 
}
		
	
