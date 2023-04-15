
public class Furgoneta extends Coche{
  
	private int capacidadCarga;
	private int plazasExtra;
	
	public Furgoneta(int plazasExtras, int capcidadCarga) {
		super(); // llamar al contrucotr de la clase padre
		this.capacidadCarga=capcidadCarga;
		this.plazasExtra=plazasExtras;
	}
	
	public String dimeDatosFurgoneta() {
		
		return "la capacidad de carga es: " + capacidadCarga + "las plazas son: " + plazasExtra;
	}
}
