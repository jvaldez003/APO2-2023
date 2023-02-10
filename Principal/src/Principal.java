import java.util.Scanner;

public class Principal {
	
	
	
	public static void main(String[] args) {
		System.out.println("ingrese la palabra");
		Scanner sc = new Scanner(System.in);
		
		String prueba = sc.next();
		System.out.println("la cantidad de lestras que tiene la palabra es:" + prueba.toUpperCase());
		
	}
	
	

}
