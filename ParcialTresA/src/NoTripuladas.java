
public class NoTripuladas extends Nave {
public NoTripuladas(String nombre, int peso ,int capacidad, int potencia, int empuje) {
	super(nombre, empuje, peso, capacidad, potencia);
}

@Override
public String crearNave() {
	// TODO Auto-generated method stub
	return " nombre: "+ nombre +  "peso"  + peso + " potencia" + potencia
			+ " empuje: " + empuje + " capacidad" + capacidad;
}

@Override
public String clasificarNave() {
	// TODO Auto-generated method stub
	return null;
}
public String propulsion() {
	// TODO Auto-generated method stub
	return null;
}





}
