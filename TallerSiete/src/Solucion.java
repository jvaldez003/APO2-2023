import java.util.Scanner;
public class Solucion {
	
	
	
	public void puntpoUno() {
		String str = "Hello World!" ;
		for(int i = 0; i < 4; i++)
		{
		System.out.println(str);
		}
	}
	
	public void puntoTres() { 
		Scanner sc = new Scanner(System.in);
		int areaTriangulo;
		int base;
		int altura;
		int multiplicacion;
		int denominador = 0;
		try {
			System.out.println("digite el valor de la base");
			base = sc.nextInt();
			System.out.println("digite el valor de la altura");
			altura = sc.nextInt();
			multiplicacion = base * altura;
			areaTriangulo = multiplicacion / denominador;
			System.out.println("el resultado es:" + areaTriangulo);

		} catch (Exception e) {
			System.out.println("el denominador no puede ser cero deber se igual a 2");

		}
		
		
	}
	
	public void PcuatroA() {
		int num=0;
		
		//R// un erros de sintaxis podria ser for(for (int i=1; i<= 10  i++) sin el punto y coma 
		//que separa la copndicion del contador el programa no se ejecutara. en el trabajo escrito
		//copie este codigo con el error de sintaxis.
		for (int i=1; i<= 10 ; i++) {
			
			System.out.println(i);
			num++;
		}
		System.out.println();
	}
	
	public void PcuatroB() {
		
		// error de logica
		// imprimir los numeros del 1 al 10
		// en el siguiente coigo existe un error de logica ya que para imprimir los numeros del 1 al 10 
		// la variable i declarada dentro del for tiene que ser igual a 1 ya que si se deja inicializada
		// en 0 va a empezar a imprimir desde el 0 hasta el 10 y lo que se desea es que imprima los numeros
		//del 1 al 10.
		
	int num=0;
		
		for (int i=0; i<= 10 ; i++) {
			
			System.out.println(i);
			num++;
		}
		
	}
	
public void PcuatroC() {
	
	
	int num1= 40;
    int num2 = 0;
    try {
      int result = num1 / num2;
      System.out.println("Resultado: " + result);
    } catch (ArithmeticException e) {
      System.out.println("no es posible dividir entre cero");
    }

	

}
	
		
	}
	
	
	
	

