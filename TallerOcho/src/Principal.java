import java.util.Scanner;

public class Principal {
	 static int totalPoints;
	  static int numCards = 2;
	  static int totalPuntos;
	 static int opc;
	  static Card[] mano = new Card[numCards];
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	
	FormaPuntoUno forma = new FormaPuntoUno();
	System.out.println(forma.getNumSides());
	 forma.setNumSides(45);
	 System.out.println(forma.isRegular());
	 forma.setRegular(true);
	 
	Estudiante estu= new Estudiante();
	System.out.println(estu.promedioPonderado(0));
	estu.actualizarDatos(0, 0, 0);
	
	Estudiante maryJones= new Estudiante();
	maryJones.setNameMaryJones();
	System.out.println(maryJones.getNameMaryjones());
	System.out.println(maryJones.getCreditosMaryJones());
	System.out.println(maryJones.getPuntosCalidadMaryJones());
	
	Estudiante johnStiner= new Estudiante();
	johnStiner.setNameJohnStiner();
	System.out.println(johnStiner.getNameJohnStiner());
	System.out.println(johnStiner.getCreditosJohnStiner());
	System.out.println(johnStiner.getPuntosCalidadJohnStiner());
	
	
    Estudiante ariSamala= new Estudiante();
    ariSamala.setNameAriSamala();
    System.out.println(ariSamala.getNameAriSamala());
	System.out.println(ariSamala.getCreditosAriSamala());
	System.out.println(ariSamala.getPuntosCalidadAriSamala());
	System.out.println(ariSamala.getCreditosAriSamalaSuma(0, 0));
	System.out.println(ariSamala.getPuntosCalidadAriSamalaSuma(0, 0));
	
	Animal animal = new Animal();
	System.out.println(animal.getTime(0));
	System.out.println( animal.getWeight());
	System.out.println( animal.getHeight());
	System.out.println( animal.getSpeed());
	
	Animal leopardo = new Animal();
	System.out.println("para el Leopardo");
	System.out.println(leopardo.getTiemeLeopardo(12));
	System.out.println(leopardo.getWeightLeopardo());
	System.out.println(leopardo.getHeightLeopardo());
	System.out.println(leopardo.getSpeedLeopardo());
	
	Animal leon= new Animal();
	System.out.println("para el Leon");
	System.out.println(leon.getTiemeLeon(10));
	System.out.println(leon.getWeightLeon());
	System.out.println(leon.getHeightLeon());
	System.out.println(leon.getSpeedLeon());
	
	 Card a= new Card(numCards, totalPoints);
	 a.puntoSieteOcho();   
}
}
