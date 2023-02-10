import java.util.Scanner;

public class Principal {
	
	
	
	public static void main(String[] args) {
		System.out.println(contarpalabras());
	}
	public static String contarpalabras() {
		System.out.println("ingrese la palabra");
		Scanner sc = new Scanner(System.in);
		
		String prueba = sc.next();
		return "la cantidad de lestras que tiene la palabra es:".concat(prueba.toUpperCase());
		
		
		
		
	}
	
	

}
