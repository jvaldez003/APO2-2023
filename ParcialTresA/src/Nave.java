
public abstract class Nave {
	static String  nombre;
	static int peso;
	static int capacidad;
	static int potencia;
	static String tipoDeNave;
	static int orbita;
	static int empuje;
	
	public Nave(String nombre, int peso ,int capacidad, int potencia, int empuje  ){
		
	}
	
	public abstract String crearNave();
	public abstract String clasificarNave();
	public abstract String propulsion();
	
	
	
	
}
