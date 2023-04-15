
public class Coche {
	private int ruedas;
	 private int largo, ancho;
	 private int motor;
	 private int peso;
	 String color;
	 int pesoTotal;
	 boolean asientosCuero, climatizador;
	 
	 
	 
	 public Coche() {
		 ruedas=4;
		 largo=2000;
		 ancho=300;
		 motor=1600;
		 peso=500;
		 
		 
	 }
	 
	 public String dimeDatosGenrales() {
		 
		 return "la plataforma del vehiculo tiene: " + ruedas + "ruedas" + "mide:" + largo/100 +
				 "metros con un ancho de" + ancho + "cm y peso de la plataforma de: " + peso +
				 "kg";
	 }
	 
	 public void estableceColor(String color) {
		 this.color=color;
		 
	 }
	 
	 public void configuraAsientos(String asientosCuero) {
		 if(asientosCuero.equalsIgnoreCase("si")) {
			 this.asientosCuero=true;
			 
		 }else {
			 this.asientosCuero=false;
		 }
		 
	 }
	 
	 public String dimeAsientosCuero() {
		 if(asientosCuero==true) {
			 return "El coche tiene asientos de cuero";
		 }else {
			 return "El coche tiene asientos de serie";
		 }
		 
	 }
	 
	 
	 public String dimeruedas() { //metodo Getter
		 
		 return "este coche tiene:" + ruedas + " ruedas.";
	 }
	 
	 public String dimeLargo() { //metodo Getter
		 
	 return "el largo del coche es " + largo; 
	 }
	 
	public String dimeAncho() { //metodo Getter
		 
		 return "el ancho del coche es: " + ancho;
	 }

	public String dimeMotor() { //metodo Getter
		 
		 return "el motor del carro es de: " + motor;
	}

	public String dimePeso() { //metodo Getter
		 
		 return "el peso de la base del coche es: " + peso;
	}

	 public String dimeColor() { //metodo Getter
		 return "el color del carro es: " + color;
	 }
	 
}
