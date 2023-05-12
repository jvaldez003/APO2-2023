
public class Lanzadera extends Nave {
	
	public Lanzadera(String nombre, int peso ,int capacidad, int potencia, int empuje) {
		super(nombre, empuje, peso, capacidad, potencia);
		this.nombre=nombre;
		this.capacidad=capacidad;
		this.peso=peso;
		this.potencia=potencia;
		//this.tipoDeNave=tipoDeNave;
		this.empuje=empuje;
	
	}


	@Override
	public String crearNave() {
		// TODO Auto-generated method stub
		return  " nombre: "+ nombre +  "peso"  + peso + " potencia" + potencia
				+ " empuje: " + empuje + " capacidad" + capacidad;
	}

	@Override
	public String clasificarNave() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String propulsion() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
