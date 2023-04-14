import java.util.Scanner;
public class Estudiante {
Scanner sc=new Scanner(System.in);
	String nombre;
	float creditos;
	float promedioPonderado;
	float puntosCalidad;
	
	public  Estudiante(){
		nombre="";
		creditos=14;
		puntosCalidad=46;
		
	}
	
	public float promedioPonderado(float promedio) {
		try {
     promedio= puntosCalidad/creditos;
     promedioPonderado= promedio;	
				
	}catch(Exception e) {
		System.out.println("el denominador no puede ser 0");
	}
		System.out.println("el promedio ponderado actual es;");
		return promedioPonderado;
	}
	
	public void actualizarDatos(float credito, float puntosCalidad, float promedio) {
		
		System.out.println("actuelice sus creditos");
		credito=sc.nextFloat();
		System.out.println("actuelice sus puntos de calidad");
		puntosCalidad=sc.nextFloat();
		
		//credito=12;
		//puntosCalidad=12;		
		
		this.creditos=credito;
		this.puntosCalidad=puntosCalidad;
		promedio= puntosCalidad/credito;
		this.promedioPonderado=promedio;
		
		System.out.println("su promedio ponderado actualizado es:" +  promedioPonderado);	
	}
	
	public void setNameMaryJones() {
		this.nombre="MaryJones";	
	}
	
	public String getNameMaryjones() {
	System.out.println("Nombre");
		return nombre;
	}
	
	public float getCreditosMaryJones() {
		this.creditos=14;
		System.out.println("Creditos");
		return creditos;
	}
	public float getPuntosCalidadMaryJones() {
		this.puntosCalidad=46;
		System.out.println("Puntos De Calidad");
		return puntosCalidad ;
	}
	
	
	
	public void setNameJohnStiner() {
		this.nombre="JohnStiner";	
	}
	
	
	public String getNameJohnStiner() {
	System.out.println("Nombre");
		return nombre;
	}
	
	public float getCreditosJohnStiner() {
		System.out.println("Creditos");
		this.creditos=60;
		return creditos;
	}
	public float getPuntosCalidadJohnStiner() {
		this.puntosCalidad=173;
		System.out.println("Puntos De Calidad");
		return puntosCalidad;
	}
	
	 
	
	public void setNameAriSamala() {
		this.nombre="AriSamala";	
	}
	
	
	public String getNameAriSamala() {
	System.out.println("Nombre");
		return nombre;
	}
	
	public float getCreditosAriSamala() {
		System.out.println("Creditos");
		this.creditos=31;
		return creditos;
	}
	public float getPuntosCalidadAriSamala() {
		this.puntosCalidad=69;
		System.out.println("Puntos De Calidad");
		return puntosCalidad;
	}
	
	public float getCreditosAriSamalaSuma(int suma, float resultSuma) {
		this.creditos=31;
		suma=13;
		resultSuma= creditos+suma;
		creditos=resultSuma;
		System.out.println("Agregando 13 creditos ha AriSamala");
		return creditos;
	}
	public float getPuntosCalidadAriSamalaSuma(int suma, float resultSuma) {
		this.puntosCalidad=69;
		suma=52;
		resultSuma= puntosCalidad+suma;
		puntosCalidad=resultSuma;
		System.out.println("Agregando 52 puntos ha AriSamala");
		return puntosCalidad;
	}
		
}

