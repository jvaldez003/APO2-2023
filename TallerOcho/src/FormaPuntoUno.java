
public class FormaPuntoUno {
int numSides;
boolean regular;

public FormaPuntoUno(){
	numSides=50;
	regular= false;
	
}
public FormaPuntoUno(int numSides, boolean regular ){
this.numSides = numSides;
this.regular =regular;
}
public int getNumSides() {
    return numSides;
}

public void setNumSides(int numSides) {
    this.numSides = numSides;
    System.out.println("numSides:" + numSides);
}

// Métodos getter y setter para regular
public boolean isRegular() {
    return regular;
}

public void setRegular(boolean regular) {
    this.regular = regular;
    System.out.println("regular es:" + regular);
}




		
}
