import java.util.Scanner;
public class Autobus {
public void registroautobus() {
		int nuemeroPersonas;
		int result;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("registre el numero de personas que viajan");
		nuemeroPersonas=sc.nextInt();
		
		if(nuemeroPersonas<=45) {
			System.out.println("se utilizara un solo bus");	
		}
		else {
			result=nuemeroPersonas-45;
			System.out.println("la cantidad de personas que se iran en furgonetas son:"+ result);
			
		}
		
		
		
	}
}
