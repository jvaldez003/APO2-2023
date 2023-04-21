import java.util.Scanner;
import java.lang.String;
public class PuntoUno {
Scanner sc = new Scanner (System.in);
String frase;

public void digitarFrase() {
	System.out.println("digite una frase");
	frase= sc.nextLine();
	char [] array = frase.toCharArray();
	//System.out.println(array);
	for(int i=0; i<frase.length();i++) {
		//array[i]= (char) frase.length();
		System.out.println(array[i]);
	}
}
	
	
}
//char[] array;
	//array = new char[frase.length()];