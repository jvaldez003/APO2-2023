import java.util.Scanner;
public class PuntoDos {
	public void puntouno(){
		Scanner sc= new Scanner (System.in);
		
		double 	x, exponente=5, resultadoPunto;
		System.out.println("Para el punto a)");
		System.out.println("a) Digite el valor de la variable x ");
		x=sc.nextDouble();
		double resultadoExpo=Math.pow(x, exponente);
		resultadoPunto=Math.sqrt(resultadoExpo-6)/4;
		System.out.println("a) el resultado de la operacion A es:"+resultadoPunto);
	}
	public void puntodos(){
		Scanner sc= new Scanner (System.in);
		double 	x, y;
		System.out.println("Para el punto b)");
		System.out.println("b) Digite el valor de la variable x ");
		x=sc.nextDouble();
		System.out.println("b) Digite el valor de la variable y ");
		y=sc.nextDouble();
		double resultadoExpo=Math.pow(x, y)- Math.pow(6, x);
		System.out.println("b) el resultado de la operacion B es:"+resultadoExpo);
	}
	public void puntores(){
	Scanner sc= new Scanner (System.in);
	double x, z, exponente=2;
	System.out.println("Para el punto c)");
	System.out.println("c) Digite el valor de la variable x ");
	x=sc.nextDouble();
	System.out.println("c) Digite el valor de la variable Z ");
	z=sc.nextDouble();
	double resultado;
	double resultadoCoseno= Math.cos(z/5);
	double resultadoExponente=Math.pow(x, exponente);
	double anguloEnRadianesSeno= Math.toRadians(resultadoExponente);
	double anguloEnRadianesCos= Math.toRadians(resultadoCoseno);
	
	resultado= 4*Math.cos(anguloEnRadianesCos)- Math.sin(anguloEnRadianesSeno);
	System.out.println("c) el resultado de la operacion numero C es:"+resultado);		
}
	
	public void puntocuatro() {
		Scanner sc= new Scanner (System.in);
		double exponente1=4, x, y, exponente2=3;
		double resultado;
		System.out.println("Para el punto d)");
		System.out.println("d) Digite el valor de x ");
		x=sc.nextDouble();
		System.out.println("d) Digite el valor de y ");
		y=sc.nextDouble();
		double resultadoRestaRaiz= 6*x- Math.pow(y, exponente2);
		resultado= Math.pow(x,  exponente1)- Math.sqrt(resultadoRestaRaiz);
		
		System.out.println("d) el resultado de la operacion D es:"+ resultado);	
	}
	
	public void puntoseis() {
		Scanner sc= new Scanner (System.in);
		double x;
		System.out.println("Para el punto f)");
		System.out.println("f) Digite el valor de x \n");
		x=sc.nextDouble();
		double resultado= 7*Math.cos(Math.sqrt(5-Math.sin(Math.sqrt(3*x-4))));
		System.out.println("f) el resultado de la operacion F es:"+ resultado);
	
	}
	
	public void puntocinco() {
	double x=2, y=4;
	System.out.println("Para el punto e)");
	
	double resultado= 1/(y-1/x-Math.pow(2, y));
	System.out.println("el resultado de la operacion e es:"+ resultado);
	}
	
	
}
