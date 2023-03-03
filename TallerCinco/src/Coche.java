import java.util.Scanner;


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
 
 
 
 public String dimeruedas() {
	 
	 return "este coche tiene:" + ruedas + " ruedas.";
 }
 
 public String dimeLargo() { //metodo Getter
	 
 return "el largo del coche es " + largo; 
 }
 
public String dimeAncho() {
	 
	 return "el ancho del coche es: " + ancho;
 }

public String dimeMotor() {
	 
	 return "el motor del carro es de: " + motor;
}

public String dimePeso() {
	 
	 return "el peso de la base del coche es: " + peso;
}

 public void estableceColor() {//metodo Setter
	 color="Azul";
	  
 }
 public String dimeColor() {
	 return "el color del carro es: " + color;
 }
 
 
 
 
}
