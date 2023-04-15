import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Empleados uno= new Empleados("Felipe");
		Empleados dos= new Empleados("Maickol");
		Empleados tres= new Empleados("Laura");
		Empleados cuatro= new Empleados("Maria");
		
		uno.cambiaDeSeccion("RRHH");
		
		System.out.println(uno.devolverDatos() +  "\n" + dos.devolverDatos() +  "\n" + tres.devolverDatos() 
		+ "\n" + cuatro.devolverDatos());
		
		System.out.println(Empleados.dameIdSiguiente());
		
		
		
		Coche alcoche=new Coche();//instanciar una clase
		System.out.println(alcoche.dimeruedas());
		
		System.out.println(alcoche.dimeLargo());
		
		System.out.println(alcoche.dimeAncho());
		
		System.out.println(alcoche.dimeMotor());
		
		System.out.println(alcoche.dimePeso());
		
		alcoche.estableceColor("Amarillo");
		Furgoneta mifurgoneta1= new Furgoneta(7, 8);
		mifurgoneta1.dimeColor();
		mifurgoneta1.configuraAsientos("si");
		
		System.out.println(alcoche.dimeDatosGenrales()+ "" + alcoche.dimeColor());
		System.out.println(mifurgoneta1.dimeDatosGenrales() + "" + mifurgoneta1.dimeDatosFurgoneta());
		
		
	}
}
