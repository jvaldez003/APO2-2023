import java.util.Scanner;
public class Empleados {
String nombre;
String seccion;
int id;
static int idSiguiente=1;
	public Empleados(String nom) {
     nombre= nom;
     seccion= "Administracion";
     id= idSiguiente;
     idSiguiente++;
     
	}
	
	public void cambiaDeSeccion(String seccion) {
		this.seccion=seccion;
	}
	public String devolverDatos() {
		return "el nombre es:" + nombre + "la seccion es:" + seccion + " el Id es: " + id;
	}
	
	public static String dameIdSiguiente() {
		
		return "El Id siguiente es:" + idSiguiente;
	}
	
	 
}
