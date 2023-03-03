import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
	
	Coche alcoche=new Coche();//instanciar una clase
	System.out.println(alcoche.dimeruedas());
	
	System.out.println(alcoche.dimeLargo());
	
	System.out.println(alcoche.dimeAncho());
	
	System.out.println(alcoche.dimeMotor());
	
	System.out.println(alcoche.dimePeso());
	
	alcoche.estableceColor();
	System.out.println(alcoche.dimeColor());
	
	
	
	
}
}
