import java.util.Scanner;
public class AreaDeTriangulo {

	public void calculararea(){
		Scanner sc = new Scanner (System.in);
		double areaTriangulo;
		double base;
		double altura;
		
		System.out.println("digite el valor de la base");
		base= sc.nextDouble();
		System.out.println("digite el valor de la altura");
		altura= sc.nextDouble();
		
		 areaTriangulo=(base*altura)/2;
		
		 System.out.println("el valor de la superficie es"+ areaTriangulo);
		
		
		
		
		
	}
	
}
